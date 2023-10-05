@FunctionalInterface
public interface StringTransformer<T> {
    T transform(T str);
}
