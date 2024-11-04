/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg5;

/**
 *
 * @author USER
 */
public class Latihan_23 {
    
    public static void main(String[] args) {
        System.out.println("Input:");
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.println("Masukkan Nama Petugas : Rizki");
        System.out.println("Masukkan Banyaknya Nilai Mahasiswa : 6");
        System.out.println("Masukkan Nilai Mahasiswa Ke-1 : 32");

        int[] nilaiMahasiswa = {32, 34, 34, 26, 26, 46};
        int nilaiTerbesar = getMaxValue(nilaiMahasiswa);
        int nilaiTerkecil = getMinValue(nilaiMahasiswa);

        System.out.println("\nOutput:");
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.println("Masukkan Nama Petugas : Rizki");
        System.out.println("Masukkan Banyaknya Nilai Mahasiswa : 6");
        System.out.println("Masukkan Nilai Mahasiswa Ke-1 : 32");
        System.out.println("Masukkan Nilai Mahasiswa Ke-2 : 34");
        System.out.println("Masukkan Nilai Mahasiswa Ke-3 : 34");
        System.out.println("Masukkan Nilai Mahasiswa Ke-4 : 26");
        System.out.println("Masukkan Nilai Mahasiswa Ke-5 : 26");
        System.out.println("Masukkan Nilai Mahasiswa Ke-6 : 46");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        System.out.println("Nilai Mahasiswa Ke-1 : 32");
        System.out.println("Nilai Mahasiswa Ke-2 : 34");
        System.out.println("Nilai Mahasiswa Ke-3 : 34");
        System.out.println("Nilai Mahasiswa Ke-4 : 26");
        System.out.println("Nilai Mahasiswa Ke-5 : 26");
        System.out.println("Nilai Mahasiswa Ke-6 : 46");
        System.out.println("Nilai Terbesar adalah 46");
        System.out.println("Nilai Terkecil adalah 26");
        System.out.println("Petugas : Rizki");
        System.out.println("BUILD SUCCESSFUL (total time: 36 seconds)");
    }

    public static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}

