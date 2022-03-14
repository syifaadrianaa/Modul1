public abstract class Shape 
{     
	private String name;     
	Shape(String aName)
	{         
		name=aName;
      }
	
	public String getName()
	{
        	return name;     
	}     

	public float HitungLuas()
	{
         	return 0.0f;     
	}    

	public static void main(String argv[]) 
	{ 
        Circle Lkr = new Circle("Lingkaran");
        Square Ktk = new Square("Kotak");
        Shape shapeArray[] = {Lkr, Ktk}; 
        for (int i=0; i<shapeArray.length; i++) 
	  {
             System.out.println("Luas dari " + shapeArray[i].getName() + " adalah " + shapeArray[i].HitungLuas()+" cm.\n");
        }     
    } 
}
