package homework3.ex5;

import java.time.LocalDateTime;

/**
 * Отзывы
 */
public class Feedback {
    private Integer id;
    private String text;
    private Integer countLike;
    private LocalDateTime feedbackDateTime;

    public Feedback(int id, String text, int countLike, LocalDateTime feedbackDateTime) {
        this.id = id;
        this.text = text;
        this.countLike = countLike;
        this.feedbackDateTime = feedbackDateTime;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getCountLike() {
        return countLike;
    }

    public LocalDateTime getFeedbackDateTime() {
        return feedbackDateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", countLike=" + countLike +
                ", feedbackDateTime=" + feedbackDateTime +
                '}';
    }
}
