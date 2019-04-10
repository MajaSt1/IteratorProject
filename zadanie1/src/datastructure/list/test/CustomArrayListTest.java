package datastructure.list.test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import datastructure.list.CustomArrayList;


public class CustomArrayListTest<T> {
	

    CustomArrayList<Integer> custom;

	@Test
	public void testDefaultSize() {
		// Given
		custom = new CustomArrayList<>();
		// When
		int size = custom.size();
		// Then
		Assert.assertEquals(size, 10);
	}
	
	@Before
	public void doList(){
    custom= new CustomArrayList<>(4);
	custom.add(1);
	custom.add(2);
	custom.add(4);
	custom.add(5);
	}
	
	@ Test
	public void testRandomSize(){
	
		//
		assertEquals(custom.size(),4);
	}

	@Test
	public void testIsEmpty() {
		//
		//
		custom.clear();
		boolean isEmpty = custom.isEmpty();
		//
		Assert.assertTrue(isEmpty);
	}
	
	@Test
	public void testIsEmptyClear() {
		//
		custom = new CustomArrayList<>(0);
		//
		boolean isEmpty = custom.isEmpty();
		//
		Assert.assertTrue(isEmpty);
	}

	@Test
	public void testIndexOf() {
		//
		int index= custom.indexOf(new Integer(4));
		//
		Assert.assertEquals(2, index);
	}
	
	@ Test
	public void testNullIndex(){
		//
		custom= new CustomArrayList <>();
		//
		int index= custom.indexOf(null);
		//
		assertEquals(-1, index);
	}

	@Test
	public void testContains() {
		//
		//
		boolean contains= custom.contains(new Integer(1));
	
		//
		assertTrue(contains);
	}
	
	@Test
	public void shouldNotContainstest(){
		//
		//
		boolean contains= custom.contains("integer");
		//
		assertFalse(contains);
	}
	
	@Test
	public void shouldNotContainsTestEmpty(){ 
		//
		custom= new CustomArrayList<>();
		//
		boolean containsEmpty= custom.contains("null");
		//
		assertFalse(containsEmpty);
		
	}

	@Test
	public void shouldRemoveObjectTest() {
		//
		//
		boolean removeObject= custom.remove(new Integer(5));
		//
		assertTrue(removeObject);
	}
	
	@Test
	public void shouldRemoveNullObjectTest() {
		//
		custom= new CustomArrayList<>(5);
		custom.add(1);
		custom.add(2);
		custom.add(4);
		custom.add(null);
		//
		boolean removeObject= custom.remove(null);
		//
		assertTrue(removeObject);
	}
	
	@Test
	public void shouldNotRemoveObjectTest() {
		//
		//
		boolean removeObject= custom.remove("test");
		//
		assertFalse(removeObject);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void shouldThrowExceptionRemoveObjectTest() {
		//
		//
		custom = new CustomArrayList<>(0);
		//
		custom.remove(new Integer(1));
	}

	@Test
	public void testGet() {
		//
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.get(0);
		//
		assertEquals(element, new Integer(1));
	}
	
	@Test(expected = IndexOutOfBoundsException.class )
	public void testNotGet(){
		//
		//
		custom= new CustomArrayList<>(1);
		custom.add(1);
		//
		T element = (T) custom.get(-1);	
	}

	@Test
	public void testSet() {
		//
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.set(0, new Integer(8));
		@SuppressWarnings("unchecked")
		T newElement= (T) custom.get(0);
		//
		assertEquals(element, new Integer(1));
		assertEquals(newElement, new Integer(8));
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void throwExceptionTestSet(){
		//
		//
		custom= new CustomArrayList<>(4);
		custom.add(1);
		//
		@SuppressWarnings("unchecked")
		T element = (T) custom.set(10, new Integer(8));
	}

	@Test
	public void testAddIntTAtBorder() {
		//
		//
		custom.add(3, new Integer(2));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(3);
		//
		assertEquals(element, new Integer(2));
		assertEquals(custom.size(), 4);
	}
	
	@Test
	public void testAddIntT() {
		//
		//
		int size1= custom.size();
		custom.add(1,new Integer(18));
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(1);
		
        //
		assertEquals(4,size1);
	//	assertEquals(element, new Integer(18));
	//	assertEquals( custom.size(), 5);	
	}
	
	@Test
	public void testAddIntTNull() {
		//
		//
		int size1= custom.size();
		custom.add(3,null);
		@SuppressWarnings("unchecked")
		T element= (T) custom.get(3);
		
        //
		assertEquals(4,size1);
		assertEquals(element, null);
		assertEquals( custom.size(), 4);	
		
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void shouldThrowExceptionAddIntT(){
     	//

		//
		custom.add(4, new Integer(2));
	}
	
	@Test
	public void shouldReturnOldValueRemoveIntTest() {
	    //
		//
		@SuppressWarnings("unchecked")
		T element= (T)custom.remove(2);
		int size= custom.size();
		//
		assertEquals(element, 4);
	}
	
	@Test (expected= IllegalArgumentException.class)
	public void shouldReturnExceptionRemoveIntTest() {
		//
		custom= new CustomArrayList<>();
		//
		@SuppressWarnings("unchecked")
		T element= (T)custom.remove(2);
		//
	}

	@Test
	public void testIncreasingArrayLength() {
		
	}
	
	@Test
	public void testIteratorHasNextTrue() {
		//
		boolean hasNext= custom.iterator().hasNext();
		//
		assertTrue(hasNext);
	}
	
	@Test(expected= NoSuchElementException.class )
	public void testIteratorNextException() {
		//
		custom= new CustomArrayList<>(0);
		//
		custom.iterator().hasNext();
        custom.iterator().next();
		//
	}

	@Test
	public void testIteratorNextValue() {
      	//
		custom= new CustomArrayList<Integer>(3);
		custom.add(2);
		custom.add(3);
		custom.add(7);
		//
	     custom.iterator().hasNext();
		@SuppressWarnings("unchecked")
		T next= (T) custom.iterator().next();
		//
		Assert.assertEquals(2, next);	
	}
	
	@ Test 
	public void testIteratorRemove(){
		//
		custom= new CustomArrayList<Integer>(3);
		custom.add(2);
		custom.add(3);
		custom.add(7);

		//
	     custom.iterator().hasNext();
		 custom.iterator().next();
		 custom.iterator().remove();
		 int size= custom.size();
		
		//
		Assert.assertEquals(2, size);	
	}
	
	//@Test
/*	public void iterateThroughArrayList(){
		//
		custom.add(2);
		custom.add(3);
		custom.add(4);
		//
		
		int count=0;
		while(custom.iterator().hasNext()){
			Integer element= custom.iterator().next();
			count ++;}
	   //
		assertEquals(count, 3); */

}
