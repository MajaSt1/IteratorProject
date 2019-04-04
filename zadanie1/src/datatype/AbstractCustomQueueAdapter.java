package datatype;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

import messages.StandardMessages;

/**
 * Do not modify this class if it is not necessary.
 *
 * @param <T>
 */
public abstract class AbstractCustomQueueAdapter<T> implements Queue<T> {

    public AbstractCustomQueueAdapter() {
    }

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

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
    public boolean remove(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
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
    public void clear() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean offer(T t) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T remove() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract T poll();

    @Override
    public T element() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract T peek();
}
