package domain;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private String name = "";
	private List<Ingredient> ingredientsOrder = new ArrayList<>();
	private List<Action> actionsOrder = new ArrayList<>();
	
	Recipe() {}
	
	Recipe(String name) {
		this.name = name;
	}
	
	public void addIngredient(Ingredient ingredient) {
		this.ingredientsOrder.add(ingredient);
	}
	
	public void addAction(Action action) {
		this.actionsOrder.add(action);
	}
	
	public List<Ingredient> getIngredients() {
		return this.ingredientsOrder;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		String result = "\n" + this.name + ":\n";
		for (int i = 0; i < this.actionsOrder.size(); ++i) {
			result+= this.actionsOrder.get(i).toString();
			try {
				result+= this.ingredientsOrder.get(i).toString();
			}
			catch(IndexOutOfBoundsException ioobe) {
				
			}
			result+= "\n";
		}
		
		return result;
	}
}
