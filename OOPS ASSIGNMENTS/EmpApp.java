import java.util.Scanner;
class Employee{
		
		int empId;
		String empName;
		double empSalary;
		String empAddress;
		long empContact;
		
			Employee(int id,String name,double salary,String address,long contact){
				this.empId=id;
				this.empName=name;
				this.empSalary=salary;
				this.empAddress=address;
				this.empContact=contact;
			}
		
		void show(){
			System.out.println("Employee Id = "+ empId);
			System.out.println("Employee Name = "+ empName);
			System.out.println("Employee Salary = "+ empSalary);
			System.out.println("Employee Address = "+ empAddress);
			System.out.println("Employee Contact = "+ empContact);
		}
}

class Company{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter employee name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter employee salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter employee address: ");
		String address = sc.nextLine();
		
		System.out.print("Enter employee contact: ");
		long contact = sc.nextLong();
		sc.nextLine();
		
		Employee e = new Employee(id,name,salary,address,contact);
		
		e.show();
		
	}
	
}