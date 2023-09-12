package ru.piaksheva.tableapp.main;

import java.util.Scanner;

public class MainLine {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа через пробел - координаты точки А");
        int[] coordinatesA = readCoordinates();
        System.out.println("Введите 2 числа через пробел - координаты точки В");
        int[] coordinatesB = readCoordinates();
        if (coordinatesA[0] == coordinatesB[0] && coordinatesA[1] == coordinatesB[1]) {
            System.out.println("Длина отрезка не может быть посчитана, потому что введены координаты одной точки");
        } else {
            double lineLength = Math.sqrt((Math.pow((coordinatesB[0] - coordinatesA[0]), 2)) + (Math.pow((coordinatesB[1] - coordinatesA[1]), 2)));
            System.out.println("Длина отрезка AB = " + lineLength);
        }
    }

    public static int[] readCoordinates() {
        Scanner inputInt = new Scanner(System.in);
        String xy = inputInt.nextLine();
        String[] strArr = xy.split(" ");
        int[] coordinates = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            coordinates[i] = Integer.parseInt(strArr[i]);
        }
        return coordinates;
    }
}
