package ds.Anosov.SimpleTasks.FoxyCat.Animals;

public abstract class Animal {
    private String name;
    private int age;
    private Color color;

    public Animal(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Color getColor() {
        return this.color;
    }
}
