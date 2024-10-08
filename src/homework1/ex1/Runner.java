package homework1.ex1;

import homework1.ex1.animal.Bird;
import homework1.ex1.animal.Dog;
import homework1.ex1.animal.Tiger;

public class Runner {
    public static void main(String[] args) {
        //Задание №1 Зоопарк
        //1. Создать три вида животных: Тигр - умеет рычать, Собака - умеет лаять, Птица - умеет летать.
        //Общий родитель - животное (никаких атрибутов и методов в нем нет).
        //2. Создать зоопарк, который может хранить в себе 3 животных любого типа.
        //Т.е. могут быть следующие зоопарки:
        // Зоопарк в котором Тигр, Тигр, Птица
        // Зоопарк в котором Собака, Собака, Собака
        // Зоопарк в котором Птица, Птица, Тигр.
        //3. Сделать геттеры на всех животных.
        //Сделать так, чтобы при получении животного, мы могли воспользоваться специфичным для него действием.
        //Т.е. создали зоопарк Тигр, Собака, Птица (положили в этот зоопарк животных  при создании).
        //Получили первое животное (тигра) - вызвали у него рык
        //Получили второе животное (собака) - вызвали у него лай
        //Получили первое животное (птица) - вызвали у него полет
        //Запрещено пользоваться instanceOf.

        Tiger tiger = new Tiger();
        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Bird bird = new Bird();
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        Zoo<Tiger, Dog, Bird> animalZoo = new Zoo<>(tiger, dog, bird);
        animalZoo.getAnimal1().growl();
        animalZoo.getAnimal2().bark();
        animalZoo.getAnimal3().fly();
    }
}