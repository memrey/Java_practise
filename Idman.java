package day5.examples;

import java.util.ArrayList;
import java.util.Random;

public class Idman {

	public static void main(String []args) {
		Random generator=new Random(3);
		ArrayList<Integer> sayi=new ArrayList<>();
		for(int i=0;i<30;i=i+4) {
			sayi.add(generator.nextInt(50)+20);
	}
		System.out.println(sayi);
		System.out.println(sayi.size());
		find(sayi,30);
		sort(sayi);
		
		

}
	public static void find(ArrayList<Integer> dizi,int x) {
		for(int j=0;j<dizi.size();j++) {
			if(dizi.get(j)==x) {
				System.out.println("number has been found");
			}
			else {
				System.out.println("nah sana number");
				break;
			}
		}
	}
	public static void sort(ArrayList<Integer> arr){
		
		for(int y=0; y<arr.size();y++) {
			for(int z=0;z<((arr.size()-1)-y);z++) {
				int temp;
				if(arr.get(z)>(arr.get(z+1))) {
					
						temp=arr.get(z);
						arr.set(z, arr.get(z+1));
						arr.set(z+1, temp);
			}
			}
		}
		System.out.println(arr);
	}
	
}
