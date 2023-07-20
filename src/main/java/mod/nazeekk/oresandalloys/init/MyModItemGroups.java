package mod.nazeekk.oresandalloys.init;

import mod.nazeekk.oresandalloys.OresAndAlloys;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

// Створення окремої групи моду
public class MyModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(OresAndAlloys.MOD_ID, () -> new ItemStack(ModItems.ALUMINIUM_INGOT));
}
