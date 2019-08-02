package Matrizaleatorio;

import java.util.Random;

public class Matriz {
	public static void main (String[] args) {
		int [][]mat = new int[5][5];
		
	Random gerador = new Random();
	for (int x=0; x<5; x++) {
		for (int y=0; y<5; y++) {
			mat[x][y] = gerador.nextInt(26) + 1;
		}
	}
	for (int x=0; x<5; x++) {
		for(int y=0; y<5; y++) {
			System.out.print(mat[x][y] + " ");
		}
		System.out.println();
		}
	}
}
