/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasloop;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class TugasLoop {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("MASUKKAN KATA YANG INGIN DIULANG : ");
        String kata = sc.next();
        
        System.out.print("MASUKKAN BERAPA KALI KATA INGIN DIULANG : ");
        int banyak =  sc.nextInt();
        
        for (int i = 1; i <= banyak; i++) {
            System.out.println(kata);
        }
    }
    
}