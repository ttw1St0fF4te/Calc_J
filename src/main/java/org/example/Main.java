package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создание сканнера для записи строки в переменную

        System.out.print("Введите 1-ую долготу: "); // Вывод сообщения в консоль
        int longitude1 = scanner.nextInt(); // Введение переменной первой долготы и запись в нее ответа пользователя
        System.out.print("Введите 1-ую широту: "); // Вывод сообщения в консоль
        int latitude1 = scanner.nextInt(); // Введение переменной первой широты и запись в нее ответа пользователя

        System.out.print("Введите 2-ую долготу: "); // Тоже самое, что в первой долготе и широте
        int longitude2 = scanner.nextInt();
        System.out.print("Введите 2-ую широту: ");
        int latitude2 = scanner.nextInt();

        double distance; // Создание переменной типа данных с плавающей точкой
        final double EARTH_RADIUS = 6371; // Создание константы с плавающей точкой равной радиусу земли

        // По формуле Хамминга:
        double dLatitide = Math.toRadians(latitude1 - latitude2);
        double dLongitude = Math.toRadians(longitude1 - longitude2);

        double a = Math.sin(dLatitide / 2) * Math.sin(dLatitide / 2) +
                Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
                Math.sin(dLongitude / 2) * Math.sin(dLongitude / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        distance = EARTH_RADIUS * c; // Запись в переменную distance произведение радиуса на формулу

        System.out.print("Расстояние между двумя точками на земной поверхности = " + distance); // Вывод в консоль результата
    }
}
