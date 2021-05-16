package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import io.ncbpfluffybear.fluffymachines.FluffyMachines;
import io.ncbpfluffybear.fluffymachines.items.Barrel;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;


public class FluffyItems {

    private FluffyItems() {
    }

    // Category
    public static final Category fluffymachines = new Category(new NamespacedKey(FluffyMachines.getInstance(),
        "fluffymachines"),
        new CustomItem(Material.SMOKER, "&6Fluffy機器")
    );

    public static final Category fluffybarrels = new Category(new NamespacedKey(FluffyMachines.getInstance(),
        "fluffybarrels"),
        new CustomItem(Material.BARREL, "&6Fluffy桶子")
    );

    public static final SlimefunItemStack FLUFFYMACHINES_INFO = new SlimefunItemStack("FLUFFYMACHINES_INFO",
        Material.ORANGE_WOOL,
        "&6&l關於FluffyMachines",
        "",
        "&e" + FluffyMachines.getInstance().getName() + " " + FluffyMachines.getInstance().getPluginVersion(),
        "",
        "&e左點擊&7獲得百科頁連結",
        "&e右點擊&7獲得問題官方匯報連結"
    );

    // Barrels
    public static final SlimefunItemStack SMALL_FLUFFY_BARREL = new SlimefunItemStack("SMALL_FLUFFY_BARREL",
        Material.BEEHIVE,
        "&e小型桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.SMALL_BARREL_SIZE + "件"
    );

    public static final SlimefunItemStack MEDIUM_FLUFFY_BARREL = new SlimefunItemStack("MEDIUM_FLUFFY_BARREL",
        Material.BARREL,
        "&6中型桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.MEDIUM_BARREL_SIZE + "件"
    );

    public static final SlimefunItemStack BIG_FLUFFY_BARREL = new SlimefunItemStack("BIG_FLUFFY_BARREL",
        Material.SMOKER,
        "&b大型桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.BIG_BARREL_SIZE + "件"
    );

    public static final SlimefunItemStack LARGE_FLUFFY_BARREL = new SlimefunItemStack("LARGE_FLUFFY_BARREL",
        Material.LODESTONE,
        "&a特大桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.LARGE_BARREL_SIZE + "件"
    );

    public static final SlimefunItemStack MASSIVE_FLUFFY_BARREL = new SlimefunItemStack("MASSIVE_FLUFFY_BARREL",
        Material.CRYING_OBSIDIAN,
        "&5鉅大桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.MASSIVE_BARREL_SIZE + "件"
    );

    public static final SlimefunItemStack BOTTOMLESS_FLUFFY_BARREL = new SlimefunItemStack("BOTTOMLESS_FLUFFY_BARREL",
        Material.RESPAWN_ANCHOR,
        "&c無限桶子",
        "",
        "&7可容納大量單一物品",
        "&c請勿使用爆破性工具...",
        "&c否則會刪除內裡所有物品",
        "",
        "&b容量: &e" + Barrel.BOTTOMLESS_BARREL_SIZE + "件"
    );

    // Portable Chargers
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack("SMALL_PORTABLE_CHARGER",
        Material.BRICK,
        "&e小型流動充電器",
        "",
        "&7就是有電的流動充電器",
        "",
        "&e充電率: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity)
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack("MEDIUM_PORTABLE_CHARGER",
        Material.IRON_INGOT,
        "&6中型流動充電器",
        "",
        "&7就是有電的流動充電器",
        "",
        "&e充電率: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity)
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack("BIG_PORTABLE_CHARGER",
        Material.GOLD_INGOT,
        "&a大型流動充電器",
        "",
        "&7就是有電的流動充電器",
        "",
        "&e充電率: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity)
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack("LARGE_PORTABLE_CHARGER",
        Material.NETHER_BRICK,
        "&2特大流動充電器",
        "",
        "&7就是有電的流動充電器",
        "",
        "&e充電率: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity)
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
        "CARBONADO_PORTABLE_CHARGER",
        Material.NETHERITE_INGOT,
        "&4碳纖維流動充電器",
        "",
        "&7就是有電的流動充電器",
        "",
        "&e充電率: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
        LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity)
    );

    // Items
    public static final SlimefunItemStack ANCIENT_BOOK = new SlimefunItemStack("ANCIENT_BOOK",
        Material.BOOK,
        "&6遠古書籍",
        "",
        "&7用於 &c進階附魔分離器",
        "",
        "&6&o內含集中的力量"
    );
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack("HELICOPTER_HAT",
        Material.LEATHER_HELMET, Color.AQUA,
        "&1直升機帽",
        "",
        "&7brrrrrrrrRRRRRRRR",
        "",
        "&e按著SHIFT&7使用"
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack("WATERING_CAN",
        new CustomItem(SkullItem.fromHash("6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e")),
        "&b噴壺",
        "",
        "&f給植物澆灌",
        "",
        "&7> &e右按水源&7把噴壺灌滿.",
        "&7> &e右按植物&7加速成長.",
        "&7> &e右按玩家&7讓他們減速.",
        "",
        "&a可用: &e0"
    );
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_EXTRACTION_NODE",
        new CustomItem(SkullItem.fromHash("e707c7f6c3a056a377d4120028405fdd09acfcd5ae804bfde0f653be866afe39")),
        "&6終界箱提取口",
        "",
        "&7放置在終界箱旁可連接&5終界箱",
        "",
        "&7這可以把它面前的&5終界箱&7內的物品",
        "&7移送到它後面的&6箱子"
    );
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE = new SlimefunItemStack(
        "ENDER_CHEST_INSERTION_NODE",
        new CustomItem(SkullItem.fromHash("7e5dc50c0186d53381d9430a2eff4c38f816b8791890c7471ffdb65ba202bc5")),
        "&b終界箱投入口",
        "",
        "&7放置在終界箱旁可連接&5終界箱",
        "",
        "&7這可以把它面前的&5終界箱&7內的物品",
        "&7移送到它後面的&6箱子"
    );
    // Machines
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack("AUTO_CRAFTING_TABLE",
        Material.CRAFTING_TABLE,
        "&6自動合成檯",
        "",
        "&7自動合成&f原始&7合成表",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCraftingTable.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCraftingTable.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack("AUTO_ANCIENT_ALTAR",
        Material.ENCHANTING_TABLE,
        "&5自動古老祭壇",
        "",
        "&7自動合成&f古老祭壇&7合成表",
        "",
        LoreBuilderDynamic.powerBuffer(AutoAncientAltar.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoAncientAltar.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack("AUTO_TABLE_SAW",
        Material.STONECUTTER,
        "&6自動台鋸",
        "",
        "&7自動合成&6台鋸&7合成表",
        "",
        LoreBuilderDynamic.powerBuffer(AutoTableSaw.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoTableSaw.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack("WATER_SPRINKLER",
        new CustomItem(SkullItem.fromHash("d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85"),
            "Water Sprinkler"),
        "&b灑水器",
        "",
        "&7Sprinkly sprinkly",
        "",
        LoreBuilderDynamic.powerBuffer(WaterSprinkler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(WaterSprinkler.ENERGY_CONSUMPTION) + "/植物"
    );
    public static final SlimefunItemStack ITEM_OVERSTACKER = new SlimefunItemStack("ITEM_OVERSTACKER",
        Material.PISTON,
        "&e物品堆疊機",
        "",
        "&7壓縮不能堆疊的物品"
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack("GENERATOR_CORE",
        Material.BLAST_FURNACE,
        "&7發電機核心",
        "",
        "&7發電機的多重方塊組件"
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack("CRANK_GENERATOR",
        Material.BLAST_FURNACE,
        "&7曲柄發電機",
        "",
        "&e右擊&7槓桿產生電力",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack("FOUNDRY",
        Material.BLAST_FURNACE,
        "&c熔鍊鑄造廠",
        "",
        "&e溶化及存放礦粉和礦錠",
        "&7最大存放 138,240 顆礦粉(等於40個大箱子)",
        "",
        Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack("BACKPACK_UNLOADER",
        Material.BROWN_STAINED_GLASS,
        "&e背包卸貨機",
        "",
        "&7清空背包內的物品",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackUnloader.CAPACITY),
        LoreBuilderDynamic.powerPerTick(BackpackUnloader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack("BACKPACK_LOADER",
        Material.ORANGE_STAINED_GLASS,
        "&e背包裝載機",
        "",
        "&7從身上移動物品到背包",
        "",
        LoreBuilderDynamic.powerBuffer(BackpackLoader.CAPACITY),
        LoreBuilderDynamic.powerPerTick(BackpackLoader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
        "UPGRADED_EXPLOSIVE_PICKAXE",
        Material.DIAMOND_PICKAXE,
        "&e&l升級版爆炸鎬",
        "",
        "&7破壞前方5x5區域的方塊"
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack("UPGRADED_EXPLOSIVE_SHOVEL",
        Material.DIAMOND_SHOVEL,
        "&e&l升級版爆炸鏟",
        "",
        "&7鏟走前方5x5區域的方塊"
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
        "FIREPROOF_RUNE",
        new ColoredFireworkStar(Color.fromRGB(255, 165, 0),
            "&7遠古符文 &8&l[&c&l防火&8&l]",
            "",
            "&e把這符文扔在地上的物件",
            "&e可令那物件變成&c防火",
            ""
        ));
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack("SUPERHEATED_FURNACE",
        Material.BLAST_FURNACE,
        "&c熔鍊鑄造廠",
        "",
        "&7多方塊合成的鑄造廠",
        "&c必須用於建築鑄造廠",
        "&c請勿使用爆破性工具!"
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack("AUTO_MAGIC_WORKBENCH",
        Material.BOOKSHELF,
        "&6自動魔法合成檯",
        "",
        "&7自動合成&6魔法合成檯&7的合成表",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack("AUTO_ARMOR_FORGE",
        Material.SMITHING_TABLE,
        "&7自動盔甲鍛造檯",
        "",
        "&7自動合成&6盔甲鍛造檯&7的合成表",
        "",
        LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack ADVANCED_AUTO_DISENCHANTER = new SlimefunItemStack(
        "ADVANCED_AUTO_DISENCHANTER",
        Material.ENCHANTING_TABLE,
        "&c進階附魔分離器",
        "",
        "&7把物件的指定附魔移除",
        "&7需要&6遠古書籍&7來運行",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedAutoDisenchanter.CAPACITY),
        LoreBuilderDynamic.powerPerTick(AdvancedAutoDisenchanter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack("SCYTHE",
        Material.IRON_HOE,
        "&e大鐮刀",
        "",
        "&7一次收割5顆植物"
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack("UPGRADED_LUMBER_AXE",
        Material.DIAMOND_AXE,
        "&6&lUpgraded Lumber Axe",
        "",
        "&7Chops down an entire tree at once",
        "&72 block reach and works on diagonal blocks too"
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack("DOLLY",
        Material.MINECART,
        "&b手推車",
        "",
        "&7右擊把箱子拿起來",
        "",
        "&7ID: <ID>"
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack("WARP_PAD",
        Material.SMOKER,
        "&6傳送台",
        "",
        "&7在這傳送台上按&e按著SHIFT",
        "&7便可以傳送到目的地的傳送台",
        "",
        "&7使用傳送台設定器連接傳送台"
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack("WARP_PAD_CONFIGURATOR",
        Material.BLAZE_ROD,
        "&6傳送台設定器",
        "",
        "&e按著SHIFT+右擊 &7在傳送台上設為目的地",
        "&e右擊&7在傳送台上設為起點",
        "",
        "&e已連按目的地位置: &7無"
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack("ELECTRIC_DUST_FABRICATOR",
        Material.BLAST_FURNACE,
        "&6電力礦物加工器",
        "",
        "&7碎礦,篩礦及洗礦4合1機器",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(10),
        LoreBuilderDynamic.powerBuffer(ElectricDustFabricator.CAPACITY),
        LoreBuilderDynamic.powerPerTick(ElectricDustFabricator.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack("ELECTRIC_DUST_RECYCLER",
        Material.IRON_BLOCK,
        "&f電動礦物回收器",
        "",
        "&7回收碎礦為篩礦",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.speed(1),
        LoreBuilderDynamic.powerBuffer(ElectricDustRecycler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(ElectricDustRecycler.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ALTERNATE_ELEVATOR_PLATE = new SlimefunItemStack("ALTERNATE_ELEVATOR_PLATE",
        Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
        "&3備用電梯板",
        "",
        "&f把電梯板放到每一層",
        "&f你就可以在樓層間穿梭.",
        "",
        "&e右擊電梯板&7更改名稱",
        "&7這版本改用箱子介面(原版用書本介面)"
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack("FLUFFY_WRENCH",
// <<<<<<< HEAD
//         Material.GOLDEN_AXE,
//         "&6Fluffy扳手",
// =======
        FluffyWrench.Wrench.DEFAULT.getMaterial(),
        "&6Fluffy Wrench",
// >>>>>>> upstream/master
        "",
        "&7可以快速移除貨運連接管道",
        "&7及電力組件",
        "",
        "&e左擊&7/&e右擊 &7相應的物件把它移除"
    );

    public static final SlimefunItemStack REINFORCED_FLUFFY_WRENCH =
        new SlimefunItemStack("REINFORCED_FLUFFY_WRENCH",
        FluffyWrench.Wrench.REINFORCED.getMaterial(),
        "&bReinforced Fluffy Wrench",
        "",
        "&7Used to quickly remove Slimefun cargo nodes",
        "&7and electricity components",
        "",
        "&eLeft&7/&eRight Click &7a compatible block to break it"
    );

    public static final SlimefunItemStack CARBONADO_FLUFFY_WRENCH =
        new SlimefunItemStack("CARBONADO_FLUFFY_WRENCH",
        FluffyWrench.Wrench.CARBONADO.getMaterial(),
        "&7Carbonado Fluffy Wrench",
        "",
        "&7Used to quickly remove Slimefun cargo nodes",
        "&7and electricity components",
        "",
        "&eLeft&7/&eRight Click &7a compatible block to break it",
        "",
        LoreBuilder.powerCharged(0, FluffyWrench.Wrench.CARBONADO.getMaxCharge())
    );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack("PAXEL",
        Material.DIAMOND_PICKAXE,
        "&bPaxel",
        "",
        "&7鎬子,斧頭及鏟子三合一工具!"
    );

    public static final SlimefunItemStack ADVANCED_CHARGING_BENCH = new SlimefunItemStack(
        "ADVANCED_CHARGING_BENCH",
        Material.SMITHING_TABLE,
        "&cAdvanced Charging Bench",
        "",
        "&7Charges items",
        "&7Can be upgraded using an &6ACB Upgrade Card"
    );

    public static final SlimefunItemStack ACB_UPGRADE_CARD = new SlimefunItemStack(
        "ACB_UPGRADE_CARD",
        Material.PAPER,
        "&6ACB Upgrade Card",
        "",
        "&eRight Click &7onto an &cAdvanced Charging Bench",
        "",
        "&6Charge Speed &a+" + AdvancedChargingBench.CHARGE + "J",
        "&6Capacity &a+" + AdvancedChargingBench.CAPACITY +"J",
        "&6Energy Consumption &c+" + AdvancedChargingBench.ENERGY_CONSUMPTION + "J"
    );

    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        SMALL_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        MEDIUM_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        BIG_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        LARGE_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
        CARBONADO_PORTABLE_CHARGER.addEnchantment(glowEnchant, 1);
    }
}
