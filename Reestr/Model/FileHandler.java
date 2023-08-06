package Reestr.Model;

import java.io.IOException;
import java.util.List;

import Reestr.Animal.Animal;

public interface FileHandler {
    
    public List<Animal> read(String path) throws IOException;

    public void write(String filePath, Iterable<Animal> iterable) throws IOException;
    
}
