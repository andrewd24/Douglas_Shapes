package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_Triangle

Super:  Douglas_TwoDimensionalShape

Overrides the methods getArea of twoDimensional shape and toString of object 
class. 
------------------------------------------------------------------------------*/

public class Douglas_Triangle extends Douglas_TwoDimensionalShape 
{
    
/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision numbers height and base
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for base and height is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    Douglas_Triangle(double height, double base)
    {
        super(height, base);
        
    }
/*------------------------------------------------------------------------------
Method:  getArea - overrides the twoDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a triangle by using the value stored in length(height)  
and base(width) in the shape class.  
    
Area of Triangle = 1/2 base * height    
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return super.getLength() * super.getWidth()/2;
    }
/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the length(height) and 
base(width) of the triangle.
------------------------------------------------------------------------------*/    
    @Override
    public String toString()
    {
        return String.format("Triangle\nBase: %.2f\nHeight: %.2f\n", 
            super.getLength(), super.getWidth());
    }
}
