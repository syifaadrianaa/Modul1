public class unary {
	public static void main(String[] args) {
		int i = 10;
		int j = 3;
		int k =0;
		
		System.out.println("Inisialisasi ...");
		System.out.println("i = " +i);
		System.out.println("j = " +j);
		
		System.out.println("hasil ++j + i .. ");
		k = ++j + i;
		System.out.println ("k = "+k);
		System.out.println("hasil j++ + i = ");
		k = j++ + i;
		System.out.println("k = "+k);
	}
}
