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
 * DESKRIPSI: Program ini berisi class nilai
 */
class nilai {
    public int jumlahMhs;
   public int max;
   public int min;
   public int nilaiMhs[] = new int[40];
   int i =1;
    Scanner scan = new Scanner(System.in);
    
    public void inputData(){
        System.out.print("Masukan Banyaknya Mahasiswa = ");
        jumlahMhs = scan.nextInt();
    }
    
    public int nilaiTerbesar(int i){
        return max = ((max <= nilaiMhs[i])?nilaiMhs[i]:max);
    }
    public int nilaiTerkecil(int i){
        return min = ((min > nilaiMhs[i])?nilaiMhs[i]:min);
    }
    
    public void hasilNilai(){
        System.out.println("======Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < jumlahMhs; i++){
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" = "+nilaiMhs[i]);
        }
    }
}
