/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan19.saldotabungan;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Saldo
 * Tabungan
 */
public class IF110118038Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bunga = 0.15;
        int lama = 6;
        int i = 1;
        do{
        saldoAwal = saldoAwal + saldoAwal*bunga;
        System.out.println("Saldo di bulan ke-"+ i +" Rp." + saldoAwal);    
        i++;
        } while (i <= lama); 
        
         
    }
    
}
