package Heelo;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;


public class students extends Users{
	int registrationNumber;
	int semester;
	//List<String> courses = new ArrayList<String>();

	public students(String username,String name,String  department,int reggie ,int semie) {
		super(username,name,department);
		registrationNumber =reggie ;
		semester =semie;
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
