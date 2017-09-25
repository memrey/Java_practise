package day11.examples;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
	
	int satir_sayisi=10;
	int sutun_sayisi=10;
	int mayin_sayisi;
	
	Hucre[][] oyun_tahtasi;
	
	
	public MayinTarlasi(int mayin_sayisi) {
		
		this.mayin_sayisi= mayin_sayisi;
		oyun_tahtasi=new Hucre[satir_sayisi][sutun_sayisi];
		oyunu_baslat();
		mayin_yerlestir();
		mayin_tarama();
		goruntule();
	}
	
	public void oyunu_baslat() {
		
		for(int i=0;i<satir_sayisi;i++) {
			for(int j=0;j<sutun_sayisi;j++) {
				Hucre h=new Hucre();
				h.setX(i);
				h.setY(j);
				oyun_tahtasi[i][j]=h;
				
			}
		}
	}
	 
	public void mayin_yerlestir() {
		
		Random input=new Random();
		
		for(int s=0;s<mayin_sayisi;s++) {
			
			int x_coord=input.nextInt(satir_sayisi);
			int y_coord=input.nextInt(sutun_sayisi);
			if(oyun_tahtasi[x_coord][y_coord].getValue()!=-1) {
				oyun_tahtasi[x_coord][y_coord].setValue(-1);
			}
			
		}
	} 
	
	public boolean check(int x,int y, Deque<Hucre> theStack) {
		
		if(x<0 || y<0 || x>=satir_sayisi || y>=sutun_sayisi ) {
			return false;
		}
		else if(theStack.contains(oyun_tahtasi[x][y])) {
			return false;
		}
		else if(oyun_tahtasi[x][y].isRevealed()) {
			return false;
		}
		else {
			return true; 
		}
		
	}
	
	public void mayin_tarama() {
		for(int i=0;i<satir_sayisi;i++) {
			for(int j=0;j<sutun_sayisi;j++) {
				
				if(oyun_tahtasi[i][j].getValue()!=-1) {
					int theValue=0;
					for(int t=-1;t<=1;t++) {
						for(int z=-1;z<=1;z++) {
							if(i+t<0 || i+t>=satir_sayisi || j+z<0 || j+z>=sutun_sayisi ||(t==0 && z==0)) {
								continue;
							}
							else if(oyun_tahtasi[i+t][j+z].getValue()==-1) {
								theValue++;
							}
						}
					}oyun_tahtasi[i][j].setValue(theValue);
				}
				
			}
		}
	}
	
	public void goruntule() {
		
		System.out.println("    0   1   2   3   4   5   6   7   8   9");
		for(int i=0;i<satir_sayisi;i++) {
			System.out.print(i+"   ");
			for(int j=0;j<sutun_sayisi;j++) {
				
				if(oyun_tahtasi[i][j].isRevealed()) {
					if(oyun_tahtasi[i][j].getValue()!=-1) {
						System.out.print(oyun_tahtasi[i][j].getValue()+"   ");
					}
					else {
						System.out.print("");
					}}
				else {
					System.out.print("X   ");
				}
				
			}System.out.println();
		}
	}
	
	public void hucreyi_ac(Hucre f) {
		f.setRevealed(true);
	}
	
	public Hucre komsu_hucreler(int x,int y) {
		
		Deque<Hucre> theStack=new LinkedList<Hucre>();
		theStack.push(oyun_tahtasi[x][y]);
		while(!theStack.isEmpty()) {
			
			Hucre g=theStack.pop();
			hucreyi_ac(g);
			if(g.getValue()==-1) {
				System.out.println("GAME OVER");
				System.exit(0);
				break;
			}
			
			else if(g.getValue()==0) {
				
				if (check(g.getX() - 1, g.getY(), theStack)) 
					theStack.push(oyun_tahtasi[g.getX() - 1][g.getY()]); // upper cell
				
				if (check(g.getX(), g.getY() + 1, theStack)) 
					theStack.push(oyun_tahtasi[g.getX()][g.getY() + 1]); //right cell
				
				if (check(g.getX() + 1, g.getY(), theStack)) 
					theStack.push(oyun_tahtasi[g.getX() + 1][g.getY()]); //down cell
				
				if (check(g.getX(), g.getY() - 1, theStack)) 
					theStack.push(oyun_tahtasi[g.getX()][g.getY() - 1]); //left cell
				
			}
		}
		goruntule();
		return oyun_tahtasi[x][y];
	}

}
