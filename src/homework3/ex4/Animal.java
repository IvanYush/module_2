package homework3.ex4;

/**
 * Животное
 */
public class Animal {
    private int lengthBody;
    private int lengthTail;

    public Animal(int lengthBody, int lengthTail) {
        this.lengthBody = lengthBody;
        this.lengthTail = lengthTail;
    }

    public int getLengthBody() {
        return lengthBody;
    }

    public int getLengthTail() {
        return lengthTail;
    }
}
