/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ6;

/**
 *
 * @author Adrix
 */
public class Excepcion_ extends Exception{
    private String causa;
    public Excepcion_(String msg, String causa) {
        super(msg); // Set lee con getMessage()
        this.causa = causa;
    }
}
