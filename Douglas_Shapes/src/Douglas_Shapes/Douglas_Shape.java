package Douglas_Shapes;
/*------------------------------------------------------------------------------
Class:  Douglas_Shape

Abstract class that has sub classes for many shapes.  Every shape inherits and 
overrides the getArea method.  Volume is calculate only on three dimensional 
shapes.
------------------------------------------------------------------------------*/

public abstract class Douglas_Shape 
{
    private double length;
    private double width;
    
/*------------------------------------------------------------------------------
Default Constructor:       Initializes length and width.
    
One Argument Constructor:  calls setLength to validate the length of the edge.
    
Two Argument Constructor:  calls both setLength and setWidth to validate the 
                           length and width of the shape   
------------------------------------------------------------------------------*/    
    public Douglas_Shape()
    {
        length = 0;
        width = 0;
    }
    
    public Douglas_Shape(double length)
    {
        setLength(length);
    }
    
    public Douglas_Shape(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }
    
/*------------------------------------------------------------------------------
Method: setLength
    
Inputs: double precision number length
    
validates that the length is non-negative, otherwise it defaults the length to 0    
------------------------------------------------------------------------------*/
    public void setLength(double length)
    {
        if(length > 0)
            this.length = length;
        else
            this.length = 0;
    }

/*------------------------------------------------------------------------------
Method: getLength
    
Inputs: none
    
returns value of length    
------------------------------------------------------------------------------*/    
    public double getLength()
    {
        return length;
    }

/*------------------------------------------------------------------------------
Method: setWidth
    
Inputs: double precision number width
    
validates that the width is non-negative, otherwise it defaults the width to 0    
------------------------------------------------------------------------------*/    
    public void setWidth(double width)
    {
        if(width > 0)
            this.width = width;
        else
            this.width = 0;
    }

/*------------------------------------------------------------------------------
Method: getWidth
    
Inputs: none
    
returns value of width    
------------------------------------------------------------------------------*/    
    public double getWidth()
    {
        return width;
    }

/*------------------------------------------------------------------------------
Method:  getArea - abstract method - implemented in subclasses
------------------------------------------------------------------------------*/    
    public abstract double getArea();
}
    
    

