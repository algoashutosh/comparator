package comparator;
import java.util.*;  
  

class Simple
{  
public static void main(String args[])
	{  
  
	ArrayList<Employee> al=new ArrayList<Employee>();  
	al.add(new Employee("Computer","Anupam",28));  
	al.add(new Employee("HCI","Chitra",23));  
	al.add(new Employee("AI","Ashutosh",23));  
	
  
	System.out.println("Sorting by Name...");  
	
    Collections.sort(al,new NameComparator());  
	for(Employee st: al){  
		System.out.println(st.dept+" "+st.name+" "+st.age);  
	}
	
  
	System.out.println("sorting by age...");
	
    Collections.sort(al,new AgeComparator());  
	for(Employee st: al){  
		System.out.println(st.dept+" "+st.name+" "+st.age);  
	}
	
	
	System.out.println("sorting by departemnt....");
	
	Collections.sort(al,new DeptComparator());
	for(Employee st: al){
		System.out.println(st.dept+" "+st.name+" "+st.age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	 
	}  
}  