package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdu nr 1: ");
		int nr1= scanner.nextInt();
//		int nr2=s;
		System.out.println("numarul citit este: "+nr1);
		System.out.println("Introdu nr 2");
		
		int nr2= scanner.nextInt();
		System.out.println("Numarul 2 citit este: "+ nr2);
		int s=nr1+nr2;
		System.out.println("Suma este:"+ s);
		System.out.println("Diferenta este: "+(nr1-nr2));
		System.out.println("Produsul este: "+(nr1*nr2));
		System.out.println("Media este: "+((nr1+nr2)/2));
		
	}

}
