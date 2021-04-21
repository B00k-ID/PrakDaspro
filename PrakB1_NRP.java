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
public class PrakB1_NRP {
    
    public static void main(String[] args) {
        String nama, alamat; 
        int usia, gaji;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(" ### Pendataan Karyawan PT.Petani Kode ###");
        System.out.println(" Nama Karyawan : Rizki Ramadhan ");
        nama = keyboard.nextLine();
        System.out.print(" Alamat : Bandung ");
        alamat = keyboard.nextLine();
        System.out.print(" Usia : 21 ");
        usia = keyboard.nextInt();
        System.out.print(" Gaji : 9000000 ");
        gaji = keyboard.nextInt();
        
        
        System.out.println(" ");
        System.out.println(" Nama Karyawan : " + nama);
        System.out.println(" Alamat : " + alamat);
        System.out.println(" Usia : " + usia + " tahun ");
        System.out.println(" Gaji : Rp " + gaji);
        
    }
    
}




