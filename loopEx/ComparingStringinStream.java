package com.codeTest;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparingStringinStream {


	
	    public static void main(String[] args) {
	       
	       // List<String> li = new ArrayList<>();
	        
	        String[] list={"Java", "Springboot", "Microservice"};
	        
	        //List<String> list1= Arrays.asList(list); 
	        
	       //filtering the longest word from the String array
	        String longest=Stream.of(list).
	            max(Comparator.comparingInt(String::length)).get();
	        System.out.println("the longest string from the array is: "+longest+ " len:" +longest.length());
	        
	        //filtering the smallest word from the String array
	        String smallest=Stream.of(list)
	        		.min(Comparator.comparingInt(String::length)).get();
	        
	        System.out.println("the smallest string from the array is: "+smallest+ " len:" +smallest.length());
	        
	            
	        
	    }
	    
	}


