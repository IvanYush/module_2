package homework3.ex2;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        //Задание №2: Поиск пары с помощью гадания
        //Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст, рост),
        //возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно

        Predicate<Human> fortuneTellingByName = (human) -> human.getName().length() % 2 == 0;
        Predicate<Human> fortuneTellingByAgeAndHeight = (human) -> human.getAge() + human.getHeight() > 210;

        Human human = new Human("Ivan", 34, 175);
        System.out.println(fortuneTellingByName.test(human));
        System.out.println(fortuneTellingByAgeAndHeight.test(human));
    }
}
