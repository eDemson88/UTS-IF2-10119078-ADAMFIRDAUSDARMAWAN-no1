/*
Nama : Adam Firdaus Darmawan
NIM : 10119078
Kelas : IF-2
 */
package uts.soalno1.tandanyakamu;

import java.util.Scanner;
/**
 *
 * @author ryzen
 */
public class UTSSoalNo1TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age a = new Age(2020);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Tahun Lahir Anda: ");
        a.setYearBirth(scanner.nextInt());
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda : " + a.getYearBirth());
        a.tandanyaKamu(a.hitungUmur());
    }
    
}
