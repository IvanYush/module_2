package homework2.ex1;

import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

    private static final int BAGGAGE_LIMIT = 10;
    private static final String DELIMITER = ";";

    public static void main(String[] args) {
        //1. Задание: Грузчики в Болгарии
        //В аэропорт Болгарии прилетает самолет. В самолете багаж.
        //На выгрузной ленте может находиться не больше 10 чемоданов.
        //Задача: разгрузить багажное отделение самолета, загружая на ленту не более 10 чемоданов.
        //Примечание: багаж должен отдаваться в том же порядке, в котором попадал на ленту.

        //Т.е нужно создать функцию, в которую приходит имя файла(это прибывший багаж).
        //От туда будет считываться порциями по 10 штук багаж. Этот багаж перемещается на ленту.
        //Печатается: Начинается загрузка на ленту
        //После того как лента заполнена или больше нет чемоданов:
        //Печатается: Лента загружена, начинается выдача багажа.
        //Лента включается и с нее пропадают чемоданы.
        //Печатается на экран: {Номер багажа} - выдан
        //После окончания выдачи печатается: Лента пустая, закончена выдача багажа

        //Т.е. прибыл багаж (файл luggage.csv).
        //Там находится 20 чемоданов(номера от 1 до 20) . На экране будет выведено:
        //Начинается загрузка на ленту
        //Лента загружена, начинается выдача багажа
        //1 - выдан
        //2 - выдан
        //....
        //10 - выдан
        //Лента пустая, закончена выдача багажа
        //Начинается загрузка на ленту
        //Лента загружена, начинается выдача багажа
        //11 - выдан
        //12 - выдан
        //....
        //20 - выдан
        //Лента пустая, закончена выдача багажа

        //Протестировать функцию на файле luggage.csv.
        String filename = "luggage.csv";
        Scanner scanner = new Scanner(homework2.ex1.Runner.class.getClassLoader().getResourceAsStream(filename));

        baggageBelt(scanner);
    }

    private static void baggageBelt(Scanner scanner) {
        LinkedList<String> baggageName = new LinkedList<>();
        scanner.nextLine();
        while (scanner.hasNext()) {
            System.out.println("Начинается загрузка на ленту");
            for (int i = 0; i < BAGGAGE_LIMIT; i++) {
                String baggageInfoString = scanner.nextLine();
                String[] baggageInfoArray = baggageInfoString.split(DELIMITER);
                baggageName.addLast(baggageInfoArray[0]);
            }
            System.out.println("Лента загружена, начинается выдача багажа");
            while (!(baggageName.isEmpty())) {
                System.out.printf("%s - выдан\n", baggageName.pollFirst());
            }
            System.out.println("Лента пустая, закончена выдача багажа");
        }
        scanner.close();
    }
}