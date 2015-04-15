package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_Square

Super:  Douglas_TwoDimensionalShape

Overrides the methods getArea of twoDimensional shape and toString of object 
class. 
------------------------------------------------------------------------------*/
public class Douglas_Square extends Douglas_TwoDimensionalShape 
{

/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision number edgeLength
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for edgeLength is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    public Douglas_Square(double edgeLength)
    {
        super(edgeLength);
    }
/*------------------------------------------------------------------------------
Method:  getArea - overrides the twoDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a square by using the value stored in length in the shape
class and Math.pow to square the length.   
    
Area of square = edgeLength^2    
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return Math.pow(super.getLength(),2);
    }
/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the edge length of the 
square.
------------------------------------------------------------------------------*/    
    @Override
    public String toString()
    {
        return String.format("Square\nSide: %.2f\n", 
            super.getLength());
    }
}
