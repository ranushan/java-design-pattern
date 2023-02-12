package com;

import entity.Book;
import entity.Fruit;

public class Test {
	public static void main(String[] args) {

		ItemElement[] items = new ItemElement[] {
				new Book(20, "ISBN3883737"),
				new Book(5, "ISBN393987"),
				new Fruit(10, 2, "Mango"),
				new Fruit(5, 3, "Apple") };

		
		int total = calculatePrice(items);
		System.out.println("Total cost : " + total);
		
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement itemElement : items) {
			sum = sum + itemElement.accept(visitor);
		}
		return sum;
	}
}
