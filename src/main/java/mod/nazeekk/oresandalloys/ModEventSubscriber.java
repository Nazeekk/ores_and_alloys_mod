package mod.nazeekk.oresandalloys;

import mod.nazeekk.oresandalloys.init.ModBlocks;
import mod.nazeekk.oresandalloys.init.ModItemTier;
import mod.nazeekk.oresandalloys.init.MyModItemGroups;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber(modid = OresAndAlloys.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_ingot"),
                setup(new Item(new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_ingot"),
                setup(new BlockItem(ModBlocks.ALUMINIUM_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_ore"),
                setup(new BlockItem(ModBlocks.CHROMIUM_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_ore"),
                setup(new BlockItem(ModBlocks.COPPER_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_ore"),
                setup(new BlockItem(ModBlocks.LEAD_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_ore"),
                setup(new BlockItem(ModBlocks.MANGANESE_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_ore"),
                setup(new BlockItem(ModBlocks.NICKEL_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_ore"),
                setup(new BlockItem(ModBlocks.PLATINUM_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_ore"),
                setup(new BlockItem(ModBlocks.SILVER_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_ore"),
                setup(new BlockItem(ModBlocks.TIN_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_ore"),
                setup(new BlockItem(ModBlocks.TITANIUM_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_ore"),
                setup(new BlockItem(ModBlocks.ZINC_ORE, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_ore"),
                setup(new ShovelItem(ModItemTier.ALUMINIUM, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_shovel"),
                setup(new ShovelItem(ModItemTier.BRONZE, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_shovel"),
                setup(new ShovelItem(ModItemTier.CHROMIUM, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_shovel"),
                setup(new ShovelItem(ModItemTier.CONSTANTAN, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_shovel"),
                setup(new ShovelItem(ModItemTier.COPPER, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_shovel"),
                setup(new ShovelItem(ModItemTier.LEAD, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_shovel"),
                setup(new ShovelItem(ModItemTier.MANGANESE, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_shovel"),
                setup(new ShovelItem(ModItemTier.NICHROME, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_shovel"),
                setup(new ShovelItem(ModItemTier.NICKEL, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_shovel"),
                setup(new ShovelItem(ModItemTier.PLATINUM, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_shovel"),
                setup(new ShovelItem(ModItemTier.SILVER, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_shovel"),
                setup(new ShovelItem(ModItemTier.TIN, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_shovel"),
                setup(new ShovelItem(ModItemTier.TITANIUM, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_shovel"),
                setup(new ShovelItem(ModItemTier.ZINC, 1.5F, -3.0F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_shovel"),
                setup(new AxeItem(ModItemTier.ALUMINIUM, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_axe"),
                setup(new AxeItem(ModItemTier.BRONZE, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_axe"),
                setup(new AxeItem(ModItemTier.CHROMIUM, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_axe"),
                setup(new AxeItem(ModItemTier.CONSTANTAN, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_axe"),
                setup(new AxeItem(ModItemTier.COPPER, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_axe"),
                setup(new AxeItem(ModItemTier.LEAD, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_axe"),
                setup(new AxeItem(ModItemTier.MANGANESE, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_axe"),
                setup(new AxeItem(ModItemTier.NICHROME, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_axe"),
                setup(new AxeItem(ModItemTier.NICKEL, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_axe"),
                setup(new AxeItem(ModItemTier.PLATINUM, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_axe"),
                setup(new AxeItem(ModItemTier.SILVER, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_axe"),
                setup(new AxeItem(ModItemTier.TIN, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_axe"),
                setup(new AxeItem(ModItemTier.TITANIUM, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_axe"),
                setup(new AxeItem(ModItemTier.ZINC, 6.0F, -3.1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_axe"),
                setup(new HoeItem(ModItemTier.ALUMINIUM, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_hoe"),
                setup(new HoeItem(ModItemTier.BRONZE, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_hoe"),
                setup(new HoeItem(ModItemTier.CHROMIUM, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_hoe"),
                setup(new HoeItem(ModItemTier.CONSTANTAN, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_hoe"),
                setup(new HoeItem(ModItemTier.COPPER, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_hoe"),
                setup(new HoeItem(ModItemTier.LEAD, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_hoe"),
                setup(new HoeItem(ModItemTier.MANGANESE, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_hoe"),
                setup(new HoeItem(ModItemTier.NICHROME, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_hoe"),
                setup(new HoeItem(ModItemTier.NICKEL, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_hoe"),
                setup(new HoeItem(ModItemTier.PLATINUM, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_hoe"),
                setup(new HoeItem(ModItemTier.SILVER, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_hoe"),
                setup(new HoeItem(ModItemTier.TIN, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_hoe"),
                setup(new HoeItem(ModItemTier.TITANIUM, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_hoe"),
                setup(new HoeItem(ModItemTier.ZINC, -2, -1F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_hoe"),
                setup(new PickaxeItem(ModItemTier.ALUMINIUM, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_pickaxe"),
                setup(new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_pickaxe"),
                setup(new PickaxeItem(ModItemTier.CHROMIUM, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_pickaxe"),
                setup(new PickaxeItem(ModItemTier.CONSTANTAN, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_pickaxe"),
                setup(new PickaxeItem(ModItemTier.COPPER, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_pickaxe"),
                setup(new PickaxeItem(ModItemTier.LEAD, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_pickaxe"),
                setup(new PickaxeItem(ModItemTier.MANGANESE, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_pickaxe"),
                setup(new PickaxeItem(ModItemTier.NICHROME, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_pickaxe"),
                setup(new PickaxeItem(ModItemTier.NICKEL, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_pickaxe"),
                setup(new PickaxeItem(ModItemTier.PLATINUM, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_pickaxe"),
                setup(new PickaxeItem(ModItemTier.SILVER, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_pickaxe"),
                setup(new PickaxeItem(ModItemTier.TIN, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_pickaxe"),
                setup(new PickaxeItem(ModItemTier.TITANIUM, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_pickaxe"),
                setup(new PickaxeItem(ModItemTier.ZINC, 1, -2.8F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_pickaxe"),
                setup(new SwordItem(ModItemTier.ALUMINIUM, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "aluminium_sword"),
                setup(new SwordItem(ModItemTier.BRONZE, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "bronze_sword"),
                setup(new SwordItem(ModItemTier.CHROMIUM, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "chromium_sword"),
                setup(new SwordItem(ModItemTier.CONSTANTAN, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "constantan_sword"),
                setup(new SwordItem(ModItemTier.COPPER, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "copper_sword"),
                setup(new SwordItem(ModItemTier.LEAD, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "lead_sword"),
                setup(new SwordItem(ModItemTier.MANGANESE, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "manganese_sword"),
                setup(new SwordItem(ModItemTier.NICHROME, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nichrome_sword"),
                setup(new SwordItem(ModItemTier.NICKEL, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "nickel_sword"),
                setup(new SwordItem(ModItemTier.PLATINUM, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "platinum_sword"),
                setup(new SwordItem(ModItemTier.SILVER, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "silver_sword"),
                setup(new SwordItem(ModItemTier.TIN, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "tin_sword"),
                setup(new SwordItem(ModItemTier.TITANIUM, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "titanium_sword"),
                setup(new SwordItem(ModItemTier.ZINC, 3, -2.4F, new Item.Properties().tab(MyModItemGroups.MOD_ITEM_GROUP)), "zinc_sword")
        );
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "aluminium_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "chromium_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "copper_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "lead_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "manganese_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "nickel_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "platinum_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "silver_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "tin_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "titanium_ore"),
                setup(new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).strength(3.0F, 3.0F)), "zinc_ore")
        );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(OresAndAlloys.MOD_ID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
