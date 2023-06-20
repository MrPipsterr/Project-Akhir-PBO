package com.layouts;

import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Keluar");
            System.out.println("==========================");

            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    ReadData.readData();
                    break;
                case 2:
                    InsertData.insertData();
                    break;
                case 3:
                    EditData.editData();
                    break;
                case 4:
                    DeleteData.deleteData();
                    break;
                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    } 
}
