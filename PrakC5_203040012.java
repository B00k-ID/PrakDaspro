package prak;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ibnu
 */
public class PrakC5_203040012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("masukkan nilai akhir kuliah");
		int nilai = sc.nextInt();
		
		if (nilai < 0 || nilai > 100) {
			System.out.println ("\nInput nilai antara 0-100");
		}
		
		if (nilai >= 85 && nilai <= 100) {
			System.out.println("\nLULUS");
			System.out.println("\nGRADE A");
		} else if (nilai >= 75 && nilai < 85) {
			System.out.println("\nLULUS");
			System.out.println("GRADE B");
		} else if (nilai >= 60 && nilai < 75) {
			System.out.println("\nLULUS");
			System.out.println("GRADE C");
		} else if (nilai >= 45 && nilai < 60) {
			System.out.println("\nGAGAL");
			System.out.println("GRADE D");
		} else {
			System.out.println ("\nGAGAL");
			System.out.println ("\nGRADE E");
		}
	}
}
