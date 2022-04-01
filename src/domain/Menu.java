package domain;

import java.util.List;

public class Menu {
	private List<Recipe> dishes;
	private int numberOfGuests = 0;
	
	public Menu() {}
	
	public Menu(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	
	public void makeMenu(StorageRecipes recipes, StorageProducts products) {
		this.dishes = MenuFormer.getRecipesForNCustomers(this.numberOfGuests, recipes, products);
	}
	
	public List<Recipe> getDishes() {
		return this.dishes;
	}
	
	public void setNumberOfGuests(int guests) {
		this.numberOfGuests = guests;
	}
	
	@Override
	public String toString() {
		String result = "Menu for " + this.numberOfGuests + " guests :\n";
		
		for (Recipe recipe : this.dishes) {
			result+= recipe.toString();
		}
		
		return result;
	}
}
