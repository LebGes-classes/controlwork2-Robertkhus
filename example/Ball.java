package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Ball extends Shape {
    private double radius;

    @Override
    public void calculVol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте радиус шара");
        radius = scanner.nextInt();
        double volume;
        volume = (4/3) * Math.PI * Math.pow(radius,2);
        System.out.println(volume);
    }
}
