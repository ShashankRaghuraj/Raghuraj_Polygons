public class Rectangle extends Polygons
{
  //Creates a boolean called is Square and sets it to false
  private boolean isSquare = false;
  private String shape = "rectangle";
  //Constructor method that takes in both a width and height
  public Rectangle(double w, double h)
	{
    //Calls the parent constructor which then it sets the width and the height in the parent constructor
		super(w, h);
    //Determines whether width and height are same. If so, then isSquare becomes true
    if(w == h)
    {
      isSquare = true;
      shape = "square";
    }
	}
  //returns isSquare(true or false)
  public boolean getIsSquare()
  {
    return isSquare;
  }
  //Returns area(a double)
  public double getArea()
	{
		return getWidth()*getHeight();
	}
  //Displays all info
  public void displayInfo()
	{
		System.out.println("\n\nSHAPE INFO:");
		System.out.println("The figure is a " + shape + ".");
		super.displayInfo();
	}	
}
