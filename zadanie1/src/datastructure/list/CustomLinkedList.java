package datastructure.list;

import java.util.Iterator;

/**
 * List based on recursively related objects
 *
 * @param <T>
 */
public class CustomLinkedList<T> extends AbstractCustomListAdapter<T> {
    /* (TODO Starterkit 1) Please introduce a sensible implementation for storage*/

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

    @Override
    public boolean contains(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return new CustomLinkedListIterator<>();
    }

    @Override
    public boolean add(T t) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public boolean remove(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public void clear() {
        /* (TODO Starterkit 1)  Please introduce a sensible implementation */
    }

    @Override
    public T get(int index) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public T set(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public void add(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
    }

    @Override
    public T remove(int index) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public int indexOf(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    /**
     * Iterator for CustomLinkedList
     */
    private class CustomLinkedListIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return false;
        }

        @Override
        public E next() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return null;
        }

        @Override
        public void remove() {
             /* (TODO Starterkit 1)Please introduce a sensible implementation */
        }
    }
}
