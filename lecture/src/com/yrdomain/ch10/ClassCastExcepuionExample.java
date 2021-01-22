package com.yrdomain.ch10;

public class ClassCastExcepuionExample {
//p428
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
			//if(animal instanceof Dog){
			Dog dog =(Dog) animal; // classCastException 발생가능
		//}
		}

		

	}

	class Animal{}
	class Dog extends Animal{}
	class Cat extends Animal{}
