package Reestr.Menu;

import java.time.LocalDate;
import java.util.Scanner;
import Reestr.House.Barn;
import Reestr.House.Horce_donkey;
import Reestr.House.House;
import Reestr.House.Yaung;

public class ConsolePrint implements ViewConsole {
    public static void main(String[] args) {
        ConsolePrint a = new ConsolePrint();
        a.choiceAnimal();
    }

    private Scanner iScanner;
    private int month_birth;

    LocalDate date = LocalDate.now();
    House[] houses = new House[] { new Barn(), new Horce_donkey(), new Yaung() };

    public ConsolePrint() {
        iScanner = new Scanner(System.in);
    }

    @Override
    public String inputName() {
        System.out.println("Введите кличку живонотого (если ее нет, то введите - noname): ");
        return iScanner.next();
    }

    @Override
    public char inputGender() {
        boolean is_ok = false;
        Character[] gender = { 'm', 'f' };
        while (!is_ok) {
            System.out.println("Выберите пол животного (Введите номер пункта) : ");
            listAnswer(gender);
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    int num = Integer.parseInt(input);
                    if (num > 0 && num <= gender.length) {
                        is_ok = true;
                        return gender[num - 1];
                    } else
                        System.out.println("Ошибка! Некорректное число.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        return 'n';
    }

    @Override
    public int choiceHouseID() {
        boolean is_ok = false;
        while (!is_ok) {
            System.out.println("Выберите место размещения животного (Введите номер пункта): ");
            printNameHouses();
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    int num = Integer.parseInt(input);
                    if (num > 0 && num <= houses.length) {
                        is_ok = true;
                        return houses[num - 1].getHouseid();
                    } else
                        System.out.println("Ошибка! Некорректное число.");
                }
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

        boolean is_ok = false;
        int day;
        while (!is_ok) {
            System.out.println("Введите день рождения животного: ");
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    day = Integer.parseInt(input);
                    if (month_birth == 1 || month_birth == 3 || month_birth == 5 || month_birth == 7 || month_birth == 8
                            || month_birth == 10 || month_birth == 12) {
                        if (day > 0 && day < 32) {
                            is_ok = true;
                            return day;
                        } else
                            System.out.println("Ошибка! Некорректно введен день.");
                    }
                    if (month_birth == 2) {
                        if (day > 0 && day < 29) {
                            is_ok = true;
                            return day;
                        } else
                            System.out.println("Ошибка! Некорректно введен день.");
                    }
                    if (month_birth == 4 || month_birth == 6 || month_birth == 9 || month_birth == 11) {
                        if (day > 0 && day < 31) {
                            is_ok = true;
                            return day;
                        } else
                            System.out.println("Ошибка! Некорректно введен день.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число!");
            }
        }
        is_ok = false;
        return 1;
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
        boolean is_ok = false;
        int year;
        while (!is_ok) {
            System.out.println("Введите год рождения: ");
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    year = Integer.parseInt(input);
                    if (year > 1950 && year < date.getYear()) {
                        is_ok = true;
                        return year;
                    } else
                        System.out.println("Ошибка! Некорректно введен год.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число!");
            }
        }
        is_ok = false;
        return 1900;
    }

    @Override
    public int inputMonth_birth() {
        boolean is_ok = false;
        String[] monthes = { "январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь",
                "октябрь", "ноябрь", "декабрь" };
        while (!is_ok) {
            System.out.println("Выберите месяц рождения животного (Введите номер пункта) : ");
            listAnswer(monthes);
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    month_birth = Integer.parseInt(input);
                    if (month_birth > 0 && month_birth <= monthes.length) {
                        is_ok = true;
                        return month_birth;
                    } else
                        System.out.println("Ошибка! Некорректное число.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        return 1;
    }

    public int choiceClass_typeID() {
        boolean is_ok = false;
        String[] classes_typeID = { "Домашние животные", "Вьючные животные" };
        while (!is_ok) {
            System.out.println("Выберите тип животного (Введите пунк меню):");
            listAnswer(classes_typeID);
            try {
                String input = iScanner.next();
                if (isDigit(input)) {
                    int num = Integer.parseInt(input);
                    if (num > 0 && num <= classes_typeID.length) {
                        is_ok = true;
                        return num;
                    } else
                        System.out.println("Ошибка! Некорректное число.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите пунтк меню.");
            }
        }
        is_ok = false;
        return 0;

    }

    @Override
    public int choiceAnimal() {
        boolean is_ok = false;
        int class_typeID = choiceClass_typeID();
        switch (class_typeID) {
            case 1:
                String[] home = { "Собака.", "Кот." };
                while (!is_ok) {
                    System.out.println("Выберите животное (Введите пунк меню):");
                    listAnswer(home);
                    try {
                        String input = iScanner.next();
                        if (isDigit(input)) {
                            int num = Integer.parseInt(input);
                            if (num > 0 && num <= home.length) {
                                is_ok = true;
                                return num;
                            } else
                                System.out.println("Ошибка! Некорректное число.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка! Введите пунтк меню.");
                    }
                }

                is_ok = false;
                return 0;

            case 2:
                String[] pack = { "Осел.", "Верблюд", "Лошадь." };
                while (!is_ok) {
                    System.out.println("Выберите животное (Введите пунк меню):");
                    listAnswer(pack);
                    try {
                        String input = iScanner.next();
                        if (isDigit(input)) {
                            int num = Integer.parseInt(input);
                            if (num > 0 && num <= pack.length) {
                                is_ok = true;
                                return (num) + 100;

                            } else
                                System.out.println("Ошибка! Некорректное число.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка! Введите пунтк меню.");
                    }
                }

                is_ok = false;
                return 0;
            default:
                break;
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'choiceAnimal'");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public int choiceAnimalID() {
        boolean is_ok = false;
        while (!is_ok) {
            System.out.println("Введите индекс животного:");
            String input = iScanner.next();
            try {
                if (isDigit(input)) {
                    int num = Integer.parseInt(input);
                    is_ok = true;
                    return num;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Некорректное число.");
            }

        }

        return 0;

    }

    @Override
    public String findNameAnimal() {
        System.out.println("Введите имя для поиска: ");
        return iScanner.next();
    }

}
