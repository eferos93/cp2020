package week8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public static <I, O> List<Box<O>> applyToAll(List<Box<I>> list, BoxFunction<I, O> boxFunction) {
        return list.stream().map(iBox -> new Box<O>(iBox.apply(boxFunction))).collect(Collectors.toList());
    }
}
