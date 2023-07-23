package employeeCURDOperation.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeeCURDOperation.DAO.EmployeeRepository;
import employeeCURDOperation.DTO.Employee;


@Service
public class EmployeeServiceImplements implements EmployeeService
{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public boolean addEmpolyee(Employee e) {
		//calculate age
				int yob = Integer.parseInt(e.getDob().substring(0, 4));
				int curYear = LocalDate.now().getYear();
				int age = curYear - yob;
				e.setAge(age);
				
				
				return repository.insertEmployee(e);
				
		// TODO Auto-generated method stub
	}
	
	@Override
	public List<Employee> displayAllEmps() {
		
		
		return repository.displayAllEmps();
	}
	
	@Override
	public Employee searchEmployee(int id) {
		
		
		return repository.searchEmployee(id);
		// TODO Auto-generated method stub
	}
	@Override
	public boolean update(Employee e) {
		int yob = Integer.parseInt(e.getDob().substring(0, 4));
		int curYear = LocalDate.now().getYear();
		int age = curYear - yob;
		e.setAge(age);
		return repository.update(e);
	}
	
@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return repository.delete(id);
	}

}
