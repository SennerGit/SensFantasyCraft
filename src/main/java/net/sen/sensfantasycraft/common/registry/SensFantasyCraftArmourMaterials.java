package net.sen.sensfantasycraft.common.registry;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sensfantasycraft.SensFantasyCraft;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class SensFantasyCraftArmourMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, SensFantasyCraft.MODID);

//    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BRASS = createArmorMaterial("brass", 1, 5, 6, 2, 10, 1.0f, 0.0f, () -> Ingredient.of(ModItems.BRASS_INGOT_ITEM.get()));

    private static DeferredHolder<ArmorMaterial, ArmorMaterial> createArmorMaterial(String name, int bootDefence, int leggingsDefence, int chestplateDefence, int helmetDefence, int enchantmentValue, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
            map.put(ArmorItem.Type.BOOTS, bootDefence);
            map.put(ArmorItem.Type.LEGGINGS, leggingsDefence);
            map.put(ArmorItem.Type.CHESTPLATE, chestplateDefence);
            map.put(ArmorItem.Type.HELMET, helmetDefence);
        }), enchantmentValue, SoundEvents.ARMOR_EQUIP_IRON, ingredient, List.of(new ArmorMaterial.Layer(ModUtils.getModPath(name))), toughness, knockbackResistance));
    }

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }
}
