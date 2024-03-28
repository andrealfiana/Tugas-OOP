/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Andre
 * TGL : 2024-0328
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtain = new BufferedReader (new InputStreamReader (System.in));
        
        Double luas;
        int alss = 0;
        int tingg = 0;
        String alas ="";
        String tinggi="";
        
        System.out.println("Menghitung Luas Segitiga");
        
        try{
            System.out.print("Masukan Nilai Alas: ");
            alas = dtain.readLine();
            System.out.print("Masukan Nilai Tinggi: ");
            tinggi = dtain.readLine();
        }catch(IOException e) {
            System.out.println("TIDAK VALID!!!");
        }
        alss = Integer.parseInt(alas);
        tingg = Integer.parseInt(tinggi);
        
        // Proses hitungannya
        luas = 0.5 * alss * tingg;
        
        //outputnya
        System.out.println("Hasil Dari Luas Segitiga: " + luas);
    }
    
}
