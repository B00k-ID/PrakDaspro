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
public class PrakC4_203040012 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jkelamin = sc.next();
		
		if(jkelamin.equalsIgnoreCase("L") || (jkelamin.equalsIgnoreCase("P"))) {
			System.out.println("Selamat anda dalam keadaan baik");
		} else {
			System.out.println("Maaf anda jenis kelamin apa?");
		}
	}
    
}
