package com.Simplilearn.AccessModifier;

public class PublicAccessModifierConsumerExample {
	
	public static void main(String[] args) {
      
		System.out.println("Calling multiplayNumber function with same package but in another class..");
		//Object Creation Using Default Constructor
		PublicAccessModifierExample psme = new PublicAccessModifierExample();
		//calling the object using class psme
		psme.MultiplayNumbers();
}
}
