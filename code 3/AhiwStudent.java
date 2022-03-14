public class AhiwStudent extends StudentRecord{
    @Override
    public void out(){
        System.out.println("Selamat ... ");
    }
    public void cetak(){
        System.out.println("Nama Siswa : "+getName());
        System.out.println("Umur Siswa : "+getAge());
        System.out.println("Alamat Siswa : "+getAddress());
    }
    public void AhiwStudent(){
        StudentRecord tian = new StudentRecord(90,90,90);
        double nilai = tian.getAverage();
        System.out.println("Nilai siswa : "+nilai);
    }
    public static void main(String [] args){
        AhiwStudent uhuy = new AhiwStudent();
        uhuy.setName("Rayi Syifa Adriana");
        uhuy.setAddress("Bekasi");
        uhuy.setAge(20);
        uhuy.cetak();
        uhuy.AhiwStudent();
        uhuy.out();
}
}