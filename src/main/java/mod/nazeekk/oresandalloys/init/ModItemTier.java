package mod.nazeekk.oresandalloys.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    ALUMINIUM(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.ALUMINIUM_INGOT);
    }),
    BRONZE(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.BRONZE_INGOT);
    }),
    CHROMIUM(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.CHROMIUM_INGOT);
    }),
    CONSTANTAN(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.CONSTANTAN_INGOT);
    }),
    COPPER(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.COPPER_INGOT);
    }),
    LEAD(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.LEAD_INGOT);
    }),
    MANGANESE(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.MANGANESE_INGOT);
    }),
    NICHROME(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.NICHROME_INGOT);
    }),
    NICKEL(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.NICKEL_INGOT);
    }),
    PLATINUM(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.PLATINUM_INGOT);
    }),
    SILVER(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.SILVER_INGOT);
    }),
    TIN(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.TIN_INGOT);
    }),
    TITANIUM(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.TITANIUM_INGOT);
    }),
    ZINC(3, 150, 4f, 12f, 10, () -> {
        return Ingredient.of(ModItems.ZINC_INGOT);
    });









    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
