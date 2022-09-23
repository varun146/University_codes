package WilliamFiset.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <T> {
    private int size;
    private int cap;
    private Object[] arr;

    ArrayStack(){
        cap = 16;
        arr = new Object[cap];
    }

    public int size()  {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T elem){
        if(size==cap){
            increaseCap();;
        }
        arr[size++] = elem;
    }

    public void increaseCap(){
        cap *= 2;
        arr = Arrays.copyOf(arr, cap);
    }

    public T pop(){
        if(isEmpty()) throw new EmptyStackException();
        T elem = (T) arr[--size];
        arr[size] = null;
        return elem;
    }

    public T peek(){
        if(isEmpty()) throw new EmptyStackException();
        return (T) arr[size-1];
    }

    public void printStack(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }


}
