/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodnonvoid;

/**
 *
 * @author MOKLET-2
 */
public class calculatornonvoid {
double a;
    double b;
    double penjumlahan;
    double pengurangan;
    double perkalian;
    double pembagian;

    void KalkulatorNonVoid(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double a() {
        return a;
    }
    double b() {
        return b;
    }
    double penjumlahan() {
        penjumlahan = a + b;
        System.out.println("Hasil Penjumlahan adalah: "+penjumlahan);
        System.out.println("");
        return penjumlahan;
    }
    double pengurangan() {
        pengurangan = a - b;
        System.out.println("Hasil Pengurangan adalah: "+pengurangan);
        System.out.println("");
        return pengurangan;
    }
    double perkalian() {
        perkalian = a * b;
        System.out.println("Hasil Perkalian adalah: "+perkalian);
        System.out.println("");
        return perkalian;
    }
    double pembagian(){
        pembagian = a / b;
        System.out.println("Hasil Pembagian adalah: "+pembagian);
        return pembagian;
    }
}
        
