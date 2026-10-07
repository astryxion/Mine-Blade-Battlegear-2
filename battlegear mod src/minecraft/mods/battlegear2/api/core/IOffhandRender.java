package mods.battlegear2.api.core;

import net.minecraft.item.ItemStack;

/**
 * Interface added to {@link net.minecraft.client.renderer.ItemRenderer} to support offhand rendering.
 * Note that they only provide access to added fields for the offhand, NOT the fields for the mainhand.
 * <p>
 * Method names are prefixed so they do not collide with Mixin accessors from mods such as Hodgepodge,
 * which add {@code setItemToRender} on the vanilla main-hand {@code itemToRender} field. Sharing that
 * name caused dual-wield updates to overwrite the real-hand item, hiding it in first person.
 *
 * @author GotoLink
 */
public interface IOffhandRender {

    ItemStack battlegear2$getOffHandItemToRender();

    void battlegear2$setOffHandItemToRender(ItemStack item);

    int battlegear2$getEquippedItemOffhandSlot();

    void battlegear2$setEquippedItemOffhandSlot(int slot);

    float battlegear2$getEquippedOffHandProgress();

    void battlegear2$setEquippedOffHandProgress(float progress);

    float battlegear2$getPrevEquippedOffHandProgress();

    void battlegear2$setPrevEquippedOffHandProgress(float progress);
}
