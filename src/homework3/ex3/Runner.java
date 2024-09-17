package homework3.ex3;

import java.util.function.Consumer;

public class Runner {
    public static void main(String[] args) {
        //Задание №3: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать класс уран (без атрибутов и методов)
        //Создать класс дерево (без атрибутов и методов)
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!

        Consumer<Uran> nuclearReactor = (uran) -> System.out.println("зеленый свет вокруг!");
        Uran uran = new Uran();
        nuclearReactor.accept(uran);

        Consumer<Wood> bonfire = (wood) -> System.out.println("желто-красный свет вокруг!");
        Wood wood = new Wood();
        bonfire.accept(wood);
    }
}
