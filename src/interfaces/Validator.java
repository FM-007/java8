package interfaces;

@FunctionalInterface // Esta Anotação garante que a Interface tenha apenas um metodo abstrato...
public interface Validator<T> {

    boolean validate(T t);
}
