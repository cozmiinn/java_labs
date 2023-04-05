package ex1;

@FunctionalInterface
public interface Filtru<T> {
    public boolean test(T p);
}
