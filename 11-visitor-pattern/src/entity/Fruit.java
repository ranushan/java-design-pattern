package entity;

import com.ItemElement;
import com.ShoppingCartVisitor;

public class Fruit implements ItemElement{

	private int pricePerKG;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKG, int weight, String name) {
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}

	public Fruit() {
	}

	public int getPricePerKG() {
		return pricePerKG;
	}

	public void setPricePerKG(int pricePerKG) {
		this.pricePerKG = pricePerKG;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [pricePerKG=" + pricePerKG + ", weight=" + weight + ", name=" + name + "]";
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
	
	
}
