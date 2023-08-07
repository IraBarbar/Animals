package Reestr.Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Reestr.Animal.Animal;
import Reestr.Animal.Camel;
import Reestr.Animal.Cat;
import Reestr.Animal.Dog;
import Reestr.Animal.Donkey;
import Reestr.Animal.Horce;

public class TextFileHandler implements FileHandler {
    // public static void main(String[] args) {
    // TextFileHandler rr = new TextFileHandler();
    // try {
    // List <Animal> aa = rr.read("/Reestr/Presenter/FriandsMan.txt");
    // for (Animal animal : aa) {
    // System.out.println( animal.toString());}
    // } catch (IOException e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }

    // }

    @Override
    public List<Animal> read(String path) throws IOException {
        List<Animal> animals = new ArrayList<>();
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(path);
        try {
            List<String> lines = Files.readAllLines(Paths.get(pathFile));
            for (String string : lines) {
                string = string.trim();
                String[] temp = string.split(",");
                int animalID = Integer.parseInt(temp[0]);
                int class_typeID = Integer.parseInt(temp[1]);
                int classID = Integer.parseInt(temp[2]);
                String name = temp[3];
                char gender = temp[4].toCharArray()[0];
                int year_birth = Integer.parseInt(temp[5]);
                int month_birth = Integer.parseInt(temp[6]);
                int day_birth = Integer.parseInt(temp[7]);

                int year_createdAt = Integer.parseInt(temp[8]);
                int month_createdAt = Integer.parseInt(temp[9]);
                int day_createdAt = Integer.parseInt(temp[10]);

                int is_active = Integer.parseInt(temp[11]);
                int year_leaveAt = Integer.parseInt(temp[12]);
                int month_leaveAt = Integer.parseInt(temp[13]);
                int day_leaveAt = Integer.parseInt(temp[14]);

                switch (classID) {
                    case 1:
                        animals.add(new Dog(animalID, class_typeID, classID, name, gender,
                                year_birth, month_birth, day_birth, year_createdAt, month_createdAt, day_createdAt,
                                is_active, year_leaveAt, month_leaveAt, day_leaveAt));

                        break;
                    case 2:
                        animals.add(new Cat(animalID, class_typeID, classID, name, gender,
                                year_birth, month_birth, day_birth, year_createdAt, month_createdAt, day_createdAt,
                                is_active, year_leaveAt, month_leaveAt, day_leaveAt));

                        break;
                    case 101:
                        animals.add(new Donkey(animalID, class_typeID, classID, name, gender,
                                year_birth, month_birth, day_birth, year_createdAt, month_createdAt, day_createdAt,
                                is_active, year_leaveAt, month_leaveAt, day_leaveAt));

                        break;
                    case 102:
                        animals.add(new Camel(animalID, class_typeID, classID, name, gender,
                                year_birth, month_birth, day_birth, year_createdAt, month_createdAt, day_createdAt,
                                is_active, year_leaveAt, month_leaveAt, day_leaveAt));

                        break;
                    case 103:
                        animals.add(new Horce(animalID, class_typeID, classID, name, gender,
                                year_birth, month_birth, day_birth, year_createdAt, month_createdAt, day_createdAt,
                                is_active, year_leaveAt, month_leaveAt, day_leaveAt));

                        break;

                    default:
                        break;
                }

            }
        } catch (IOException e) {
            throw new IOException("Failed to read file.", e);
        }
        return animals;
    }

    @Override
    public void write(String path, Iterable<Animal> iterable) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat(path);
        File file = new File(pathFile);

        try (FileWriter fileWriter = new FileWriter(file)) {
            Iterator<Animal> iterator = iterable.iterator();

            while (iterator.hasNext()) {
                Animal animals = iterator.next();

                String formattedAnimal = animals.wrireText();
                fileWriter.write(formattedAnimal);
                if (iterator.hasNext()) {
                    fileWriter.write(",\n");
                }
            }

            System.out.println("File saved successfully.");
        } catch (IOException e) {
            throw new IOException("Failed to write to file.", e);
        }
    }

}
