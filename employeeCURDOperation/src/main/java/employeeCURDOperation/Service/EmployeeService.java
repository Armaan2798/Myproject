package employeeCURDOperation.Service;

import java.util.List;

import employeeCURDOperation.DTO.Employee;

public interface EmployeeService {
	
	boolean addEmpolyee(Employee e);

	List<Employee> displayAllEmps();

	Employee searchEmployee(int id);

	boolean update(Employee e);

	boolean delete(int id);

}
