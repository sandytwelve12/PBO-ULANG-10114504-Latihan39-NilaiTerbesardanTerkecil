/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi nilai terbesar dan terkecil
 */
public class PBOULANG10114504Latihan39NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilai daftarNilai = new nilai();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("====Program Nilai Mahasiswa Terbesar"
                + " dan Terkecil=====");
        System.out.print("Masukan Nama Petugas = ");
        String nama = scan.nextLine();
        
        daftarNilai.inputData();
        for (int i=0; i<daftarNilai.jumlahMhs; i++){
            System.out.print("Masukan Nilai Mahasiswa ke-"+(i+1)+" = ");
            daftarNilai.nilaiMhs[i] = scan.nextInt();
            System.out.println("");
            daftarNilai.nilaiTerbesar(i);
            daftarNilai.nilaiTerkecil(i);            
        }
        
        daftarNilai.hasilNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah = "+daftarNilai.max);
        System.out.println("Nilai terkecil adalah = "+daftarNilai.min);
                
        
    }
    
}
