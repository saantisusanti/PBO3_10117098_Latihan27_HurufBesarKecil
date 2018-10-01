/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan27_hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menampilkan hasil
 *                     formating kalimat menjadi huruf besar dan kecil yang
 *                     kalimatnya di input oleh user
 */
public class PBO3_10117098_Latihan27_HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat, hurufKecil, kapital;
        
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Maukkan Kalimat\t : ");
        kalimat = scn.nextLine();
        
        hurufKecil = kalimat.toLowerCase();
        kapital = kalimat.toUpperCase();
        
        System.out.println("======= Hasil Formating =======");
        System.out.println("Huruf Besar\t : " +kapital);
        System.out.println("Huruf Kecil\t : " +hurufKecil);
        
    }
    
}
