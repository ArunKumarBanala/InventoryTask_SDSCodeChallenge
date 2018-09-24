package com.arun.inventory.entities;


public class Shop {
	
	public Item[] items;

	public Shop() {
		
	}
    public Shop(Item[] items) {
        this.items = items;
    }

    public Item[] updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Concert Backstage passes")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Concert Backstage passes")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
            	 items[i].sellIn = 0;
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Concert Backstage passes")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
        return items;
    }
}







