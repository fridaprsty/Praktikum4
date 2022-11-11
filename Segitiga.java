/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utama;

/**
 *
 * @author Farida Prasetyaning
 */
public class Segitiga extends BangunDatar{
    
    int alas;
    int tinggi;
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }

}
