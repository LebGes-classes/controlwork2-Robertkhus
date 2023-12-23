package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    @Override
    public void calculVol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте радиус основанию цилиндра");
        radius = scanner.nextInt();
        System.out.println("Задайте высоту цилиндра");
        height = scanner.nextInt();
        double volume;
        volume = Math.PI * Math.pow(radius,2) * height;
        System.out.println(volume);
    }
}
