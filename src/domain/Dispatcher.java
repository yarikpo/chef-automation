package domain;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Dispatcher {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		StorageProducts products = new StorageProducts();
		ProductType prod1 = new ProductType(
			"Potato",
			25,
			1200,
			new GregorianCalendar(2022, 2, 31)
		);
		ProductType prod2 = new ProductType(
			"Potato",
			25,
			2400,
			new GregorianCalendar(2022, 2, 31)
		);
		ProductType prod3 = new ProductType(
			"Tomato",
			13,
			900,
			new GregorianCalendar(2022, 2, 31)
		);
		ProductType prod4 = new ProductType(
			"Flour",
			2,
			1000, // 350
			new GregorianCalendar(2022, 2, 31)
		);
		ProductType prod5 = new ProductType(
			"Water",
			1,
			2000,
			new GregorianCalendar(2022, 8, 31)
		);
		products.addProduct(prod1); products.addProduct(prod2); products.addProduct(prod3); products.addProduct(prod4);
		products.addProduct(prod5);
		System.out.println(products);
		
		StorageRecipes recipes = new StorageRecipes();
		
		Recipe rec1 = new Recipe("Bread");
		Action act1 = new Action("Take");
		List<ProductType> flourProductsIngredients = new ArrayList<>();
		flourProductsIngredients.add(new ProductType(
			"Flour",
			2,
			200,
			null
		));
		Ingredient ing1 = new Ingredient("Flour", flourProductsIngredients);
		
		Action act2 = new Action("mix");
		List<ProductType> waterProductsIngredients = new ArrayList<>();
		waterProductsIngredients.add(new ProductType(
			"Water",
			1,
			250,
			null
		));
		Ingredient ing2 = new Ingredient("Water", waterProductsIngredients);
		
		Action act3 = new Action("burn");
		rec1.addAction(act1); rec1.addIngredient(ing1);
		rec1.addAction(act2); rec1.addIngredient(ing2);
		rec1.addAction(act3);
		
		recipes.addRecipe(rec1);
		
		Recipe rec2 = new Recipe("Pizza");
		Action act21 = new Action("take");
		List<ProductType> pastaProductsIngredients = new ArrayList<>();
		pastaProductsIngredients.add(new ProductType(
			"Water",
			1,
			100,
			null
		));
		pastaProductsIngredients.add(new ProductType(
			"Tomato",
			13,
			300,
			null
		));
		Ingredient ing21 = new Ingredient("Pasta", pastaProductsIngredients);
		Action act22 = new Action("put");
		List<ProductType> doughProductsIngredients = new ArrayList<>();
		doughProductsIngredients.add(new ProductType(
			"Water",
			1,
			500,
			null
		));
		doughProductsIngredients.add(new ProductType(
			"Flour",
			2,
			500,
			null
		));
		Ingredient ing22 = new Ingredient("Dought", doughProductsIngredients);
		Action act23 = new Action("mix");
		Action act24 = new Action("burn");
		rec2.addAction(act21); rec2.addIngredient(ing21);
		rec2.addAction(act22); rec2.addIngredient(ing22);
		rec2.addAction(act23); rec2.addAction(act24);
		
		recipes.addRecipe(rec2);
		
		Recipe rec3 = new Recipe("Fried potato");
		Action act31 = new Action("take");
		List<ProductType> friedPotatoProductsIngredients = new ArrayList<>();
		friedPotatoProductsIngredients.add(new ProductType(
			"Potato",
			25,
			400,
			null
		));
		Ingredient ing31 = new Ingredient("Potato", friedPotatoProductsIngredients);
		Action act32 = new Action("burn");
		rec3.addAction(act31); rec3.addIngredient(ing31);
		rec3.addAction(act32);
		
		recipes.addRecipe(rec3);
		
		System.out.println("\n\n" + recipes.toString() + "\n\n");
		
		Menu menu0 = new Menu(0); menu0.makeMenu(recipes, products);
		Menu menu1 = new Menu(1); menu1.makeMenu(recipes, products);
		Menu menu2 = new Menu(2); menu2.makeMenu(recipes, products);
		Menu menu3 = new Menu(6); menu3.makeMenu(recipes, products);
		
		System.out.println(menu0);
		System.out.println(menu1);
		System.out.println(menu2);
		System.out.println(menu3);
		
		
		
//		StorageRecipes storage = new StorageRecipes();
//		Recipe rec = new Recipe("Cheeseburger");
//		Ingredient ing1 = new Ingredient("bread");
//		Ingredient ing2 = new Ingredient("butter");
//		Ingredient ing3 = new Ingredient("cheese");
//		rec.addIngredient(ing1);
//		rec.addIngredient(ing2);
//		rec.addIngredient(ing3);
//		Action act1 = new Action("take");
//		Action act2 = new Action("put on");
//		Action act3 = new Action("put on");
//		rec.addAction(act1);
//		rec.addAction(act2);
//		rec.addAction(act3);
//		storage.addRecipe(rec);
//		System.out.println(rec);
//		System.out.println(storage);
	}

}
