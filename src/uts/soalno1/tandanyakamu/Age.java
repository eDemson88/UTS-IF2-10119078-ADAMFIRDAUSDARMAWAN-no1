/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.soalno1.tandanyakamu;

/**
 *
 * @author ryzen
 */
public class Age {
    private int yearBirth,yearNow;
    private String red = "\u001b[31m";
    
    public Age(int yearNow){
        this.yearNow=yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth=yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        int hitungUmur = yearNow - yearBirth;
        System.out.println("Umur kamu sampai hari ini adalah " +hitungUmur + " tahun");
        return hitungUmur;
    }
    
    public String tandanyaKamu(int hitungUmur){
        String tandanyaKamu;
       if (0 <= hitungUmur && hitungUmur<=5){
           tandanyaKamu = red + "LAGI LUCU-LUCUNYA";
       } else if (5 < hitungUmur && hitungUmur <= 10){
           tandanyaKamu = red + "MASIH ANAK ANAK";
       } else if (10 < hitungUmur && hitungUmur <= 13){
           tandanyaKamu = red + "MASIH REMADJA";
       } else if (13 < hitungUmur && hitungUmur <= 19){
           tandanyaKamu = red + "ALAY";
       } else if (19 < hitungUmur && hitungUmur <= 29){
           tandanyaKamu = red + "LAGI GALAU NYARI JODOH";
       } else if (29 < hitungUmur && hitungUmur <= 35){
           tandanyaKamu = red + "LAGI SIBUK NYARI UANG";
       } else if (35 < hitungUmur && hitungUmur <= 150){
           tandanyaKamu = red + "SUDAH TUA";
       } else
           tandanyaKamu= "TIDAK TERDETEKSI DI KEHIDUPAN";
       
        System.out.println("Tandanya Kamu " +tandanyaKamu);
        return tandanyaKamu;
    }
}
