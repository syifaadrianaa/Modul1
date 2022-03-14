public class Person {
	public String name;
	public char gender;
	public int age;
	public String dateOfBirth;
	public double height;
	public int weight;
	public String address;
	
	public void cetakBiodata(String name, char gender, String address) {
		System.out.println ("\n*********************************************\n");
		System.out.println("nama \t\t\t = "+name);
 		System.out.println("jenis kelamin \t\t = "+gender);
		System.out.println("Alamat \t\t\t = "+address);
	}
	public void cetakFisik(int age, String dateOfBirth,double height, int weight) {
	System.out.println("Umur \t\t\t = "+age);
		System.out.println("Tanggal Lahir \t\t = "+dateOfBirth);
		System.out.println("Tinggi \t\t\t = "+height);
		System.out.println("Berat \t\t\t = "+weight);
	}
}
