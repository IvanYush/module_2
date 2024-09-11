package homework2.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    private static final String DELIMITER = ";";
    private static final String LIGHT_BAGGAGE = "Лёгкий";
    private static final String MEDIUM_BAGGAGE = "Средний";
    private static final String HEAVY_BAGGAGE = "Тяжёлый";


    public static void main(String[] args) {
        //2. Задание: Таможня в Болгарии
        //Таможня собирает статистику о весе ввезенных чемоданов.
        //Есть 3 категории чемоданов: легкий (до 5 кг), средний (от 5 кг до 10кг), тяжелый (от 10 кг)
        //Необходимо создать функцию, которая:
        //считывает файл с багажом, суммирует вес по каждой категории и возвращает сгруппированные данные
        //т.е функция должна вернуть данные (не распечатать), в которых будет инфо:
        //категория чемодана - сумма всех чемоданов этой категории

        //Пример возврата:
        //легкий - 205
        //средний - 513
        //тяжелый - 1200

        //Протестировать функцию на файле luggage.csv.
        String filename = "luggage.csv";
        Scanner scanner = new Scanner(homework2.ex2.Runner.class.getClassLoader().getResourceAsStream(filename));

        System.out.println(baggageInfo(scanner));
    }

    private static HashMap baggageInfo(Scanner scanner) {
        HashMap<String, Integer> baggageInfo = new HashMap<>();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            String[] baggage = text.split(DELIMITER);
            int weight = Integer.parseInt(baggage[1]);
            if (weight < 5) {
                baggageInfo.put(LIGHT_BAGGAGE, baggageInfo.getOrDefault(LIGHT_BAGGAGE, 0) + weight);
            } else if (weight < 10) {
                baggageInfo.put(MEDIUM_BAGGAGE, baggageInfo.getOrDefault(MEDIUM_BAGGAGE, 0) + weight);
            } else {
                baggageInfo.put(HEAVY_BAGGAGE, baggageInfo.getOrDefault(HEAVY_BAGGAGE, 0) + weight);
            }
        }
        scanner.close();
        return baggageInfo;
    }
}