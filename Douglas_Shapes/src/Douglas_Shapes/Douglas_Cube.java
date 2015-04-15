package Douglas_Shapes;

/*------------------------------------------------------------------------------
Class:  Douglas_Cube

Super:  Douglas_ThreeDimensionalShape

Overrides the methods getArea and getVolume of threeDimensional shape and 
toString of object class. 
------------------------------------------------------------------------------*/

public class Douglas_Cube extends Douglas_ThreeDimensionalShape 
{
    
/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision number edgeLength
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for edgeLength is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    Douglas_Cube(double edgeLength)
    {
        super(edgeLength);
    }

/*------------------------------------------------------------------------------
Method:  getArea - overrides the threeDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a cube by using the value stored in length(edgeLength)  
in the shape class and using the Math.pow function.
    
Area of cube = 6 * edgeLength^2    
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return 6 * Math.pow(super.getLength(), 2);
    }

/*------------------------------------------------------------------------------
Method:  getVolume - overrides the threeDimensionalShape class getVolume method
    
Inputs:  none
    
Calculates the volume of a cube by using the value stored in length(edgeLength)  
in the shape class and using the Math.pow function.
    
Volume of cube = edgeLength^3    
------------------------------------------------------------------------------*/    
    @Override
    public double getVolume()
    {
        return Math.pow(super.getLength(), 3);
    }

/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the length(edgeLength) of 
the cube.
------------------------------------------------------------------------------*/    
    @Override
    public String toString()
    {
        return String.format("Cube\nSide: %.2f\n", 
                            super.getLength());
    }
}
