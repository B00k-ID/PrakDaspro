/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak;

import java.util.Scanner;

/**
 *
 * @author ibnu
 */
public class PrakC6_203040012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Grade: ");
		String grade = sc.next();
		
		switch (grade) {
		case "A":
			System.out.println ("Angka Mutu 4");
			break;
		case "B":
			System.out.println ("Angka Mutu 3");
			break;
		case "C":
			System.out.println ("Angka Mutu 2");
			break;
		case "D":
			System.out.println ("Angka Mutu 1");
			break;
		default:
			System.out.println ("Angka Mutu 0");
			break;
		}
	}
}

