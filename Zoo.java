import java.awt.Color;
public class Zoo{
   public static void main (String args[]){
	Lion singa = new Lion ();
	Horse kuda = new Horse ();
	Kangoroo kangguru = new Kangoroo ();

	singa.warnaBulu = new Color (0, 1, 1);
	singa.nama = "Rere";
	singa.usia = 11;
	singa.bb = 190;
	singa.diadopsi ("Rachel");

	kuda.warnaBulu = new Color (0, 1, 1);
	kuda.nama = "Rara";
	kuda.usia = 20;
	kuda.bb = 380;
	kuda.diadopsi ("Syifa");

	kangguru.warnaBulu = new Color (0, 1, 1);
	kangguru.nama = "Roro";
	kangguru.usia = 9;
	kangguru.bb = 45;
	kangguru.diadopsi ("Raden");

	singa.cetakInformasi();
	kuda.cetakInformasi();
	kangguru.cetakInformasi();
}
}