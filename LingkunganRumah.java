import  java.awt.Color; 
public class LingkunganRumah{
	public static void main(String[] args){ 
	Kucing michael = new Kucing(); 
	Kucing garfield = new Kucing();
	michael.warnaBulu = new Color (0 , 1 , 1); 
	michael.nama = "Michael";
	michael.usia = 3;
	michael.bb = 4.5; 
	michael.diadopsi("Rayi Syifa Adriana");
	garfield.warnaBulu = new Color (0 , 1 , 1); 
	garfield.nama = "Garfield";
	garfield.usia = 4;
	garfield.bb = 5.5; 
	garfield.diadopsi("Anggi Anggraeni"); 
	michael.cetakInformasi(); 
	garfield.cetakInformasi();
    }

}
