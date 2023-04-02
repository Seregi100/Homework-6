/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Seregi
 */
public class Homework6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнил Кузьмин Сергей Александрович, РИБО-01-21, вариант 1");
        try{
            System.out.println("Введите марку машины: ");
            String brand = scan.next();
            System.out.println("Введите год выпуска машины: ");
            int releaseYear = scan.nextInt();
            if (releaseYear<1885 | releaseYear>2023){
                System.out.println("Такой год выпуска невозможен, повторите попытку");
            }else{
                System.out.println("Введите регистрационный номер машины: ");
                String regNumber = scan.next();
                System.out.println("Введите вместимость бака машины: ");
                double fuelCapasity = scan.nextDouble();
                System.out.println("Введите пробег машины: ");
                double mileage = scan.nextDouble();
                Car car = new Car(brand, releaseYear, regNumber, fuelCapasity, mileage);
                SaverRunnable sr = new SaverRunnable(car, "C:\\car.ser");
                Thread t = new Thread(sr);
                t.start();
                System.out.println("Путь к сериализованному файлу: C:\\car.ser");
            }
        }catch(InputMismatchException ex){
            System.out.println("Введённый тип данных некорректен, повторите попытку");
        }
    }
}
