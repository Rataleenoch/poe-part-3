/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chats;

import static chats.Chats.Massenger;

/**
 *
 * @author RC_Student_lab
 */
public class Chats {

    /**
     * @param args the command line arguments
 */
    
            
    public static void main(String[] args) {
      Massenger(); 
 
    }
    public static void Massenger(){
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run(){
                    new Massenger().setVisible(true);
                }
            });
        }
}
