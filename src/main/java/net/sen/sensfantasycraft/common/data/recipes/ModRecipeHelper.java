package net.sen.sensfantasycraft.common.data.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.sen.sensfantasycraft.common.util.ModUtils;

import java.util.concurrent.CompletableFuture;

public abstract class ModRecipeHelper extends RecipeProvider {
    public ModRecipeHelper(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    protected final void stairsBlockRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("stairs/" + ModUtils.getItemLikeId(result)));

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("  #")
                .pattern(" ##")
                .pattern("###")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("stairs/" + ModUtils.getItemLikeId(result) + "_reverse"));
    }

    protected final void fenceBlockRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 6)
                .pattern("#X#")
                .pattern("#X#")
                .define('#', Ingredient.of(ingredient))
                .define('M', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("fence/" + ModUtils.getItemLikeId(result)));
    }

    protected final void fenceGateBlockRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern("X#X")
                .pattern("X#X")
                .define('#', Ingredient.of(ingredient))
                .define('M', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("fence_gate/" + ModUtils.getItemLikeId(result)));
    }

    protected final void smallCompressBlockRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 4)
                .pattern("##")
                .pattern("##")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("small_compress/small_compress_" + ModUtils.getItemLikeId(ingredient) + "_into_" + ModUtils.getItemLikeId(result)));
    }

    protected final void largeCompressBlockRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("large_compress/large_compress_" + ModUtils.getItemLikeId(ingredient) + "_into_" + ModUtils.getItemLikeId(result)));
    }

    protected final void breakdownCompressRecipe(RecipeOutput output, ItemLike result, ItemLike ingredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result, 9)
                .requires(ingredient)
                .unlockedBy("has_item", has(ingredient))
                .save(output, ModUtils.getModPath("breakdown/breakdown_" + ModUtils.getItemLikeId(ingredient) + "_into_" + ModUtils.getItemLikeId(result)));
    }

    protected final void helmetRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result, 1)
                .pattern("###")
                .pattern("# #")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("helmet/" + ModUtils.getItemLikeId(result)));
    }

    protected final void chestplateRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("chestplate/" + ModUtils.getItemLikeId(result)));
    }

    protected final void leggingsRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("leggings/" + ModUtils.getItemLikeId(result)));
    }

    protected final void bootsRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result, 1)
                .pattern("# #")
                .pattern("# #")
                .define('#', Ingredient.of(ingredient))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("boots/" + ModUtils.getItemLikeId(result)));
    }

    protected final void swordRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result, 1)
                .pattern("#")
                .pattern("#")
                .pattern("X")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("sword/" + ModUtils.getItemLikeId(result)));
    }

    protected final void pickaxeRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("###")
                .pattern(" X ")
                .pattern(" X ")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("pickaxe/" + ModUtils.getItemLikeId(result)));
    }

    protected final void axeRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("##")
                .pattern("#X")
                .pattern(" X")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("axe/" + ModUtils.getItemLikeId(result)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("##")
                .pattern("X#")
                .pattern("X ")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("axe/" + ModUtils.getItemLikeId(result) + "_reverse"));
    }

    protected final void shovelRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("#")
                .pattern("X")
                .pattern("X")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("shovel/" + ModUtils.getItemLikeId(result)));
    }

    protected final void shieldRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("X#X")
                .pattern("XXX")
                .pattern(" X ")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(ItemTags.PLANKS))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("shield/" + ModUtils.getItemLikeId(result)));
    }

    protected final void hoeRecipe(RecipeOutput output, ItemLike result,ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("##")
                .pattern(" X")
                .pattern(" X")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("hoe/" + ModUtils.getItemLikeId(result)));

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result, 1)
                .pattern("##")
                .pattern("X ")
                .pattern("X ")
                .define('#', Ingredient.of(ingredient))
                .define('X', Ingredient.of(Tags.Items.RODS_WOODEN))
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("hoe/" + ModUtils.getItemLikeId(result) + "_reverse"));
    }

    protected final void oreCookingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredients) {
        smeltingRecipe(output, result, ingredients, 0.1F);
        blastingRecipe(output, result, ingredients, 0.1F);

    }

    protected final void alloyCookingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredients) {
        blastingRecipe(output, result, ingredients, 0.1F);
    }

    protected final void smeltingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredient, float exp) {
        smeltingRecipe(output, result, ingredient, exp, 1);
    }

    protected final void smeltingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredient, float exp, int count) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(new ItemStack(ingredient, count)), RecipeCategory.MISC, result, exp, 200)
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("smelting/smelting_" + ModUtils.getItemLikeId(result) + "_with_" + ModUtils.getItemLikeId(ingredient)));
    }

    protected final void blastingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredient, float exp) {
        blastingRecipe(output, result, ingredient, exp, 1);
    }

    protected final void blastingRecipe(RecipeOutput output, ItemLike result, ItemLike ingredient, float exp, int count) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(new ItemStack(ingredient, count)), RecipeCategory.MISC, result, exp, 100)
                .unlockedBy("has_item", has(ingredient))
                .group(ModUtils.getItemLikeId(ingredient))
                .save(output, ModUtils.getModPath("blasting/blasting_" + ModUtils.getItemLikeId(result) + "_with_" + ModUtils.getItemLikeId(ingredient)));
    }

    protected final void makeAndBreakRecipe(RecipeOutput output, ItemLike compressed, ItemLike singleItem) {
        largeCompressBlockRecipe(output, compressed, singleItem);
        breakdownCompressRecipe(output, singleItem, compressed);
    }

    protected final void vanillaMetalRecipes(RecipeOutput output, ItemLike ingot, ItemLike dust, ItemLike refined_dust,
        ItemLike refined_sword, ItemLike refined_axe, ItemLike refined_shovel, ItemLike refined_pickaxe, ItemLike refined_hoe, ItemLike refined_shield, ItemLike refined_boots, ItemLike refined_leggings, ItemLike refined_chestplate, ItemLike refined_helmet) {
        oreCookingRecipe(output, ingot, dust);
    }

    protected final void metalRecipes(RecipeOutput output, ItemLike ore, ItemLike raw, ItemLike raw_block, ItemLike ingot, ItemLike metal_block, ItemLike nugget, ItemLike dust,
    ItemLike sword, ItemLike axe, ItemLike shovel, ItemLike pickaxe, ItemLike hoe, ItemLike shield, ItemLike boots, ItemLike leggings, ItemLike chestplate, ItemLike helmet) {
        oreCookingRecipe(output, ingot, ore);
        oreCookingRecipe(output, ingot, dust);
        oreCookingRecipe(output, ingot, raw);
        makeAndBreakRecipe(output, raw_block, raw);
        makeAndBreakRecipe(output, metal_block, ingot);
        makeAndBreakRecipe(output, ingot, nugget);
        swordRecipe(output, sword, ingot);
        axeRecipe(output, axe, ingot);
        shovelRecipe(output, shovel, ingot);
        pickaxeRecipe(output, pickaxe, ingot);
        hoeRecipe(output, hoe, ingot);
        shieldRecipe(output, shield, ingot);
        bootsRecipe(output, boots, ingot);
        leggingsRecipe(output, leggings, ingot);
        chestplateRecipe(output, chestplate, ingot);
        helmetRecipe(output, helmet, ingot);
    }

    protected final void metalRecipes(RecipeOutput output, ItemLike ore, ItemLike raw, ItemLike raw_block, ItemLike pure_raw, ItemLike pure_raw_block, ItemLike ingot, ItemLike metal_block, ItemLike refined_ingot, ItemLike refined_metal_block, ItemLike nugget, ItemLike refined_nugget, ItemLike dust, ItemLike refined_dust) {
        oreCookingRecipe(output, ingot, ore);
        oreCookingRecipe(output, ingot, dust);
        oreCookingRecipe(output, ingot, raw);
        oreCookingRecipe(output, refined_ingot, refined_dust);
        oreCookingRecipe(output, refined_ingot, pure_raw);
        makeAndBreakRecipe(output, raw_block, raw);
        makeAndBreakRecipe(output, pure_raw_block, pure_raw);
        makeAndBreakRecipe(output, metal_block, ingot);
        makeAndBreakRecipe(output, refined_metal_block, refined_ingot);
        makeAndBreakRecipe(output, ingot, nugget);
        makeAndBreakRecipe(output, refined_ingot, refined_nugget);
    }

    protected final void metalRecipes(RecipeOutput output, ItemLike ore, ItemLike raw, ItemLike raw_block, ItemLike ingot, ItemLike metal_block, ItemLike nugget, ItemLike dust) {
        oreCookingRecipe(output, ingot, ore);
        oreCookingRecipe(output, ingot, dust);
        oreCookingRecipe(output, ingot, raw);
        makeAndBreakRecipe(output, raw_block, raw);
        makeAndBreakRecipe(output, metal_block, ingot);
        makeAndBreakRecipe(output, ingot, nugget);
    }

    protected final void alloyRecipes(RecipeOutput output, ItemLike mix, ItemLike ingot, ItemLike metal_block, ItemLike nugget, ItemLike dust,
                                      ItemLike sword, ItemLike axe, ItemLike shovel, ItemLike pickaxe, ItemLike hoe, ItemLike shield, ItemLike boots, ItemLike leggings, ItemLike chestplate, ItemLike helmet) {
        alloyCookingRecipe(output, ingot, mix);
        alloyCookingRecipe(output, ingot, dust);
        makeAndBreakRecipe(output, metal_block, ingot);
        makeAndBreakRecipe(output, ingot, nugget);
        swordRecipe(output, sword, ingot);
        axeRecipe(output, axe, ingot);
        shovelRecipe(output, shovel, ingot);
        pickaxeRecipe(output, pickaxe, ingot);
        hoeRecipe(output, hoe, ingot);
        shieldRecipe(output, shield, ingot);
        bootsRecipe(output, boots, ingot);
        leggingsRecipe(output, leggings, ingot);
        chestplateRecipe(output, chestplate, ingot);
        helmetRecipe(output, helmet, ingot);
    }
}
