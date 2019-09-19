import java.util.Scanner;
public class maxmin{
	public static void main (String[] args){
		Scanner scan= new Scanner (System.in);
		System.out.print("Berapa banyak yang diinput= ");
		int array= scan.nextInt();
		int nilai[]=new int[array];
		int min, max;
		for (int i=0;i<array;i++)
		{
			System.out.print("Masukkan angka ke-"+i+" : ");
			nilai[i]=scan.nextInt();
			}
			min=nilai[0];
			max=nilai[0];
			System.out.println("Nilai-nilai yang diinputkan adalah: ");
			for (int i=0;i<array;i++)
			{
				System.out.print(nilai[i]+", ");
				if(nilai[i]<min)
				min=nilai[i];
				if(nilai[i]>max)
				max=nilai[i];
				}
				System.out.println();
				System.out.println("Min : "+min+"\nMax : "+max);
	}
}