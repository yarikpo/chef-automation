package domain;

import java.util.List;

public class Ingredient {
	private String name = "";
	private List<ProductType> productsForCook;
	
	public Ingredient(){}
	
	public Ingredient(String name) {
		this.name = name;
	}
	
	public Ingredient(String name, List<ProductType> productsForCook) {
		this.name = name;
		this.productsForCook = productsForCook;
	}
	
	public List<ProductType> getProductsForCook() {
		return this.productsForCook;
	}
	
	public void setProductsForCook(List<ProductType> products) {
		this.productsForCook = products;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ing: " + this.name;
	}
}
