package Douglas_Shapes;

/*------------------------------------------------------------------------------
Class:  Douglas_Tetrahedron

Super:  Douglas_ThreeDimensionalShape

Overrides the methods getArea and getVolume of threeDimensional shape and 
toString of object class. 
------------------------------------------------------------------------------*/
public class Douglas_Tetrahedron extends Douglas_ThreeDimensionalShape 
{
    
/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision number edgeLength
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for edgeLength is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    Douglas_Tetrahedron(double edgeLength)
    {
        super(edgeLength);
    }
    
/*------------------------------------------------------------------------------
Method:  getArea - overrides the threeDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a tetrahedron by using the value stored in length
(edgeLength) in the shape class and using the Math.pow and sqrt functions.
    
Area of tetrahedron = sqrt(3) * edgeLength^2  
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return Math.sqrt(3) * Math.pow(super.getLength(), 2)  ;
    }

/*------------------------------------------------------------------------------
Method:  getVolume - overrides the threeDimensionalShape class getVolume method
    
Inputs:  none
    
Calculates the volume of a tetrahedron by using the value stored in 
length(edgeLength) in the shape class and using the Math.pow  and sqrt functions
    
Volume of tetrahedron = edgeLength^3/6*sqrt(2)
------------------------------------------------------------------------------*/     
    @Override
    public double getVolume()
    {
        return (Math.pow(super.getLength(), 3))/(6 * Math.sqrt(2));
    }

/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the length(edgeLength) of 
the tetrahedron.
------------------------------------------------------------------------------*/    
    @Override
    public String toString()
    {
         return String.format("Tetrahedron\nEdge: %.2f\n", 
            super.getLength());
    }
}
