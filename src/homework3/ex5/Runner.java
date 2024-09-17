package homework3.ex5;

import java.time.LocalDateTime;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        //Задание №5: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37

        Feedback feedback1 = new Feedback(1, "отличный товар", 200,
                LocalDateTime.of(2024, 1, 25, 13, 37));
        Feedback feedback2 = new Feedback(2, "так себе товар", 100,
                LocalDateTime.of(2024, 1, 25, 16, 37));
        Feedback feedback3 = new Feedback(3, "плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37));
        Feedback feedback4 = new Feedback(4, "плохой товар", 100,
                LocalDateTime.of(2024, 1, 25, 13, 37));

        ArrayList<Feedback> feedbacks = new ArrayList<>(List.of(feedback1, feedback2, feedback3, feedback4));

        Comparator<Feedback> feedbackComparator = Comparator.comparingInt(Feedback::getCountLike).
                thenComparing(Feedback::getFeedbackDateTime).thenComparingInt(Feedback::getId);
        feedbacks.sort(feedbackComparator.reversed());
        System.out.println(feedbacks);
    }
}