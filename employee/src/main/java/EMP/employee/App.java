package EMP.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Employee>employee=new ArrayList<Employee>();
        
        employee.add(new Employee("Aman",24,"IT","MALE"));
        employee.add(new Employee("Anjali",27,"IT","FEMALE"));
        employee.add(new Employee("balluaine",34,"HR","FEMALE"));
        employee.add(new Employee("raam",43,"HR","MALE"));
        
    
    employee.stream().map(x->x.getDepartment()).distinct().forEach(System.out::println);
    
  Map<String,Double>map = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
  
  System.out.println(map);
    } 
}
