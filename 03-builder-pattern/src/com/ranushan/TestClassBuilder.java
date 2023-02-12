package com.ranushan;

public class TestClassBuilder {

	public static void main(String[] args) {
		
		/*
		
		Pizza pizza1 = new Pizza(10);
		Pizza pizza2 = new Pizza(10, true);
		Pizza pizza3 = new Pizza(10, true, true);
		Pizza pizza4 = new Pizza(10, true, true, true);
		
		System.out.println(pizza1);
		System.out.println(pizza2);
		System.out.println(pizza3);
		System.out.println(pizza4);
		
		*/
		
		Pizza p1 = new Pizza.Builder().taille(10).bacon(true).build();
		
		System.out.println(p1);
		
	}

}
