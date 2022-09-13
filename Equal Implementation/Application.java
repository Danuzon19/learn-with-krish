
public class Application {

	public static void main(String[] args) {
		Employee employee_1=new Employee("001",123,"Danuzon","960125241V","Colombo");
		Employee employee_2=new Employee("002",456,"Kamal","960142154V","Mannar");
		Employee employee_3=new Employee("003",789,"Ravi","951485245V","Jaffna");
		
		System.out.println(employee_1.equals(employee_2));
		
		
		System.out.println("Employee 1 : "+employee_1);
		System.out.println("Employee 2 : "+employee_2);
		System.out.println("Employee 3 : "+employee_3);
		
		
		System.out.println(employee_1.equals(employee_3));
		
		employee_2.setEmpId("001");
		employee_2.setEmpCode(123);
		
	System.out.println(employee_1.equals(employee_2));
		
		
		System.out.println("Employee 1 : "+employee_1);
		System.out.println("Employee 2 : "+employee_2);
		System.out.println("Employee 3 : "+employee_3);

		}

}
