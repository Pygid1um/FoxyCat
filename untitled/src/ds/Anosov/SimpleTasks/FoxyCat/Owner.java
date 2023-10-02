package ds.Anosov.SimpleTasks.FoxyCat;

import ds.Anosov.SimpleTasks.FoxyCat.Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private int age;
    private List<Animal> pets = new ArrayList<>();

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public List<Animal> getPets() {
        return pets;
    }

}
