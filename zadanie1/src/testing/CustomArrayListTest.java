package testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import datastructure.list.CustomArrayList;


public class CustomArrayListTest {
	private CustomArrayList custom;
	
	String[] imiona = {"Ala", "Ola", "Ela", "Ula"};
    Integer[] liczby = {2, 31, 52, 6};
    Boolean[] odpowiedzi = {false, true, true, false, true};
    
	@Test
	public void getArrayList(){
		//Given 
		custom=new CustomArrayList();
		//When
		int size=custom.size();
		//Then
		Assert.assertEquals(size,10);
		
		
	}

}
