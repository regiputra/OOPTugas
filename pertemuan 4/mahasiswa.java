public class mahasiswa{

	public static void main (String[] args);{
		System.out.println("ini adalah method utama");

		mahasiswa regi = new mahasiswa();
		regi.printNama();
		System.out.println(regi.calculateUmur());


	}

	//void untuk procedure
	public void printNama(){
		System.out.println("Regi");

	}

	public int calculateUmur(){

		int tahun_lahir = 1994;
		int tahun_sekarang = 2017;

		int umur;
		umur = tahun_sekarang - tahun_lahir;

		return umur;
	}

}