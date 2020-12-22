package week8.lambda;

public class Box<T> {
    private T content;

    public Box(T content) {
        if (content == null)
            throw new IllegalArgumentException();
        this.content = content;
    }

    public T content() {
        return content;
    }

    public <O> O apply(BoxFunction<T, O> boxFunction) {
        return boxFunction.apply(content);
    }
}
