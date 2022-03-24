/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bloc4;

/**
 *
 * @author Adrix
 */
public class Clientsjv {
    private String nom;
    private String NIF;
    private String correu;
    private Double despesaFetaAcumulada;
    private int percentatgeDescompte;

    public Clientsjv() {
    }

    public Clientsjv(String nom, String NIF, String correu, Double despesaDetaAcumulada, int percentatgeDescompte) {
        this.nom = nom;
        this.NIF = NIF;
        this.correu = correu;
        this.despesaFetaAcumulada = despesaFetaAcumulada;
        this.percentatgeDescompte = percentatgeDescompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public Double getDespesaFetaAcumulada() {
        return despesaFetaAcumulada;
    }

    public void setDespesaFetaAcumulada(Double despesaFetaAcumulada) {
        this.despesaFetaAcumulada = despesaFetaAcumulada;
    }

    public int getPercentatgeDescompte() {
        return percentatgeDescompte;
    }

    public void setPercentatgeDescompte(int percentatgeDescompte) {
        this.percentatgeDescompte = percentatgeDescompte;
    }
    public String toString(){
        return "Bloque1(" + "nombre = " + nom +  ", nif=" + NIF + ", correu=" + correu + ", despesaFeta=" + despesaFetaAcumulada + ", descompte=" + percentatgeDescompte + '}';
    }
    
    
}
