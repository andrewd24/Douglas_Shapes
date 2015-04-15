package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_Circle

Super:  Douglas_TwoDimensionalShape

Overrides the methods getArea of twoDimensional shape and toString of object 
class.  
------------------------------------------------------------------------------*/

public class Douglas_Circle extends Douglas_TwoDimensionalShape 
{
  
/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision number radius
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for radius(length) is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    public Douglas_Circle(double radius)
    {
        super(radius);
    }
    
    
/*------------------------------------------------------------------------------
Method:  getArea - overrides the twoDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a circle by using the value stored in length in the shape
class and Math.PI.    
    
Area of circle = PI*radius^2    
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return Math.PI * super.getLength() * super.getLength();
    }
    
    
/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the radius of the circle.    
------------------------------------------------------------------------------*/    
    @Override
    public String toString()
    {
        return String.format("Circle\nRadius: %.2f\n", 
            super.getLength());
    }
}
