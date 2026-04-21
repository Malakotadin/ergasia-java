package Heelo;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_file_reader_and_creator creator = new Student_file_reader_and_creator();
		students student1 = creator.create("/home/meow/eclipse-workspace/Javer/src/Heelo/Untitled1.txt");
		System.out.println("Hellow world2");
		fileReader.read("/home/meow/eclipse-workspace/Javer/src/Heelo/Untitled1.txt");
		System.out.println("Γεια σας ειμαι ο "+student1.name);
		
	//	students kostas = new students("kostas","kostasname","plhroforiki",24098);	
		
		

	}

}
