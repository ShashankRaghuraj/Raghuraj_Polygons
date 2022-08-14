import jdk.jfr.TransitionFrom;

//PolygonsRunner.java 
//An introduction to inheritance in OOP

public class Main
{
	public static void main(String[]args)
	{
		KeyboardReader reader = new KeyboardReader();

		// Let's add a polygon here
		Triangle triangle1 = new Triangle(2,4,"obtuse");
		Triangle triangle2 = new Triangle(4,4,"acute");
		Rectangle rectangle1 = new Rectangle(5,5);
		Rectangle rectangle2 = new Rectangle(5,7);
		System.out.println("\nGet is square method for rectangle1: " + rectangle1.getIsSquare() + "\nGet is square method for rectangle2: " + rectangle2.getIsSquare() + "\n");
		Polygons[] polygonArray = new Polygons[]{triangle1, triangle2, rectangle1, rectangle2};
		//Using a way simpler for loop to iterate through the array.
		//using the fact that both a rectangle and a triangle are polygons, it is simplier to Create a polygon object, then to traverse through the polygon array
		for(Polygons p : polygonArray)
		{
		p.displayInfo();
		}
		System.out.println("\n\n Trial 2");
		Triangle triangle3 = new Triangle(3,4,"right");
		Triangle triangle4 = new Triangle(4,7,"obtuse");
		Rectangle rectangle3 = new Rectangle(7,7);
		Rectangle rectangle4 = new Rectangle(7,34);
		System.out.println("\nGet is square method for rectangle3: " + rectangle3.getIsSquare() + "\nGet is square method for rectangle4: " + rectangle4.getIsSquare() + "\n");
		Polygons[] polygonArray1 = new Polygons[]{triangle3, triangle4, rectangle3, rectangle4};
		//Using a way simpler for loop to iterate through the array.
		//using the fact that both a rectangle and a triangle are polygons, it is simplier to Create a polygon object, then to traverse through the polygon array
		for(Polygons poly : polygonArray1)
		{
			poly.displayInfo();
		}

	}	
}
