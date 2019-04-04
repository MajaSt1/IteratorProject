package datastructure.list;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import messages.StandardMessages;

/**
 * Do not modify this class if it is not necessary.
 *
 * @param <T>
 */
public abstract class AbstractCustomListAdapter<T> implements List<T> {

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

    @Override
    public abstract boolean contains(Object o);

    @Override
    public abstract Iterator<T> iterator();

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract boolean add(T t);

    @Override
    public abstract boolean remove(Object o);

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract void clear();

    @Override
    public abstract T get(int index);

    @Override
    public abstract T set(int index, T element);


    @Override
    public abstract void add(int index, T element);

    @Override
    public abstract T remove(int index);

    @Override
    public abstract int indexOf(Object o);

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
}
