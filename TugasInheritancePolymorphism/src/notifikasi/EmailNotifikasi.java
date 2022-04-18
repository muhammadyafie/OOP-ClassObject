/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notifikasi;

public class EmailNotifikasi implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("MENGIRIM EMAIL KE " + receiver + " DENGAN ISI:");
        System.out.println(content);
    }
    
}
