package io.ncbpfluffybear.fluffymachines.items.tools;

import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.core.attributes.HologramOwner;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import io.ncbpfluffybear.fluffymachines.FluffyMachines;
import io.ncbpfluffybear.fluffymachines.utils.FluffyItems;
import io.ncbpfluffybear.fluffymachines.utils.Utils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.protection.ProtectableAction;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class WarpPadConfigurator extends SlimefunItem implements HologramOwner, Listener {

    private final NamespacedKey xCoord = new NamespacedKey(FluffyMachines.getInstance(), "xCoordinate");
    private final NamespacedKey yCoord = new NamespacedKey(FluffyMachines.getInstance(), "yCoordinate");
    private final NamespacedKey zCoord = new NamespacedKey(FluffyMachines.getInstance(), "zCoordinate");
    private final NamespacedKey world = new NamespacedKey(FluffyMachines.getInstance(), "world");

    private static final int LORE_COORDINATE_INDEX = 4;
    private final ItemSetting<Integer> MAX_DISTANCE = new ItemSetting<>(this, "max-distance", 100);

    public WarpPadConfigurator(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);

        Bukkit.getPluginManager().registerEvents(this, FluffyMachines.getInstance());

        addItemSetting(MAX_DISTANCE);

    }

    @EventHandler
    private void onInteract(PlayerInteractEvent e) {

        if (e.getClickedBlock() == null || e.getHand() != EquipmentSlot.HAND) {
            return;
        }

        Block b = e.getClickedBlock();
        Player p = e.getPlayer();

        if (BlockStorage.hasBlockInfo(b) && BlockStorage.check(b) == FluffyItems.WARP_PAD.getItem()
            && SlimefunPlugin.getProtectionManager().hasPermission(p, b.getLocation(), ProtectableAction.PLACE_BLOCK)) {
            if (SlimefunUtils.isItemSimilar(p.getInventory().getItemInMainHand(), FluffyItems.WARP_PAD_CONFIGURATOR,
                false)) {

                ItemStack item = p.getInventory().getItemInMainHand();
                ItemMeta meta = item.getItemMeta();
                List<String> lore = meta.getLore();
                PersistentDataContainer pdc = meta.getPersistentDataContainer();

                if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {

                    // Destination
                    if (p.isSneaking()) {
                        pdc.set(world, PersistentDataType.STRING, b.getWorld().getName());

                        pdc.set(xCoord, PersistentDataType.INTEGER, b.getX());
                        pdc.set(yCoord, PersistentDataType.INTEGER, b.getY());
                        pdc.set(zCoord, PersistentDataType.INTEGER, b.getZ());
                        lore.set(LORE_COORDINATE_INDEX, ChatColor.translateAlternateColorCodes(
                            '&', "&e已連接傳送台的位置: &7" + b.getX() + ", " + b.getY() + ", " + b.getZ()));

                        meta.setLore(lore);
                        item.setItemMeta(meta);

                        updateHologram(b, "&a&l目的地");
                        BlockStorage.addBlockInfo(b, "type", "destination");
                        Utils.send(p, "&3這座傳送台已經設定為目的地並鎖定連繫到你的設定器");

                    // Origin
                    } else if (pdc.has(world, PersistentDataType.STRING) && b.getWorld().getName().equals(
                        pdc.get(world, PersistentDataType.STRING))) {
                        int x = pdc.getOrDefault(xCoord, PersistentDataType.INTEGER, 0);
                        int y = pdc.getOrDefault(yCoord, PersistentDataType.INTEGER, 0);
                        int z = pdc.getOrDefault(zCoord, PersistentDataType.INTEGER, 0);

                        if (Math.abs(x - b.getX()) > MAX_DISTANCE.getValue()
                            || Math.abs(z - b.getZ()) > MAX_DISTANCE.getValue()) {

                            Utils.send(p, "&c無法設定超過" + MAX_DISTANCE.getValue() + "格的距離!");

                            return;
                        }

                        registerOrigin(b, x, y, z);

                        Utils.send(p, "&3這座傳送台已經設定為&a起點&3,並複製了你的設定器內的設定.");

                    } else {

                        Utils.send(p, "&cShift+右點傳送台設定為目的地,然後右點另一座傳送台設定為起點!");
                    }

                }

            } else {
                Utils.send(p, "&c透過設定器設定這座傳送台.");
            }
        }
    }

    private void registerOrigin(Block b, int x, int y, int z) {
        BlockStorage.addBlockInfo(b, "type", "origin");

        BlockStorage.addBlockInfo(b, "x", String.valueOf(x));
        BlockStorage.addBlockInfo(b, "y", String.valueOf(y));
        BlockStorage.addBlockInfo(b, "z", String.valueOf(z));

        updateHologram(b, "&a&l起點");
    }
}
