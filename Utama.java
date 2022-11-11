/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utama;

/**
 *
 * @author Farida Prasetyaning
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Buat objek bangundatar,persegi,lingkaran,segitiga
       BangunDatar bangunDatar = new BangunDatar();
       
       //Nilai parameter sisi persegi
       Persegi persegi = new Persegi(4);
       
       //Nilai parameter alas dan tinggi
       Segitiga segitiga = new Segitiga(8, 5);
       
       //Nilai parameter jari lingkaran
       Lingkaran lingkaran = new Lingkaran(30);
       
       //Memamnggil method luas dan keliling
       bangunDatar.luas();
       bangunDatar.keliling();
       
       
       System.out.println("Luas Persegi :" + persegi.luas());
       System.out.println("Keliling Persegi :" + persegi.keliling());
       System.out.println("Luas Segitiga :" + segitiga.luas());
       System.out.println("Luas Lingkaran :" + lingkaran.luas());
       System.out.println("Keliling Lingkaran :" + lingkaran.keliling());
    }

}
