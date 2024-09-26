package homework4.ex1;

/**
 * Машина
 */
public class Car {
    private String number;

    public Car() {
    }

    public Car(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
