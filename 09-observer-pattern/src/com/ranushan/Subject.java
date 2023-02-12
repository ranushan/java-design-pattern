package com.ranushan;

public interface Subject {

	// Methods to register and unregister observers
	public void register(Observer obj);
	public void unregister(Observer obj);
	
	// Methods to notify observers of change
	public void notifyObservers();
	
}
