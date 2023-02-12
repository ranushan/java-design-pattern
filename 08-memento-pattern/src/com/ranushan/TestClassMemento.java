package com.ranushan;

public class TestClassMemento {

	public static void main(String[] args) {
		
		FileWriterCaretaker caretaker = new FileWriterCaretaker();
		
		Originator fileWriter = new Originator("data.txt");
		
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");
		
		// lets save the file
		caretaker.save(fileWriter);
		// now write something else
		fileWriter.write("Second Set of Data\n");
		
		// checking file contents
		System.out.println(fileWriter + "\n\n");
		
		// lets undo to last save
		caretaker.undo(fileWriter);
		
		// checking file contents
		System.out.println(fileWriter + "\n\n");
		
	}

}
