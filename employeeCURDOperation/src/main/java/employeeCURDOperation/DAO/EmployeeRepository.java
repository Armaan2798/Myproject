package employeeCURDOperation.DAO;

import java.util.List;

import employeeCURDOperation.DTO.Employee;

public interface EmployeeRepository {

	boolean insertEmployee(Employee e);
	List<Employee> displayAllEmps();
	Employee searchEmployee(int id);
	boolean update(Employee e);
	boolean delete(int id);

}
