import java.util.Scanner;
public class positifnegative{
	public static void main (String[] args){
		Scanner input= new Scanner (System.in);
		int nilai;
		System.out.print("Masukkan Nilai= ");
		nilai=input.nextInt();
		if(nilai>=0){
			System.out.print("positif");
			}
		else if(nilai<=0){
			System.out.print("negative");
			}
		System.out.println();
	}
}