package com.TifoTactics;

public class Practice2 {
	public static final int Ladder = 1;
	public static final int Snake = 2;
	
	public static void main(String[] args) {
		int freq = 0;
		
		for (int pos = 0;pos >=0 && pos <= 100;) {
			freq++;
			int dieRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			
			int option = (int) Math.floor(Math.random()*10) % 3;
			switch (option) {
			case Ladder:
				pos = pos + dieRoll;
				break;
			case Snake:
				if(pos >= 6) {
				pos = pos - dieRoll;}
				else if (pos < 6 && pos >= dieRoll) {
					pos = pos - dieRoll;
				}
				else pos = 0;
				break;
			default:
				pos = pos + 0;
				break;
			} 
			
		System.out.println("pos\tdieRoll\toption\tfreq");
		for(int i=0;i<=freq;i++) {
			System.out.println(pos+"\t"+dieRoll+"\t"+option+"\t"+freq);
		}
			
		} 
	}

}
