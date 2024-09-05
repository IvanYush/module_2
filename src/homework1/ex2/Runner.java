package homework1.ex2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 Гидрометцентр
        //Создать две структуры данных, в которых будет статистика по дням (среднесуточная температура воздуха)
        //Январь: 0,-1,-1,-2,-5,-6,-7,-8,-9,-10,-5,-5,-2,-7,-3,-1,-8,-9,-8,-8,-18,-20,-23,-24,-25,-9,-8,-7,-6,-5,-1
        //Февраль: -8,-10,-12,-13,-15,-16,-12,-7,-8,-10,-10,-9,-8,-8,-8,-9,-10,-9,-5,-6,-8,-7,-8,-9,-6,-5,-3,-1
        //Объединить данные за январь и февраль, посчитать среднесуточную температуру воздуха за 2 месяца.
        //Запрещено использовать массивы.

        ArrayList<Integer> january = new ArrayList<>(List.of(0, -1, -1, -2, -5, -6, -7, -8, -9, -10, -5, -5,
                -2, -7, -3, -1, -8, -9, -8, -8, -18, -20, -23, -24, -25, -9, -8, -7, -6, -5, -1));
        ArrayList<Integer> february = new ArrayList<>(List.of(-8, -10, -12, -13, -15, -16, -12, -7, -8, -10,
                -10, -9, -8, -8, -8, -9, -10, -9, -5, -6, -8, -7, -8, -9, -6, -5, -3, -1));

        arrayMonthAverageTemperature(oneMonthAverageTemperature(january), oneMonthAverageTemperature(february));
    }

    /**
     * Высчитаывает среднее арифметическое значение в рамках месяца
     */
    public static BigDecimal oneMonthAverageTemperature(ArrayList<Integer> month) {
        BigDecimal monthAverageTemperature = BigDecimal.ZERO;
        for (int dayTemperature : month) {
            monthAverageTemperature = monthAverageTemperature.add(BigDecimal.valueOf(dayTemperature));
        }
        monthAverageTemperature = monthAverageTemperature.divide(BigDecimal.valueOf(month.size()), 1,
                RoundingMode.HALF_UP);
        System.out.println("Средняя температура за выбранный месяц: " + monthAverageTemperature);
        return monthAverageTemperature;
    }

    /**
     * Высчитывает среднее арифметическое значение по месяцам
     */
    public static void arrayMonthAverageTemperature(BigDecimal... monthAverage) {
        BigDecimal monthsAverageTemperatureSum = BigDecimal.ZERO;
        for (BigDecimal value : monthAverage) {
            monthsAverageTemperatureSum = monthsAverageTemperatureSum.add(value);
        }
        monthsAverageTemperatureSum = monthsAverageTemperatureSum.divide(BigDecimal.valueOf(monthAverage.length),
               1, RoundingMode.HALF_UP);
        System.out.println("Средняя температура за указанные месяцы: " + monthsAverageTemperatureSum);
    }
}