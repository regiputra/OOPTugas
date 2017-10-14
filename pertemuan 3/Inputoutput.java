import java.util.Scanner;

class Inputoutput {
	public static void main (String[] args){
	String data;
	
	Scanner scan = new Scanner(System.in);

	System.out.print("masukan data : ");
	data = scan.nextLine();

	System.out.println("Data yang dimasukan adalah" + data);
	}
	

}