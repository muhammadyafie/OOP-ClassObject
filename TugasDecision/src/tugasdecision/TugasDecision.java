/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasdecision;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TugasDecision {

 public static void main(String[] args) {

        // membuat variabel dan Scanner
        int nilai;
        String nama;
        String kelas;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.println("NILAI MAHASISWA CCIT FTUI");
        System.out.print("MASUKKAN NAMA ANDA : ");
        nama = scan.nextLine();
        System.out.print("MASUKKAN KELAS ANDA : ");
        kelas = scan.nextLine();
        System.out.print("MASUKKAN NILAI ANDA : ");
        nilai = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( nilai >= 70 ) {
            System.out.println("SELAMAT " + nama + ", ANDA LULUS UJIAN!");
        } else {
            System.out.println("MAAF " + nama + ", ANDA BELUM LULUS UJIAN");
        }

    }

}
