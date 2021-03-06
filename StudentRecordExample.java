public class StudentRecordExample {
	public static void main(String[] args) {
		// membuat 3 object StudentRecord
		StudentRecord annaRecord = new StudentRecord();
		StudentRecord beahRecord = new StudentRecord();
		StudentRecord chrisRecord = new StudentRecord();
		
		//versi baru yang ditambahkan
		StudentRecord karyono = new StudentRecord("Karyono");
		StudentRecord songjongki = new StudentRecord ("Song Jong-ki", "cibaduyut");
		StudentRecord masbejo = new StudentRecord(80,90,100);
		
		//memberi nama siswa
		annaRecord.setName("Anna");
		beahRecord.setName("Beah");
		chrisRecord.setName("Chris");
		
		//menampilkan nama siswa "Anna"
		System.out.println (annaRecord.getName());
		
		//menampilkan jumlah siswa
		System.out.println ("Count \t\t\t = " +StudentRecord.getStudentRecord());
		StudentRecord anna2Record = new StudentRecord();
		anna2Record.setName("Anna");
		anna2Record.setAddress("Philipina");
		anna2Record.setAge(15);
		anna2Record.setMathGrade(80);
		anna2Record.setEnglishGrade(95.5);
		anna2Record.setScienceGrade(100);
		
		//overload method
		anna2Record.print(anna2Record.getName());
	anna2Record.print(anna2Record.getEnglishGrade(),
		anna2Record.getMathGrade(),
		anna2Record.getScienceGrade());
		annaRecord.print(annaRecord.getName());	
	}
}
