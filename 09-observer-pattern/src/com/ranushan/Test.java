package com.ranushan;

public class Test {

	public static void main(String[] args) {
		
		// Create Subject
		MyTopic topic = new MyTopic();
		
		// Create Observes
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");
		
		// Register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);
		
		// Now send message to subject
		topic.postMessage("New Message");
		
	}

}
