package Douglas_Shapes;
/*------------------------------------------------------------------------------
Programmer: Andrew Douglas

Program:    Douglas_ShapesDriver - program that tests the implementation of 
            Douglas_Shapes and its subclasses: TwoDimensional: (Circle, Square,
            and Triangle.) , ThreeDimensional: (Cube, Sphere, Tetrahedron.).
                                             
            Processes an array of shapes and reports its area.  If the shape 
            inherits from ThreeDimensional it also prints volume.
            
------------------------------------------------------------------------------*/
public class Douglas_ShapeDriver 
{

    
    public static void main(String[] args) 
    {        
        
        
        Douglas_Triangle triangle = new Douglas_Triangle(3.4, 4.7);
        
        Douglas_Square square = new Douglas_Square(5.4);
        
        Douglas_Circle circle = new Douglas_Circle(7.25);
        
        Douglas_Sphere sphere = new Douglas_Sphere(11);
        
        Douglas_Cube cube = new Douglas_Cube(9.9);
        
        Douglas_Tetrahedron tetrahedron = new Douglas_Tetrahedron(6.7);
        
        Douglas_Shape[] shapes = new Douglas_Shape[6];
        
        Douglas_ThreeDimensionalShape threeDimShape;
        
        shapes[0] = tetrahedron;
        
        shapes[1] = sphere;
        
        shapes[2] = circle;
        
        shapes[3] = square;
        
        shapes[4] = cube;
        
        shapes[5] = triangle;
        
        
        for(Douglas_Shape shape : shapes)
        {
            System.out.print(shape);
            
            if(shape instanceof Douglas_TwoDimensionalShape)
            {
              System.out.printf("Area: %.2f\n" , shape.getArea());
              System.out.println("");
            }
            
            else
            {   
              threeDimShape = (Douglas_ThreeDimensionalShape)shape;
              System.out.printf("Area: %.2f\n", shape.getArea());
              System.out.printf("Volume: %.2f\n", threeDimShape.getVolume());
              System.out.println("");
            }
        }
    }
}
