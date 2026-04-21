package Heelo;

public class secretaries extends Users{

	public secretaries(String username,String name,String  department) {
		super(username,name,department);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public professors createprof(String username,String name,String  department) {
		professors pikrakis = new professors( username, name, department);
		return pikrakis;
		
		
		
		
		
	}
	public students createprof(String username,String name,String  department,int reggie,int semester) {
		students vaggelis = new students( username, name, department,reggie,semester);
		return vaggelis;
		
		
		
		
		
	}
//+ena function ιγια grades απο τον βαγγελη
//+ courses στους καθηγητες απο τον βαγγελη 
	
}
