package testing;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

import datastructure.list.CustomLinkedList;

public class CustomLinkedListTest {
	
	@Test
	public void iterate_through_linkedList(){
		//Given
		CustomLinkedList <Integer> linkedlist= new CustomLinkedList();
		
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		//When
		
		Iterator <Integer> list=linkedlist.iterator();
		
		int count=0;
		
		while(list.hasNext()){
			Integer element= list.next();
			
			count ++;
		}
	   //Then
		assertEquals(count, 3);
	}
}
