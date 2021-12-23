package com.pal.demo.entity;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class isPalTest {
	private PalObj palindrome;
	private String input;
	
	
	@Test
	void isPaltest() {
		PalObj obj=new PalObj();
		String str="civic";
		Boolean res=obj.isPal(str);
		assertEquals(true,res);
		
	}
	
	

}
