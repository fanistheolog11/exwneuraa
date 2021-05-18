package me.jagar.mindmappingandroidlibrary.Listeners;

import me.jagar.mindmappingandroidlibrary.Views.Item;

public interface OnItemClicked {
    void OnClick(Item item);
    Toast.makeText(MainActivity.this, "Title" + item, Toast.LENGTH_SHORT).show();
}
