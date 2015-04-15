package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_ThreeDimensionalShape

Abstract class that inherits methods from the Douglas_Shape class
------------------------------------------------------------------------------*/

public abstract class Douglas_ThreeDimensionalShape extends Douglas_Shape
{
    
/*------------------------------------------------------------------------------
Constructor
    
Calls the constructor of the super class, which does error checking for length.    
------------------------------------------------------------------------------*/    
        
    public Douglas_ThreeDimensionalShape(double length)
    {
        super(length);
    }
    
    
/*------------------------------------------------------------------------------
Method:  getArea - abstract method - implemented in subclasses
------------------------------------------------------------------------------*/    
    @Override
    public abstract double getArea();

/*------------------------------------------------------------------------------
Method:  getVolume - abstract method - implemented in subclasses
------------------------------------------------------------------------------*/    
    public abstract double getVolume();
    
}
