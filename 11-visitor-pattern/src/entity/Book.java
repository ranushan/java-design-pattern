package entity;

import com.ItemElement;
import com.ShoppingCartVisitor;

public class Book implements ItemElement {
	
	private int price;
	private String isbnNumber;

	public Book() {
	}
	
	public Book(int price, String isbnNumber) {
		this.price = price;
		this.isbnNumber = isbnNumber;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(String isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	
	@Override
	public String toString() {
		return "Book [price=" + price + ", isbnNumber=" + isbnNumber + "]";
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
	
	

}
