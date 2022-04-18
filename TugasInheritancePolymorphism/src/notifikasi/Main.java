/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifikasi;

public class Main {

    public static void main(String[] args) {
        String emailPenerima = "muhammadyafie@gmail.com";
        String nomerHp = "08123456789";
        String mobileId = "SamsungGalaxyA52s";

        EmailNotifikasi emailNotif = new EmailNotifikasi();
        SMSNotifikasi smsNotif = new SMSNotifikasi();
        PushNotifikasi pushNotif = new PushNotifikasi();

        String message = "SELAMAT ANDA TELAH BERHASIL MELAKUKAN TUTORIAL POLIMORFISME";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
