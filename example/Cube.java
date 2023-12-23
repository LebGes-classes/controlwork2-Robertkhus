package org.example;
import java.lang.Math;
import java.util.Scanner;

public class Cube extends Shape {
    private double storona;

    @Override
    public void calculVol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте сторону кубу");
        storona = scanner.nextInt();
        double volume;
        volume = Math.pow(storona,3);
        System.out.println(volume);
    }
}
