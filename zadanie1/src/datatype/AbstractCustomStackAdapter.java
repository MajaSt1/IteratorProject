package datatype;


import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

import messages.StandardMessages;


/**
 * Do not modify this class if it is not necessary.
 *
 * @param <T>
 */
public abstract class AbstractCustomStackAdapter<T> implements Deque<T> {
    @Override
    public void addFirst(T t) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public void addLast(T t) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean offerFirst(T t) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean offerLast(T t) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T removeFirst() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T removeLast() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T pollFirst() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T pollLast() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T getFirst() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T getLast() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T peekFirst() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T peekLast() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean add(T t) {
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
    public T poll() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T element() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract void push(T t);

    @Override
    public abstract T pop();

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
    public boolean equals(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }

    @Override
    public abstract int size();

    @Override
    public abstract boolean isEmpty();

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
    public Iterator<T> descendingIterator() {
        throw new UnsupportedOperationException(StandardMessages.METHOD_NOT_IMPLEMENTED);
    }
}
