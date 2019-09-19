import java.util.Scanner;
public class tipepesawat{
	public static void main (String[] args){
		Scanner input= new Scanner (System.in);
		int tipe;
		System.out.print("Masukkan Tipe Pesawat= ");
		tipe=input.nextInt();
		if(tipe==1){
			System.out.println("Pesawat Garuda");
		}
		else if(tipe==2){
			System.out.println("Pesawat Batik");
		}
		else if(tipe==3){
			System.out.println("Pesawat Lion");
		}
		else{
			System.out.println("Maaf anda salah memasukkan tipe pesawat");
			}
	}
}