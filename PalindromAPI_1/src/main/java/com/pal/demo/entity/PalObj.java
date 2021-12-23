package com.pal.demo.entity;
import java.util.stream.IntStream;

import com.fasterxml.jackson.annotation.JsonProperty;
public class PalObj {

	@JsonProperty("pal")
	private String pal;

	public PalObj() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	public PalObj(String pal) {
		super();
		this.pal = pal;
	}


	public String getPal() {
		return pal;
	}

	public void setPal() {
		this.pal = pal;
	}
	
	
	
	


	public boolean isPal(String tempString) {
		 return IntStream.range(0, tempString.length() / 2)
		            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
	}
	
	
}
