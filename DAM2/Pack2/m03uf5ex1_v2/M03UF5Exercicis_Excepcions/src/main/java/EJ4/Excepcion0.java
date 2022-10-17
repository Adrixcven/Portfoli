/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author Adrix
 */
public class Excepcion0 extends Exception{
    private String causa;
    public Excepcion0(String msg, String causa) {
        super(msg); // Set lee con getMessage()
        this.causa = causa;
    }
}
