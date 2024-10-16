package net.sen.sensfantasycraft.common.registry;

import com.google.common.base.Preconditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class SensFantasyCraftTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) { return TagKey.create(Registries.BLOCK, ModUtils.getModPath(name)); }
    }
    public static class Items {
        public static TagKey<Item> COMBAT_SLASH = createTag("combat_slash");
        public static TagKey<Item> COMBAT_PIERCE = createTag("combat_pierce");
        public static TagKey<Item> COMBAT_BLUNT = createTag("combat_blunt");

        public static TagKey<Item> WEAPON_SPEARS = createTag("weapon_spears");
        public static TagKey<Item> WEAPON_TRIDENTS = createTag("weapon_tridents");
        public static TagKey<Item> WEAPON_MACES = createTag("weapon_maces");
        public static TagKey<Item> WEAPON_HAMMERS = createTag("weapon_hammers");
        public static TagKey<Item> WEAPON_WAR_HAMMERS = createTag("weapon_war_hammers");
        public static TagKey<Item> WEAPON_WAR_AXES = createTag("weapon_war_axes");
        public static TagKey<Item> WEAPON_GREATSWORDS = createTag("weapon_greatswords");
        public static TagKey<Item> WEAPON_KNIFES = createTag("weapon_knifes");
        public static TagKey<Item> WEAPON_POLES = createTag("weapon_poles");
        public static TagKey<Item> WEAPON_TWIN_BLADES = createTag("weapon_twin_blades");
        public static TagKey<Item> WEAPON_CLUBS = createTag("weapon_clubs");
        public static TagKey<Item> WEAPON_SCYTHES = createTag("weapon_scythes");
        public static TagKey<Item> WEAPON_FOILS = createTag("weapon_foils");
        public static TagKey<Item> WEAPON_KATANA = createTag("weapon_katana");
        public static TagKey<Item> WEAPON_FLAILS = createTag("weapon_flails");
        public static TagKey<Item> WEAPON_PIKES = createTag("weapon_pikes");

        private static TagKey<Item> createTag(String name) { return TagKey.create(Registries.ITEM, ModUtils.getModPath(name)); }
    }
    public static class EntityTypes {
        private static TagKey<EntityType<?>> createTag(String name) { return TagKey.create(Registries.ENTITY_TYPE, ModUtils.getModPath(name)); }
    }
    public static class Biomes {
        private static TagKey<Biome> createTag(String name) { return TagKey.create(Registries.BIOME, ModUtils.getModPath(name)); }
    }

    /* Code By BluSunrize
     * https://github.com/BluSunrize/ImmersiveEngineering/blob/1.19.2/src/api/java/blusunrize/immersiveengineering/api/IETags.java#L36
     * */

    private static final Map<TagKey<Block>, TagKey<Item>> toItemTag = new HashMap<>();

    static {

    }

    public static TagKey<Item> getItemTag(TagKey<Block> blockTag)
    {
        Preconditions.checkArgument(toItemTag.containsKey(blockTag));
        return toItemTag.get(blockTag);
    }

    public static void forAllBlocktags(BiConsumer<TagKey<Block>, TagKey<Item>> out)
    {
        for(Map.Entry<TagKey<Block>, TagKey<Item>> entry : toItemTag.entrySet())
            out.accept(entry.getKey(), entry.getValue());
    }
}
