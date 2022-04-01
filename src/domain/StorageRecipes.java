package domain;

import java.util.ArrayList;
import java.util.List;

public class StorageRecipes {
	private List<Recipe> recipesTotal = new ArrayList<>();
	
	public void addRecipe(Recipe recipe) {
		this.recipesTotal.add(recipe);
	}
	
	public List<Recipe> getRecipesTotal() {
		return this.recipesTotal;
	}
	
	@Override
	public String toString() {
		String result = "storageRecipes: ";
		for (Recipe rec : this.recipesTotal) {
			result+= rec.toString();
		}
		return result;
	}
}
