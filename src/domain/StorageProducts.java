package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StorageProducts {
	private List<ProductType> products = new ArrayList<>();
	
	public StorageProducts() {}
	
	public StorageProducts(List<ProductType> products) {
//		this.products = products;
		for (ProductType product : products) {
			this.addProduct(product);
		}
	}
	
	public void addProduct(ProductType product) {
		boolean hasProduct = false;
		for (ProductType prod : this.products) {
			if (prod.equals(product)) {
				hasProduct = true;
				prod.setCount(prod.getCount() + product.getCount());
				break;
			}
		}
		
		if (!hasProduct) this.products.add(product);
	}
	
	public List<ProductType> getProducts() {
		return this.products;
	}
	
	@Override
	public boolean equals(Object o) {
		Set<ProductType> sortedProducts = new HashSet<>();
		
		for (ProductType product : this.products) {
			sortedProducts.add(product);
		}
		this.products = (ArrayList<ProductType>)sortedProducts.stream().collect(Collectors.toList());
		
		sortedProducts.clear();
		for (ProductType product : ((StorageProducts)o).getProducts()) {
			sortedProducts.add(product);
		}
		List<ProductType> toCompareProducts = (ArrayList<ProductType>)sortedProducts.stream().collect(Collectors.toList());
		
		return this.products.equals(toCompareProducts);
	}
	
	@Override
	public String toString() {
		String result = "sp:\n";
		
		for (ProductType product : this.products) {
			result+= product.toString() + "\n";
		}
		
		return result;
	}
}



































