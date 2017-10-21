import java.util.Scanner;

class datainput {
	public static void main (String[] args){
	
	
	Scanner input = new Scanner(System.in);
	String nama;
	char jeniskelamin;
	final int tinggibadan = 12;
	boolean menikah;

	System.out.print("Masukan Nama : ");
	nama = input.nextLine();

	System.out.print("Masukan Jenis Kelamin : ");
	jeniskelamin = input.next().charAt(0);

	//System.out.print("Masukan Tinggi badan : ");
	//tinggibadan = input.nextInt();

	System.out.print("Masukan Status Menikah : ");
	menikah = input.nextBoolean();

	System.out.println();
	System.out.println("Nama yang dimasukan adalah " + nama);
	System.out.println("Jenis Kelamin yang dimasukan adalah " + jeniskelamin);
	System.out.println("Tinggi Badan yang dimasukan adalah " + tinggibadan);
	System.out.println("Status yang dimasukan adalah " + menikah);

}
	

}