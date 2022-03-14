public class StudentRecord {
	private String name;
	private String address;
	private int age;
	private double mathGrade;
	private double englishGrade;
	private double scienceGrade;
	private double average;
	public static int studentCount;
	
	public StudentRecord(String temp) {
		this.name = temp;
		studentCount++;
	}
	public StudentRecord() { //constructor default
		studentCount++;
	}
	public StudentRecord (String name, String address) {
		this.name = name;
		this.address = address;
		studentCount++;
	}
	public StudentRecord(double mGrade, double eGrade, double sGrade) {
		mathGrade = mGrade;
		englishGrade = eGrade;
		scienceGrade = sGrade;
	}
	
	/**
	 * Menghasilkan nama dari siswa
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * mengubah nama siswa
	 */
	public void setName(String temp) {
		name = temp;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String temp) {
		address = temp;
	}
	
	public int getage() {
		return age;
	}
	
	public void setAge(int temp) {
		age = temp;
	}
	
	//area penulisan kode lain
	/**
	 * Menghitung rata rata nilai matematika, bahasa inggris
	 */
	
	public double getAverage() {
		double result = 0;
		result = (mathGrade+englishGrade+scienceGrade)/3;
		return result;
	}
	
	/**
	 * Menghasilkan jumlah instance StudentRecord
	 */
	public static int getStudentRecord() {
		return studentCount;
	}
	
	public void print (String temp) {
		System.out.println("Name \t\t\t = "+name);
		System.out.println("Address \t\t = "+address);
		System.out.println("Age \t\t\t = "+age);
	}
	public void print(double eGrade, double mGrade, double sGrade) {
		System.out.println("Name \t\t\t = "+name);
		System.out.println("Math Grade \t\t = "+mGrade);
		System.out.println("English Grade \t\t = "+eGrade);
		System.out.println("Science Grade \t\t = "+sGrade);
	}
	public double getEnglishGrade() {
		return englishGrade;
	}
	public void setEnglishGrade(double englishGrade) {
		this.englishGrade = englishGrade;
	}
	public double getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(double mathGrade) {
		this.mathGrade = mathGrade;
	}
	public double getScienceGrade() {
		return scienceGrade;
	}
	public void setScienceGrade(double scienceGrade) {
		this.scienceGrade = scienceGrade;
	}
}
