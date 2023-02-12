package com.ranushan;

public class MyTopicSubscriber implements Observer {
	
	private String name;
	
	public MyTopicSubscriber(String nm) {
		this.name = nm;
	}
	
	@Override
	public void update(String message) {
		if(message == null) {
			System.out.println(name + " :: No new message");
		}else {
			System.out.println(name + " :: Consuming message :: " + message);
		}
	}

}
