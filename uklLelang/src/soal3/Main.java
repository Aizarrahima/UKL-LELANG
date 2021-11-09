/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

import java.util.Scanner;

/**
 *
 * @author Aizar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        Laporan laporan = new Laporan();
        Petugas petugas = new Petugas();
        Masyarakat masyarakat = new Masyarakat();

        laporan.laporan(petugas);
        laporan.laporan(masyarakat);

        System.out.println();
        System.out.print("Masukkan ID Petugas : ");
        int idPetugas = scan.nextInt();
        System.out.println("Selamat Datang " + petugas.getNama(idPetugas));
        System.out.println(" ");

        Barang barang = new Barang();
        Lelang lelang = new Lelang();

        lelang.prosesLelang(masyarakat, lelang, barang);
        laporan.laporan(barang);
        laporan.laporan(masyarakat);
        laporan.laporan(masyarakat, lelang, barang);
    }
}
