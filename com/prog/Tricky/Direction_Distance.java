package com.prog.Tricky;

public class Direction_Distance {
	
	public static int distance(char[][] input) {
		int x=0;
		int y=0;
		
		for(char[] move : input) {
			char direction = move[0];
			int distan = move[1];
			
			switch(direction) {
			case 'N':
				y +=distan;
				break;
			case 'S':
				y -=distan;
				break;
			case 'E':
				x +=distan;
				break;
			case 'W':
				x -=distan;
				break;
			default:
				System.out.println("Wrong Direction:"+distan);
				
			}
		}
		return Math.abs(y)+ Math.abs(x);
	}

	public static void main(String[] args) {
		char[][] input = {{'N',10},{'W',5},{'S',5}};
		int distance = distance(input);
		System.out.println("distance covered: "+distance);
		
	}

}
