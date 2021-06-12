/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodvoid;

/**
 *
 * @author MOKLET-2
 */
public class calculatorvoid {
double a;
    double b;
    double hasil;
    
    void KalkulatorVoid(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void penjumlahan() {
        hasil = a + b;
        System.out.println("Penjumlahan");
        System.out.println("Hasilnya adalah: "+hasil);
        System.out.println("");
    }
    void pengurangan() {
        hasil = a - b;
        System.out.println("Pengurangan");
        System.out.println("Hasilnya adalah: "+hasil);
        System.out.println("");
    }
    void perkalian() {
        hasil = a * b;
        System.out.println("Perkalian");
        System.out.println("Hasilnya adalah: "+hasil);
        System.out.println("");
    }
    void pembagian() {
        hasil = a / b;
        System.out.println("Pembagian");
        System.out.println("Hasilnya adalah: "+hasil);
        System.out.println("");
    }
}

