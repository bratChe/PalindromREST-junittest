package com.pal.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pal.demo.entity.PalObj;

@RestController
@RequestMapping("/api/v1/")	
public class PalController {

	@PostMapping(value = "/ispal",
			 consumes = {"application/json", "application/xml"}
		    )
public ResponseEntity<String> saveString(@RequestBody PalObj pal)
{
	
	if(pal.isPal(pal.getPal())) {
	String responsemsg="Palindrome";
	return new ResponseEntity<String>(responsemsg, HttpStatus.CREATED);}
	else {
		String responsemsg="Not Palindrome";
		return new ResponseEntity<String>(responsemsg, HttpStatus.CREATED);}
	}
	
	

//takes list of string and display elements that are palindromes
@PostMapping("/pallist")
public ResponseEntity<List<String>> saveString()
{
	
	List<String> pal=Arrays.asList("civic","honda", "cccc");
	List<String> temp = new ArrayList<String>();
	
	pal.forEach(
			(o)->{
				if(IntStream.range(0, o.length() / 2)
	            .noneMatch(i -> o.charAt(i) != o.charAt(o.length() - i - 1))) 
				{
					temp.add(o);
				}
			
			}
			
			
			);
	
	return new ResponseEntity<>(temp, HttpStatus.OK);
}
	}



	

