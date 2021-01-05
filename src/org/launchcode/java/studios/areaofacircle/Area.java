package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area  {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;
        double area;
        double pi = 3.14;

        System.out.println("Enter a radius");
        radius = input.nextDouble();
        input.close();

        area =Circle.getArea(radius, pi);
        System.out.println(area);

    }


}
