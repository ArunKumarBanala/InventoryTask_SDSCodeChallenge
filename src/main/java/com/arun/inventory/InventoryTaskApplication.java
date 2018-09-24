package com.arun.inventory;

import java.util.Scanner;

/*import java.util.ArrayList;
import java.util.List;*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arun.inventory.entities.Item;
import com.arun.inventory.entities.Shop;

@SpringBootApplication
public class InventoryTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryTaskApplication.class, args);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of days:");
		int n =sc.nextInt();
		System.out.println("Items");
		System.out.println("--------------------");
//         List<Item> items = new ArrayList<Item> ();
      
		Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0), 
                new Item("Elixir of the Mongoose", 5, 7), 
                new Item("Sulfuras", 0, 80), 
                new Item("Concert Backstage passes", 15, 20),
		};
        Shop app = new Shop(items);
        app.updateQuality();
		 int days = n;
/*	        //if (args.length > 0) {
	            //days = Integer.parseInt(args[0]) + 1;*/
        for (int i = 0; i <=days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
	//}
  }
}
