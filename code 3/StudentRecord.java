public class StudentRecord { 
	private String name; 
	private String address; 
	private int age;
	private double mathGrade; 
	private double englishGrade; 
	private double scienceGrade; 
	private double average;
	private static int StudentCount; 
	public static int STUDENTCOUNT;
//constructor
public StudentRecord(){
	   STUDENTCOUNT++;
}

public StudentRecord(String temp){ 
	this.name = temp; 
	STUDENTCOUNT++;
}

public StudentRecord(String name, String Address){ 
	this.name = name;
	this.address = Address; 
	STUDENTCOUNT++;
}

public StudentRecord(double mGrade, double eGrade, double sGrade){ 
	mathGrade = mGrade;
	englishGrade = eGrade; 
	scienceGrade = sGrade; 
	STUDENTCOUNT++;
}

public void out(){
}
public int setAge(int ag){ 
	age = ag;
	return ag;
}

public int getAge(){ 
	return age;
}

// menghasilkan nama siswa 
public String getName(){
	return name;
}

//mengubah nama siswa
public String setName( String temp){ 
	name = temp;
	return temp;
}

public String setAddress(String add){ 
	address = add;
	return add;
}

public String getAddress(){ 
	return address;
}

// area penulisan kode lain
//menghitung rata2 nilai mtk,science,englishGrade 
public double getAverage(){
	double result = 0;
	result = (mathGrade + englishGrade + scienceGrade)/3; 
	return result;
}
}
