package EMP.employee;

public class Employee {
	
	
	public Employee(String name, int age, String department, String gender) {
		super();
		Name = name;
		this.age = age;
		Department = department;
		Gender = gender;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + ", Department=" + Department + ", Gender=" + Gender + "]";
	}

	private String Name;
	private int age;
	private String Department;
	private String Gender;

}
