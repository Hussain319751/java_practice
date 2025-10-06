package com.exceptions.practice;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
	
    public static void main(String[] args) {
    	
    	Scanner sc=new Scanner(System.in);

    	int[] ar= {1,2,3};
    	
//    	try {
//    		throw new CustomException("new exception");
//    	}catch (Exception e) {
////    		System.out.println(e);
////    		System.out.println(e.getMessage());
////    		e.printStackTrace();
//		}
    	
    	try {
    	    throw new CustomException("custom exception");
    	} catch (Exception e) {
    	    System.out.println("Caught: " + e);
    	}
    	
    	try {
            throw new ArithmeticException("custom exception");
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }


//    	
    	
//    	int idx=sc.nextInt();
//    	try {
//    		try {
//    			System.out.println("the value at index"+ar[4]);
//    			
//    		}catch(IllegalArgumentException e) {
//    			System.out.println("the  inside exception is"+e);
//    		}
//    	}catch(IllegalArgumentException e){
//    		System.out.println("outside excep" +e);
//    	}
//        
        
        
        
        
        
        
        
//        try {
//        	int a=2;
//        	int b=0;
//        	System.out.println(a/b);
//        }catch (ArithmeticException e) {
//			System.out.println("Exception"+e);
//		}finally {
//        System.out.println("end");
//		}
//        System.out.println("end");

    }
    
}
