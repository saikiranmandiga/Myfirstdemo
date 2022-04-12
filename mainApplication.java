package comm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainApplication {
	public static void main(String[] args) throws IOException {
		BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
		userDefinedClass userDefinedClassObj = new userDefinedClass();
		System.out.println("How many employee");
		int totalemployee = Integer.parseInt(bs.readLine());

		for (int loop = 0; loop < totalemployee; loop++) {

			Employee employeeObj = new Employee();
			System.out.println("This is main application");

			System.out.println("Ener your code");
			int employeecode = Integer.parseInt(bs.readLine());
			employeeObj.setEmpID(employeecode);

			System.out.println("Ener your Name");
			String employeeName = bs.readLine();
			employeeObj.setEmpName(employeeName);

			System.out.println("Ener your Address");
			String employeeAddress = bs.readLine();
			employeeObj.setEmpAddress(employeeAddress);

			userDefinedClassObj.sayhello(employeeObj);
		}
	}
}
