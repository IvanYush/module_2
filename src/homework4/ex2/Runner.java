package homework4.ex2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
        //2. Создать стрим у набора
        //2.1 Посчитать количество букв "о" в одном слове
        //2.2 Посчитать сумму количества букв "о" во всех словах из набора
        //2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
        //
        //ожидаемый результат:
        //6

        HashSet<String> words = new HashSet<>(List.of("тон", "тополь", "боль", "рой", "стройка"));
        Stream<String> wordsStream = words.stream();

        Optional<Long> reduceWords = wordsStream.map(e -> e.chars()
                                                    .filter(c -> c == 'о')
                                                    .count())
                                                    .reduce((a, b) -> a + b);
        System.out.println(reduceWords.orElse(0L));
    }
}