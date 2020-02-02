package com.azhar.latihanmatriks.matriks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    System.out.println("1. Penjumlahan");
    System.out.println("2. Pengurangan");
    System.out.println("3. Perkalian");
    System.out.println("0. Exit");
    System.out.println("======================");

    Scanner menuInput = new Scanner(System.in);
    System.out.print("Input menu: ");
    int menu = menuInput.nextInt();
        switch(menu) {
            case 1:
                penjumlahan jumlah = new penjumlahan();
                jumlah.jumlahMatriks();
                break;

            case 2:
                pengurangan kurang = new pengurangan();
                kurang.kurangMatriks();
                break;

            case 3:
                perkalian kali = new perkalian();
                kali.kaliMatriks();
            default:
                break;
        }
    }
}

