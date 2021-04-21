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
public class PrakC3_203040012 {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan Nama");
		String nama = sc.next();
		System.out.println("Masukkan Password");
		String password = sc.next();
		
		
		if (nama.equalsIgnoreCase("admin") && (password.equals("loveyoukamu"))) {
			System.out.println("Selamat Datang");
		} else {
			System.out.println("Maaf anda siapa?");
		}
	}
    
}
