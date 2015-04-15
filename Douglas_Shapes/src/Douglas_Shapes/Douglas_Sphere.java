package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_Sphere

Super:  Douglas_ThreeDimensionalShape

Overrides the methods getArea and getVolume of threeDimensional shape and 
toString of object class. 
------------------------------------------------------------------------------*/

public class Douglas_Sphere extends Douglas_ThreeDimensionalShape 
{

/*------------------------------------------------------------------------------
Constructor
    
Inputs:  double precision number radius
    
Calls the constructor of the super class, which calls the constructor of its 
super class because error checking for radius is handled in the shape 
class.
------------------------------------------------------------------------------*/    
    Douglas_Sphere(double radius)
    {
        super(radius);
    }
    
/*------------------------------------------------------------------------------
Method:  getArea - overrides the threeDimensionalShape class getArea method
    
Inputs:  none
    
Calculates the area of a sphere by using the value stored in length(radius)  
in the shape class and the Math.PI method.
    
Area of sphere = 4 * PI * radius^2    
------------------------------------------------------------------------------*/    
    @Override
    public double getArea()
    {
        return 4 * Math.PI * Math.pow(super.getLength(), 2);
    }

/*------------------------------------------------------------------------------
Method:  getVolume - overrides the threeDimensionalShape class getVolume method
    
Inputs:  none
    
Calculates the volume of a sphere by using the value stored in length(radius)  
in the shape class and methods PI and pow from the Math class.
    
Volume of sphere = 4 * radius^3 /3    
------------------------------------------------------------------------------*/    
    @Override
    public double getVolume()
    {
        return 4 * Math.PI * Math.pow(super.getLength(), 3)/3;
    }

/*------------------------------------------------------------------------------
Method:  toString - overrides the object class toString method
    
Inputs:  none
    
Formats a string to output the name of the shape and the length(radius) of the 
sphere.
------------------------------------------------------------------------------*/     
    @Override
    public String toString()
    {
        return String.format("Sphere\nRadius: %.2f\n", super.getLength()); 
    }
}
