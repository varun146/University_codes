package WilliamFiset.Stack;

public interface Stack<T> {

    public boolean isEmpty();
    public void push(T elem);
    public T pop();
    public int size();
    public T peek();
}
