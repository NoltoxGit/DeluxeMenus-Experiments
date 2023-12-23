package com.extendedclip.deluxemenus.hooks;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface ItemHook {

  ItemStack getItem(@NotNull final String... arguments);
}
