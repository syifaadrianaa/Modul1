public class Square extends Shape
{
	private int sisi;
	Square(String aName)
	{
			super(aName);
	        sisi = 7;     
	}
	public float HitungLuas()
	{
        int Luas;
        Luas = sisi * sisi;         
		return Luas;     
	} 
}
