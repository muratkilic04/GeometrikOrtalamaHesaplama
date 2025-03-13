package geometrikort;

import java.util.Scanner;

public class geometrikOrtalama {

	public static void main(String[] args) {
		
		//girilen sayıya kadar geometrik ortalamayı hesaplama
		
		Scanner s=new Scanner(System.in);
		
		double ort=1.0;
		int n=0,sayi=0;
		
		do {
			System.out.print("Sayıları girin, çıkmak için sıfır(0) girin:");
			sayi=s.nextInt();
			if(sayi!=0) {
				ort*=sayi;
				n++;
			}
		}while(sayi!=0);
		
		ort=Math.pow(ort, 1.0/(double)n);
		System.out.println("Geometrik ortalama:"+ort);
	}

}
