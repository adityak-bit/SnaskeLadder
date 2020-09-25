package com.TifoTactics;

public class SnakeLadder {
	public static void main(String[] args) {
		//UC 2
		int dieRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("dieRoll = " +dieRoll);
		
		//UC 3
		int Ladder = 1;
		int Snake = 2;
		int option = (int) Math.floor(Math.random()*10) % 3;
		switch (option) {
		case Ladder:
			position = position + dieRoll;
			break;
		case Snake:
			position = position + dieRoll;
			break;
		default:
			position = position + 0;
			break;
		}
		
		//Uc 4
		do {
			
		}while (position = 100)
			
		//UC 5
			
	}

}
