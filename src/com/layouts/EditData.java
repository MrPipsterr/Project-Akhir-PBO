package com.layouts;

import java.util.Scanner;

import com.controllers.DbController;

public class EditData {
    public static void editData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID yang ingin Diubah  : ");
        int inputId = input.nextInt();

        input.nextLine(); // Membersihkan newline dari input sebelumnya

        System.out.print("Input Nama Baru  : ");
        String namaBaru = input.nextLine();

        System.out.print("Input Harga Baru  : ");
        long hargaBaru = input.nextLong();

        System.out.print("Input Jumlah  : ");
        int jumlahBaru = input.nextInt();

        DbController.editData(inputId, namaBaru, hargaBaru, jumlahBaru);
    }
}
