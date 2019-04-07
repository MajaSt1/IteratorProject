package datastructure.list;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Filter iterator
 */
public class FilterIterator<T> implements Iterator<T> {
    

    public FilterIterator(List<T> list, Predicate<T> predicate) {
         
    }

    @Override
    public boolean hasNext() {
         
        return false;
    }

    @Override
    public T next() {
        
        return null;
    }

    @Override
    public void remove() {
        
    }
}
