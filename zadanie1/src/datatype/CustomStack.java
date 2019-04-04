package datatype;

import java.util.List;

/**
 * Stack, LIFO queue
 */
public class CustomStack<T> extends AbstractCustomStackAdapter<T> {
    List<T> storage = null;

    /* (TODO Starterkit 1) Please introduce a sensible implementation */
    public CustomStack(List<T> storage) {
        this.storage = storage;
    }

    @Override
    public void push(T t) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
    }

    @Override
    public T pop() {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public int size() {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    @Override
    public boolean isEmpty() {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }
}
