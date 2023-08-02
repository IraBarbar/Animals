package Reestr.Menu;

import java.time.LocalDate;
import java.util.Scanner;

import Reestr.House.Barn;
import Reestr.House.Horce_donkey;
import Reestr.House.House;
import Reestr.House.Yaung;

public class Console implements ViewConsole {
    private Scanner iScanner ;
    private boolean is_ok = false;
    LocalDate date;
    House[] houses = new House[]{new Barn(), new Horce_donkey(), new Yaung()};

    public Console() {
        iScanner = new Scanner(System.in);
    }

    @Override
    public String inputName() {
        System.out.println("Введите кличку живонотого (если ее нет, то введите - noname): ");
        return iScanner.next();
    }

    @Override
    public char inputGender() {
        Character[] gender = {'m', 'f'};
        while (is_ok){
            System.out.println("Выберите пол животного (Введите номер пункта) : ");
            listAnswer(gender) ;
            try {
                int num = iScanner.nextInt();
                if (num > 0 && num <= gender.length) {
                    is_ok = true;
                    return gender[num-1];
                }
                else System.out.println("Ошибка! Некорректное число.");
               
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        return 'n';
        }




    @Override
    public int choiceHouseID() {
        
        while (is_ok){
            System.out.println("Выберите место размещения животного (Введите номер пункта): ");
            printNameHouses();
            try {
                int num = iScanner.nextInt();
                if (num > 0 && num <=houses.length) {
                    is_ok = true;
                    return houses[num-1].getHouseid();
                }
                else System.out.println("Ошибка! Некорректное число.");
               
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        
        return -1;
    }

    public void printNameHouses() {
        System.out.println("\t-------Место размещения животного-------");
        int i = 1;
        for (House house : houses) {
            System.out.printf("\t%d. ", i++);
            house.nameHouse();
        }
    }

    @Override
    public int inputDay_birth() {
        int day;
        while (is_ok) {
               System.out.println("Введите день рождения животного: ");
            try {
               day = iScanner.nextInt();
                if (day > 0 &&  day < 32) {
                    is_ok = true;
                    return day;
                }                    
                else System.out.println("Ошибка! Некорректно введен день.");
                
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число!");
            }
            }
     
        return 0;
    }

    private void listAnswer(Character[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.printf("\t%d. %s\n", i + 1, array[i]);
        }   
    }

    private void listAnswer(String[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.printf("\t%d. %s\n", i + 1, array[i]);
        }   
    }

    @Override
    public int inputYear_birth() {
        int year;
        while (is_ok) {
               System.out.println("Введите год рождения: ");
            try {
                year = iScanner.nextInt();
                if (year > 1950 &&  year < date.getYear()) {
                    is_ok = true;
                    return year;
                }                    
                else System.out.println("Ошибка! Некорректно введен год.");
                
            } catch (Exception e) {
                System.out.println("Ошибка! Введите число!");
            }
            }
     
        return 0000;
    }

    @Override
    public int inputMonth_birth() {
       String[] monthes = {"январь", "февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};
        while (is_ok){
            System.out.println("Выберите месяц рождения животного (Введите номер пункта) : ");
            listAnswer(monthes) ;
            try {
                int num = iScanner.nextInt();
                if (num > 0 && num <= monthes.length) {
                    is_ok = true;
                    return num;
                }
                else System.out.println("Ошибка! Некорректное число.");
               
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        
        return 00;
    }

    
}
