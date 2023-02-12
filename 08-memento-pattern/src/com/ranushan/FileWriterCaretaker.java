package com.ranushan;

// Caretaker is the helper class that is responsible for storing
// and restoring the Originator's state through Memento object.

public class FileWriterCaretaker {
	
	private Object obj;
	
	public void save(Originator fileWriter) {
		
		this.obj = fileWriter.save();
		
	}

	public void undo(Originator fileWriter) {
		
		fileWriter.undoToLastSave(obj);
		
	}
}
