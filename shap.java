package Polymophism;

public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 2. Write a program to create a class named shape. It should contain 2 methods, draw() 
		 and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
         For this class, create three sub classes, Circle, Triangle and Square 
         and each class should override the parent class functions - draw () and erase ().
         The draw() method should print “Drawing Circle”, “Drawing Triangle” 
         and “Drawing Square” respectively.
         The erase() method should print “Erasing Circle”, “Erasing Triangle” 
         and “Erasing Square” respectively.
         Create objects of Circle, Triangle and Square in the following way
         and observe the polymorphic nature of the class by calling draw() and erase() method using each object.
         Shape c=new Circle();
         Shape t=new Triangle();
          Shape s=new Square();

		 */
		 shap c=new Circle();
         shap t=new Triangle();
         shap s=new Square();
         
         c.draw();
         c.erase();
         System.out.println();
         t.draw();
         t.erase();
         System.out.println();
         
         s.draw();
         s.erase();
	}

}
class shap{
	
	public void draw() {
		
		System.out.print("Drawing");
	};
	public void erase() {
		System.out.print("Erasing");
	};
	
}
class Circle extends shap{

    public void draw() {
		
		System.out.print("Drawing Circle");
	};
	public void erase() {
		System.out.print("Erasing Circle");
	};
	
}
class Triangle extends shap{

    public void draw() {
		
		System.out.print("Drawing Triangle");
	};
	public void erase() {
		System.out.print("Erasing Triangle");
	};
	
}
class Square extends shap{

    public void draw() {
		
		System.out.print("Drawing Square");
	};
	public void erase() {
		System.out.print("Erasing Square");
	};
	
}
