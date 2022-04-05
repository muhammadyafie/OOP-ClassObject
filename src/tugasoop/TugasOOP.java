/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasoop;

class SiswaSNM {
    String nama;
    String univ;
    String prodi;
    
    SiswaSNM(String Nama, String Univ, String Prodi) {
        nama = Nama;
        univ = Univ;
        prodi = Prodi;
        
        System.out.println("Nama :" +nama);
        System.out.println("Univ :" +univ);
        System.out.println("Prodi :" +prodi);
    }
}
    
public class TugasOOP {
    public static void main(String[] args) {
        SiswaSNM siswa1 = new SiswaSNM("Yafie","UI","Teksip");
        SiswaSNM siswa2 = new SiswaSNM("Udin","UGM","Kedokteran");
    }   
}

