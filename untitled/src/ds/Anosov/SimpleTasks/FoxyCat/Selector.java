package ds.Anosov.SimpleTasks.FoxyCat;
/*
Есть клуб любителей животных. Завтра у них день «рыжего кота».
В клубе есть владельцы животных, у каждого из которых есть список питомцев. Это могут быть не только коты.

Задача: нужно выбрать имена всех рыжих котов, чтобы на завтра распечатать для них именные поздравительные открытки с
«Профессиональным праздником». Открытки должны быть отсортированы по возрасту кота: от более старого до более молодого.
 */

/*
Осталось дописать код метода main, в котором вначале вызовем метод initData(),
 который заполнит данными список владельцев животных в клубе, а потом выберет имена рыжих котов,
 отсортированных по возрасту в убывающем порядке.
*/

import ds.Anosov.SimpleTasks.FoxyCat.Animals.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Selector {
    private static List<Owner> owners;

    public static void initData() {

        final Owner ownerFirst = new Owner("Сергей Буйнов", 22);
        ownerFirst.getPets().addAll(List.of(
                new Cow("Марта", 5, Color.BLACK),
                new Cat("Васька", 3, Color.WHITE),
                new Snake("Гадюка", 1, Color.BLACK)
        ));

        final Owner ownerSecond = new Owner("Наталья Головина", 29);
        ownerSecond.getPets().addAll(List.of(
                new Dog("Амур", 4, Color.BLACK),
                new Cat("Мурка", 6, Color.FOXY)
        ));

        final Owner ownerThird = new Owner("Роман Курник", 32);
        ownerThird.getPets().addAll(List.of(
                new Cow("Римка", 8, Color.WHITE),
                new Cat("Барсик", 4, Color.FOXY)
        ));

        final Owner ownerFourth = new Owner("Екатерина Жукова", 39);
        ownerFourth.getPets().addAll(List.of(
                new Cat("Рыжик", 8, Color.FOXY),
                new Cat("Барсик", 8, Color.DARK_GREY),
                new Crow("Вор", 12, Color.YELLOW)
        ));

        owners = List.of(ownerFirst, ownerSecond, ownerThird, ownerFourth);
    }

    public static void main(String[] args) {
        initData();

        List<String> findNamesOfCats = new ArrayList<>();
        List<Cat> findCatsList = new ArrayList<>();

        for (Owner owner : owners) {
            for (Animal pet : owner.getPets()) {
                if (Cat.class.equals(pet.getClass()) && Color.FOXY == pet.getColor()) {
                    findCatsList.add((Cat) pet);
                }
            }
        }

        Collections.sort(findCatsList, new Comparator<Cat>() {
            @Override
            public int compare(Cat firstCat, Cat secondCat) {
                return secondCat.getAge() - firstCat.getAge();
            }
        });
        //реализация функционального интерфейса Comparator<T> через лямбда выражение
        // Collections.sort(findCatsList, (firstCat, secondCat) -> secondCat.getAge() - firstCat.getAge());

        for (Cat cat : findCatsList) {
            findNamesOfCats.add(cat.getName());
        }

        for (Cat cat : findCatsList) {
            System.out.println("Котику " + cat.getName() + ", " + cat.getAge() + " лет.");
        }
    }
}
