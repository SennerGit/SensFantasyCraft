package net.sen.sensfantasycraft.common.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sensfantasycraft.common.items.tools.MaceItem;
import net.sen.sensfantasycraft.common.items.tools.TridentItem;
import net.sen.sensfantasycraft.common.util.ModUtils;
import net.sen.sensfantasycraft.common.items.armours.*;
import net.sen.sensfantasycraft.common.items.tools.*;

import java.util.function.Supplier;

public class SensFantasyCraftItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    /*
    VANILLA ADDONS
     */
    //Wood
    public static final Supplier<Item> WOODEN_CLUB = createClub("wooden_club", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_FLAIL = createFlail("wooden_flail", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_FOIL = createFoil("wooden_foil", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_GREATSWORD = createGreatsword("wooden_greatsword", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_HAMMER = createHammer("wooden_hammer", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_KATANA = createKatana("wooden_katana", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_KNIFE = createKnife("wooden_knife", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_MACE = createMace("wooden_mace", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_PIKE = createPike("wooden_pike", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_POLE = createPole("wooden_pole", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_SCYTHE = createScythe("wooden_scythe", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_SPEAR = createSpear("wooden_spear", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_TRIDENT = createTrident("wooden_trident", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_TWIN_BLADE = createTwinBlade("wooden_twin_blade", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_WAR_AXE = createWarAxe("wooden_war_axe", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> WOODEN_WAR_HAMMER = createWarHammer("wooden_war_hammer", Tiers.WOOD, 7.0f, -3.4f, Rarity.COMMON);
    
    //Stone
    public static final Supplier<Item> STONE_CLUB = createClub("stone_club", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_FLAIL = createFlail("stone_flail", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_FOIL = createFoil("stone_foil", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_GREATSWORD = createGreatsword("stone_greatsword", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_HAMMER = createHammer("stone_hammer", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_KATANA = createKatana("stone_katana", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_KNIFE = createKnife("stone_knife", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_MACE = createMace("stone_mace", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_PIKE = createPike("stone_pike", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_POLE = createPole("stone_pole", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_SCYTHE = createScythe("stone_scythe", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_SPEAR = createSpear("stone_spear", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_TRIDENT = createTrident("stone_trident", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_TWIN_BLADE = createTwinBlade("stone_twin_blade", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_WAR_AXE = createWarAxe("stone_war_axe", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> STONE_WAR_HAMMER = createWarHammer("stone_war_hammer", Tiers.STONE, 7.0f, -3.4f, Rarity.COMMON);
    
    //Iron
    public static final Supplier<Item> IRON_CLUB = createClub("iron_club", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_FLAIL = createFlail("iron_flail", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_FOIL = createFoil("iron_foil", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_GREATSWORD = createGreatsword("iron_greatsword", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_HAMMER = createHammer("iron_hammer", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_KATANA = createKatana("iron_katana", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_KNIFE = createKnife("iron_knife", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_MACE = createMace("iron_mace", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_PIKE = createPike("iron_pike", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_POLE = createPole("iron_pole", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_SCYTHE = createScythe("iron_scythe", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_SPEAR = createSpear("iron_spear", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_TRIDENT = createTrident("iron_trident", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_TWIN_BLADE = createTwinBlade("iron_twin_blade", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_WAR_AXE = createWarAxe("iron_war_axe", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> IRON_WAR_HAMMER = createWarHammer("iron_war_hammer", Tiers.IRON, 7.0f, -3.4f, Rarity.COMMON);
    
    //Gold
    public static final Supplier<Item> GOLDEN_CLUB = createClub("golden_club", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_FLAIL = createFlail("golden_flail", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_FOIL = createFoil("golden_foil", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_GREATSWORD = createGreatsword("golden_greatsword", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_HAMMER = createHammer("golden_hammer", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_KATANA = createKatana("golden_katana", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_KNIFE = createKnife("golden_knife", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_MACE = createMace("golden_mace", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_PIKE = createPike("golden_pike", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_POLE = createPole("golden_pole", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_SCYTHE = createScythe("golden_scythe", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_SPEAR = createSpear("golden_spear", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_TRIDENT = createTrident("golden_trident", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_TWIN_BLADE = createTwinBlade("golden_twin_blade", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_WAR_AXE = createWarAxe("golden_war_axe", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> GOLDEN_WAR_HAMMER = createWarHammer("golden_war_hammer", Tiers.GOLD, 7.0f, -3.4f, Rarity.COMMON);
    
    //Diamond
    public static final Supplier<Item> DIAMOND_CLUB = createClub("diamond_club", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_FLAIL = createFlail("diamond_flail", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_FOIL = createFoil("diamond_foil", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_GREATSWORD = createGreatsword("diamond_greatsword", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_HAMMER = createHammer("diamond_hammer", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_KATANA = createKatana("diamond_katana", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_KNIFE = createKnife("diamond_knife", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_MACE = createMace("diamond_mace", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_PIKE = createPike("diamond_pike", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_POLE = createPole("diamond_pole", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_SCYTHE = createScythe("diamond_scythe", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_SPEAR = createSpear("diamond_spear", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_TRIDENT = createTrident("diamond_trident", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_TWIN_BLADE = createTwinBlade("diamond_twin_blade", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_WAR_AXE = createWarAxe("diamond_war_axe", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> DIAMOND_WAR_HAMMER = createWarHammer("diamond_war_hammer", Tiers.DIAMOND, 7.0f, -3.4f, Rarity.COMMON);
    
    //Netherite
    public static final Supplier<Item> NETHERITE_CLUB = createClub("netherite_club", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_FLAIL = createFlail("netherite_flail", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_FOIL = createFoil("netherite_foil", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_GREATSWORD = createGreatsword("netherite_greatsword", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_HAMMER = createHammer("netherite_hammer", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_KATANA = createKatana("netherite_katana", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_KNIFE = createKnife("netherite_knife", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_MACE = createMace("netherite_mace", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_PIKE = createPike("netherite_pike", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_POLE = createPole("netherite_pole", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_SCYTHE = createScythe("netherite_scythe", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_SPEAR = createSpear("netherite_spear", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_TRIDENT = createTrident("netherite_trident", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_TWIN_BLADE = createTwinBlade("netherite_twin_blade", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_WAR_AXE = createWarAxe("netherite_war_axe", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);
    public static final Supplier<Item> NETHERITE_WAR_HAMMER = createWarHammer("netherite_war_hammer", Tiers.NETHERITE, 7.0f, -3.4f, Rarity.COMMON);

    private static DeferredItem<Item> createItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    private static DeferredItem<Item> createShield(String name, int durability) {
        return ITEMS.register(name, () -> new ModShieldItem(durability));
    }
    private static DeferredItem<Item> createBoots(String name, Holder<ArmorMaterial> armorMaterial, int durability) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.BOOTS, new Item.Properties(), ArmorItem.Type.BOOTS.getDurability(durability)));
    }
    private static DeferredItem<Item> createLeggings(String name, Holder<ArmorMaterial> armorMaterial, int durability) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.LEGGINGS, new Item.Properties(), ArmorItem.Type.LEGGINGS.getDurability(durability)));
    }
    private static DeferredItem<Item> createChestplate(String name, Holder<ArmorMaterial> armorMaterial, int durability) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.CHESTPLATE, new Item.Properties(), ArmorItem.Type.CHESTPLATE.getDurability(durability)));
    }
    private static DeferredItem<Item> createHelmet(String name, Holder<ArmorMaterial> armorMaterial, int durability) {
        return ITEMS.register(name, () -> new ModItemArmours(armorMaterial, ArmorItem.Type.HELMET, new Item.Properties(), ArmorItem.Type.HELMET.getDurability(durability)));
    }
    private static DeferredItem<Item> createSword(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ModSwordItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createHoe(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ModHoeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createShovel(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ModShovelItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createAxe(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ModAxeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createPickaxe(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ModPickaxeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createClub(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ClubItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createFlail(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new FlailItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createFoil(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new FoilItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createGreatsword(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new GreatswordItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createHammer(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new HammerItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createKatana(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new KatanaItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createKnife(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new KnifeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createMace(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new MaceItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createPike(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new PikeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createPole(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new PoleItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createScythe(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new ScytheItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createSpear(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new SpearItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createTrident(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new TridentItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createTwinBlade(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new TwinBladeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createWarAxe(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new WarAxeItem(tier, attackDamage, attackSpeed, rarity));
    }
    private static DeferredItem<Item> createWarHammer(String name, Tier tier, float attackDamage, float attackSpeed, Rarity rarity) {
        return ITEMS.register(name, () -> new WarHammerItem(tier, attackDamage, attackSpeed, rarity));
    }

    private static <T extends Item> DeferredItem<T> createItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
