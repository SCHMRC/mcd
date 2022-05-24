package mcd;

import java.util.Scanner;

public class Mcd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int prova = 1;
		int mcd = 0;
		int res1 = 0;
		int res2 = 0;
		
		System.out.println("Inserisci A: ");
		a = scan.nextInt();
		System.out.println("Inserisci B: ");
		b = scan.nextInt();
		while(prova < a || prova < b) {
			res1 = a%prova;
			res2 = b%prova;
			if(res1 == 0 && res2 == 0) {
				mcd = prova;
			}
			prova++;
		}
		System.out.println(mcd);
		

	}

}
