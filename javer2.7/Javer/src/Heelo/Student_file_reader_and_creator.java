package Heelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student_file_reader_and_creator {
	String susrname;
	String sname;
	String sdepartment;
	int reg;
	int semester;
	int endcounter =5;
	
	public  Student_file_reader_and_creator() {

		// TODO Auto-generated constructor stub
		
	}
	public students create(String filename) {
	    File myObj =  new File(filename);
	    
	    // try-with-resources: Scanner will be closed automatically
	    try (Scanner myReader = new Scanner(myObj)) {
	      while (myReader.hasNextLine()&& endcounter!=0) {
	        String data = myReader.nextLine();
	        String[] arr = data.split("[.]");
	        System.out.println(arr.toString());
	        for (String str : arr) {
	        	System.out.println("i entered");
	           System.out.println(str);
	 	       switch(endcounter) {
		        case 5:
		        	susrname=str;
		        	break;
		        case 4:
		        	sname=str;
		        	break;
		        case 3:
		        	sdepartment=str;
		        	break;
		        case 2:
		        	reg=Integer.parseInt(str);
		        	break;
		        case 1:
		        	semester=Integer.parseInt(str);
		        	break;
		       }
	 	      endcounter--;
	        }
/*
	       
	        susrname=arr[0];
	        sname=arr[1];
	        sdepartment=arr[2];
	        System.out.println(arr[3]);
	        reg=Integer.parseInt(arr[3].toString());
	        semester=Integer.parseInt(arr[4]);*/
	        
	        
	        
	        }
	        
	     // System.out.println(susrname);
	      
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		
		students vaggelis = new students(susrname,sname,sdepartment,reg,semester);
		
		
		
		return vaggelis;
		
	}

}
