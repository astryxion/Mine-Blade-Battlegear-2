package mods.battlegear2.api.core;

import net.minecraft.item.ItemStack;

/**
 * GTNH / Angelica-compatible inventory API for offhand access.
 */
public interface IInventoryPlayerBattle {

    /**
     * GTNH / Angelica-compatible alias for {@link InventoryPlayerBattle#getCurrentOffhandWeapon()}.
     */
    ItemStack battlegear2$getCurrentOffhandWeapon();
}
