package com.arun.inventory.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.inventory.entities.Item;
import com.arun.inventory.entities.Shop;

@RestController
public class ItemController {

//	private Item[] items;
//	Shop app = new Shop(items);

	Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20), new Item("Aged Brie", 2, 0),
			new Item("Elixir of the Mongoose", 5, 7), new Item("Sulfuras", 0, 80),
			new Item("Concert Backstage passes", 15, 20), };
	Shop app = new Shop(items);

	@RequestMapping("/")
	public String getMessage() {
		return "Hello, World";
	}

	@RequestMapping("/items/{days}")
	public Item[] getAllItems(@PathVariable("days") int days) {
		for (int i = 0; i <= days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println();
			app.updateQuality();
		}
		return app.items;
	}
}
