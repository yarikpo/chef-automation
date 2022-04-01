package domain;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MenuFormer {
	public static int countCustomersOnProduct(Recipe recipe, StorageProducts storage) {
		int maxNumberOfCustomers = (int)Double.POSITIVE_INFINITY;
		List<ProductType> allStorageProducts = storage.getProducts();

//		Later it can be optimized using other data structures
		for (Ingredient ingredient : recipe.getIngredients()) {
			 for (ProductType product : ingredient.getProductsForCook()) {
				 Optional<Integer> optionalItemFromStorageCount = allStorageProducts.stream()
						 .filter(item -> item.getName().equals(product.getName()))
						 .map(ProductType::getCount)
						 .reduce((x, y) -> x + y);
				 if (!optionalItemFromStorageCount.isPresent()) continue;
				 Integer itemFromStorageCount = optionalItemFromStorageCount.get();
				 maxNumberOfCustomers = Math.min(maxNumberOfCustomers, Math.floorDiv(itemFromStorageCount, product.getCount()));
			 }
		}
		
		return maxNumberOfCustomers;
	}
	
	public static List<Recipe> getRecipesForNCustomers(int numberOfCustomers, StorageRecipes recipes, StorageProducts storage) {
		List<Recipe> acceptedRecipes = recipes.getRecipesTotal();
		
		acceptedRecipes = acceptedRecipes.stream()
				.filter(recipe -> countCustomersOnProduct(recipe, storage) >= numberOfCustomers) // ?>=
				.collect(Collectors.toList());
		
		return acceptedRecipes;
	}
}
