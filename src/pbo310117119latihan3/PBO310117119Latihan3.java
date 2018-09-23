/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan3;

import java.util.Scanner;

/**
 *
 * @author user
 * Nama      : Arditya Yogaputra S
 * Kelas     : IF-3 / PBO-3
 * Nim       : 10117119
 * Deskripsi : Program ini bisa menginput data dan langsung menampilkan data
 */
public class PBO310117119Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.err.print("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
