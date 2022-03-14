public class Circle extends Shape
{     
	private int r;     
	Circle(String aName)
	{
        super(aName);
        r = 3;     
	}     
	public float HitungLuas()
	{
        float Luas;         
		Luas = (float)(3.14*r*r);
	    return Luas;     
	}
}
