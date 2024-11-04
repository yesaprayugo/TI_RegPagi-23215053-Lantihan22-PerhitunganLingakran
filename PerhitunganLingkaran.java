/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nilai diameter lingkaran (bilangan bulat positif): ");
            String input = scanner.nextLine();

            // Improved input validation using try-catch for cleaner error handling
            try {
                if (Integer.parseInt(input) > 0) {
                    int diameter = Integer.parseInt(input);
                    double jariJari = diameter / 2.0;
                    double luas = Math.PI * jariJari * jariJari;
                    double keliling = 2 * Math.PI * jariJari;

                    System.out.println("Hasil Perhitungan Lingkaran:");
                    System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
                    System.out.println("Luas Lingkaran = " + luas + " cm^2");
                    System.out.println("Keliling Lingkaran = " + keliling + " cm");
                    break; // Exit the loop after successful calculation
                } else {
                    System.out.println("Nilai diameter harus bilangan bulat positif.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Harap masukkan bilangan bulat positif.");
            }
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}