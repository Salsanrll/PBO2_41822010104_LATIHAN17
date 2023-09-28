/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan17;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("===============Program Tunjangan===============");
            System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
            double gajiPokok = input.nextDouble();
            System.out.print("Status Anda? (Menikah/Belum): ");
            String status = input.next();
            
            double tunjangan = 0;
            if (status.equalsIgnoreCase("menikah")) {
                tunjangan = 0.35 * gajiPokok;
            }
            double totalGaji = gajiPokok + tunjangan;
            
            System.out.println("==========Hasil Perhitungan Gaji Anda==========");
            System.out.println("Gaji Pokok\t\t: Rp. " + gajiPokok);
            System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
            System.out.println("Total Gaji\t\t: Rp. " + totalGaji);
            System.out.println("(Developed by: Salsa Nurul Laeli)");
        }
    }
    }

