package homework3.ex4;

import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {
        //Задание №4: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать класс животное (длина тела, длина хвоста)
        //Создать класс лодка(длина)
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка, возвращает длину лодки
        //Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста

        Function<Boat, Integer> getBoatLength = (boat) -> boat.getLength();
        Boat boat = new Boat(3);
        System.out.println("Длина лодки: " + getBoatLength.apply(boat) + "м.");

        Function<Animal, Integer> getAnimalLength = (animal) -> animal.getLengthBody() + animal.getLengthTail();
        Animal animal = new Animal(40, 15);
        System.out.println("Длина животного: " + getAnimalLength.apply(animal) + "см");
    }
}
