package Polymophism;

public class FruitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Create  a base class Fruit with name ,taste and size as its attributes.
       Create a method called eat() which describes the name of the fruit and its taste.
       Inherit the same in 2 other classes Apple and Orange and override the eat()
        method to represent each fruit taste.
		 */
      
		Apple objapple = new Apple();
		objapple.eat("Apple","Best Taste", "Big");
		
		Orange objorange = new Orange();
		objorange.eat("Orange","Best Taste", "Small");

	}

}
class Fruit{
	String name;
	String taste;
	String size = "small";
	
	public void eat(String name,String taste, String size) {
		
		System.out.println(name + " " + taste + " " + size);
	};
}
class Apple extends Fruit{
	

	public void eat(String name,String taste, String size) {
		
		System.out.println(name + " " + taste + " " + size);
	}
}
class Orange extends Fruit{
	
   public void eat(String name,String taste, String size) {
		
	   System.out.println(name + " " + taste + " " + size);
	}
}
