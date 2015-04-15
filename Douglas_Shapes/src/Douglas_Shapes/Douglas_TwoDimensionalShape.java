package Douglas_Shapes;

/*------------------------------------------------------------------------------
Class:  Douglas_TwoDimensionalShape

Abstract class that inherits methods from the Douglas_Shape class
------------------------------------------------------------------------------*/

public abstract class Douglas_TwoDimensionalShape extends Douglas_Shape
{
/*------------------------------------------------------------------------------
Constructors
    
One argument:  For constructing squares and circles
    
Two arguments: For constructing trinagles
    
Both call the super class(shape) constructor where error checking is done on 
length and width.    
------------------------------------------------------------------------------*/        
    public Douglas_TwoDimensionalShape(double length)
    {
        super(length);
    }
    
    public Douglas_TwoDimensionalShape(double length, double width)
    {
        super(length, width);
    }

/*------------------------------------------------------------------------------
Method:  getArea - abstract method - implemented in subclasses
------------------------------------------------------------------------------*/    
    public abstract double getArea();
}
