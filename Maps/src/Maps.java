
import java.util.HashMap;
import java.util.Map;

public class MapsDemo 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "John");
		map.put(emp1, "John");
		
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i,  "one");
		map1.put(i1, "one");
		
		System.out.println(map1.size());
		

	}

}

class Employee
{
	int id;
	public Employee(int id)
	{
		this.id = id;
	}
}