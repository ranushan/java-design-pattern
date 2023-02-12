package com;

import entity.Book;
import entity.Fruit;

public interface ShoppingCartVisitor {
	
	int visit(Book book);
	int visit(Fruit fruit);

}
