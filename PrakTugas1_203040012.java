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
public class PrakTugas1_203040012 {
    public static void main(String[] args) {
		float tinggiBadan, beratBadan, BMI, cm;
		Scanner input = new Scanner (System.in);
		System.out.print("Masukkan Berat Badan : ");
		beratBadan = input.nextFloat();
		System.out.print("Masukkan Tinggi Badan : ");
		cm = input.nextFloat();
		
		tinggiBadan = cm/100;
		BMI = beratBadan/(tinggiBadan*tinggiBadan);
		
		if(BMI >= 25 || BMI < 18) {
			if(BMI >= 25) {
				System.out.println("BMI Anda : " + BMI);
				System.out.println("Anda memiliki resiko yang lebih tinggi terhadap penyakit jantung, osteoarthritis, beberapa tipe kanker dan diabetes level 2");
			}
			else {
				System.out.println("BMI Anda : " + BMI);
				System.out.println("Anda beresiko tinggi terhadap osteoporosis atau pertanda kesehatan badan tidak baik");
			}
			System.out.println("\nSebaiknya anda meminta saran dari dokter Anda untuk memandu dalam program pengaturan rumus berat badan ideal untuk hidup lebih sehat");
		}
		else {
			System.out.println("BMI Anda : " + BMI);
			System.out.println("BMI anda normal");
		}
	}
}
