package day1.examples;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		for(int temp:a) 
		System.out.print(temp +" ");
		System.out.println();
		String b="memrey";
		System.out.println(b.substring(1,5));
		String c="451";
		int d=Integer.parseInt(c);
		System.out.println(d);
		/*System.out.println("lütfen notunu giriniz");
		int i=new Scanner(System.in).nextInt();
		if(i<80) {
			System.out.println("notunuz F");
		}
		else {
			System.out.println("AA");
		}*/
		
		Insan emre=new Insan();
		emre.kilo=85;
		emre.yemek();
		System.out.println(emre.kilo);
		Calisan enes=new Calisan();
		enes.gelir=2000;
		enes.zam(30);
		System.out.println(enes.gelir);
		System.out.println("lütfen adinizi giriniz");
		String scan=new Scanner(System.in).nextLine();
		
		
		
	}
	
}
