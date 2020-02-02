package com.azhar.latihanmatriks.matriks;

import java.util.Scanner;

public class pengurangan {
    double[][] mat = new double[2][];

    public void input(){
        Scanner input = new Scanner(System.in);

        mat[0] = new double[4];
        mat[1] = new double[4];

        System.out.print("Input matriks 1x1: ");
        mat[0][0] = input.nextDouble();

        System.out.print("Input matriks 1x2: ");
        mat[0][1] = input.nextDouble();

        System.out.print("Input matriks 1x3: ");
        mat[0][2] = input.nextDouble();

        System.out.print("Input matriks 1x4: ");
        mat[0][3] = input.nextDouble();

        System.out.print("Input matriks 2x1: ");
        mat[1][0] = input.nextDouble();

        System.out.print("Input matriks 2x2: ");
        mat[1][1] = input.nextDouble();

        System.out.print("Input matriks 2x3: ");
        mat[1][2] = input.nextDouble();

        System.out.print("Input matriks 2x4: ");
        mat[1][3] = input.nextDouble();
    }
    public void kurangMatriks() {
        input();
        double hasil[] = new double[4];

        hasil[0] = mat[0][0] - mat[1][0];
        hasil[1] = mat[0][1] - mat[1][1];
        hasil[2] = mat[0][2] - mat[1][2];
        hasil[3] = mat[0][3] - mat[1][3];

        System.out.print("[ " + hasil[0]);
        System.out.println(" " + hasil[1] + "]");
        System.out.print("[ " + hasil[2]);
        System.out.println(" " + hasil[3] + "]");
    }
}

