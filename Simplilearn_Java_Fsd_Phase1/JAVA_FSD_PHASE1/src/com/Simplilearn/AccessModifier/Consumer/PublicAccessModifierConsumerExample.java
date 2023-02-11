package com.Simplilearn.AccessModifier.Consumer;

import com.Simplilearn.AccessModifier.PublicAccessModifierExample;

public class PublicAccessModifierConsumerExample {
	
	public static void main(String[] args) {
      
         System.out.println("Calling multiplayNumber function from outside the package...");
         //Object Creation Using Default Constructor
     	 PublicAccessModifierExample psme = new PublicAccessModifierExample();
     	 //calling the object using class psme
     	 psme.MultiplayNumbers();
}
}
