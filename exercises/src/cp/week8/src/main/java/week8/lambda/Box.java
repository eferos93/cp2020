package week8.lambda;

public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T content() {
        return content;
    }
}
