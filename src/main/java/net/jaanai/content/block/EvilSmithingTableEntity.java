package net.jaanai.content.block;

import net.jaanai.content.screen.EvilSmithingTableScreenHandler;
import net.jaanai.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;

public class EvilSmithingTableEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(10, ItemStack.EMPTY);

    public EvilSmithingTableEntity() {
        super(BlockRegistry.EVIL_SMITHING_TABLE_ENTITY);
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new EvilSmithingTableScreenHandler(syncId, playerInventory, this);
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public void fromTag(BlockState state, NbtCompound tag) {
        super.fromTag(state, tag);
        Inventories.readNbt(tag, this.inventory);
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.inventory);
        return nbt;
    }
}
