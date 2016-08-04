package comparator;

import java.util.Comparator;

class  DeptComparator implements Comparator<Employee>
{  
	public int compare(Employee s1,Employee s2)
	{  
		return s1.dept.compareTo(s2.dept);  
	}  
}  
