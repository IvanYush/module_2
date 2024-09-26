package homework4.ex1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //ИСПОЛЬЗОВАНИЕ FOR, WHILE ЗАПРЕЩЕНО В ЭТОЙ ДЗ! Только СТРИМЫ.

        //Задание №1 - Список спец номеров
        //Нам необходимо распечатать список номеров, которые принадлежат чиновникам
        //1. Создать класс машина. У машины есть номер.
        //2. Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
        //3. Создать 50 машин с номерами к0[01-50]се178 (где [01-50] - это все значения от 01 до 50)
        //4. Объединить машины в единый стрим
        //5. Оставить в объединенном стриме машины с номерами 04[0-9] - это номера, выдаваемые чиновникам
        //6. Получить из оставшихся машин номера.
        //7. Распечатать номера.
        //ожидаемый результат:
        // a040ан799
        // a041ан799
        // ...
        // k048се178
        // k049се178

        AtomicInteger carNumber = new AtomicInteger(00);

        Stream<Integer> carNumbers = Stream.generate(() -> carNumber.addAndGet(01)).limit(50);

        List<Car> cars1 = carNumbers.map(number -> {
            Car car = new Car();
            car.setNumber("a0" + carNumber + "ан799");
            return car; }).toList();

        List<Car> cars2 = carNumbers.map(number -> {
            Car car = new Car();
            car.setNumber("к0" + carNumber + "се178");
            return car; }).toList();

//        Stream<Car> carStream = Stream.concat(cars1.stream(), cars2.stream());
//        carStream.forEach(System.out::println);


    }
}