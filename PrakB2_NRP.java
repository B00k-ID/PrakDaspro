/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ibnu
 */
public class PrakB2_NRP {
    public static void main(String[] args) throws IOException {
        String nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Inputkan Nama :");
        nama = br.readLine();
        System.out.println("Nama kamu adalah :" + nama);
        System.out.println("");
    }
}
