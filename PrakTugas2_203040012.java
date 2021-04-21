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
public class PrakTugas2_203040012 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukkan Jam: ");
		int jam = sc.nextInt();
		
		switch(jam) {
		case 00 :
			System.out.println("Tengah peuting");
			break;
		case 1 : 
			System.out.println("Tumorek");
			break;
		case 2 : 
			System.out.println("Janari leutik");
			break; 
		case 3 :
			System.out.println("Janari gede");
			break;
		case 4 :
			System.out.println("Kongkorongok hayam");
			break;
		case 5 :
			System.out.println("Balebat");
			break;
		case 6 :
			System.out.println("Carangcang tihang");
			break;
		case 7 :
			System.out.println("Meletek panon poe");
			break;
		case 8 :
			System.out.println("Ngaluluh taneuh");
			break;
		case 9 :
			System.out.println("Haneut moyan");
			break;
		case 10 :
			System.out.println("Rumangsang");
			break;
		case 11 :
			System.out.println("Pecat sawed");
			break;
		case 12 :
			System.out.println("Tangange");
			break;
		case 13 :
			System.out.println("Lingsir");
			break;
		case 14 :
			System.out.println("Kalangkang satangtung");
			break;
		case 15 :
			System.out.println("Mengok");
			break;
		case 16 :
			System.out.println("Tunggang gunung");
			break;
		case 17 :
			System.out.println("Sariak layung");
			break;
		case 18 :
			System.out.println("Sareupna");
			break;
		case 19 :
			System.out.println("Harieum beunguet");
			break;
		case 20 :
			System.out.println("Sareureuh budak");
			break;
		case 21 :
			System.out.println("Tumoke");
			break;
		case 22 :
			System.out.println("Sareureuh kolot");
			break;
		case 23 :
			System.out.println("Indung peuting");
			break;
		default :
			System.out.println("Teu kaasup jam sunda");
		break;
		}

	}
}