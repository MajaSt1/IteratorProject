package testing;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import datastructure.list.CustomArrayList;

//import org.mockito.runners.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
public class CustomArrayListTest {
	private CustomArrayList custom;
	@Test
	public void getArrayList(){
		//Given 
		custom=new CustomArrayList();
		//When
		int size=custom.getvalue();
		//Then
		Assert.assertEquals(size,10);
		
		
	}

}
