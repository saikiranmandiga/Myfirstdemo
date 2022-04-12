package comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userDefinedClass {
	List<Employee> listObj = new ArrayList<Employee>();
	Map<Integer,Employee> mapObj = new HashMap<Integer,Employee>();

	public void sayhello(Employee employeeObj) {

		/*
		 * System.out.println(employeeObj.getEmpName());
		 * System.out.println(employeeObj.getEmpID());
		 * System.out.println(employeeObj.getEmpAddress());
		 */

		listObj.add(employeeObj);

		System.out.println("Size of the arraylist" + listObj.size());
		
		for (Employee testemployee : listObj) {
			System.out.println(testemployee);
			/*
			 * System.out.println(testemployee.getEmpID());
			 * System.out.println(testemployee.getEmpName());
			 * System.out.println(testemployee.getEmpAddress());
			 */
		}
		mapObj.put(employeeObj.getEmpID(), employeeObj);
		System.out.println(mapObj);
	}
}
