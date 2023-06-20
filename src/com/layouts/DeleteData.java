package com.layouts;

import java.util.Scanner;

import com.controllers.DbController;

public class DeleteData {
    public static void deleteData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID yang ingin dihapus  : ");
        int inputId = input.nextInt();

        DbController.deleteData(inputId);
    }
}
