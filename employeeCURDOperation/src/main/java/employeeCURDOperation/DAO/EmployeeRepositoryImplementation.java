package employeeCURDOperation.DAO;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import employeeCURDOperation.DTO.Employee;
@Repository
public class EmployeeRepositoryImplementation  implements EmployeeRepository
{

	private static SessionFactory factory;

	static 
	{
		Configuration config=new Configuration();
		config.configure();
		factory=config.buildSessionFactory();

	}

	@Override
	public boolean insertEmployee(Employee e)
	{


		boolean b=false;
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		try
		{
			tx.commit();
			b=true;

		}
		catch (Exception e1) {

			tx.rollback();
			b=false;
		}

		session.close();
		return b;
	}


	@Override
	public List<Employee> displayAllEmps() {

		Session session=factory.openSession();

		Query query= session.createQuery("FROM Employee");
		List<Employee> allemp=query.getResultList();


		// TODO Auto-generated method stub
		return allemp;
	}

	@Override
	public Employee searchEmployee(int id)
	{
		Session session = factory.openSession();
		Employee e = session.get(Employee.class, id);
		session.close();
		return e;
	}
	@Override
	public boolean update(Employee e) {
		boolean b=false;
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(e);
		try
		{
			tx.commit();
			b=true;

		}
		catch (Exception e1) {

			tx.rollback();
			b=false;
		}

		session.close();
		return b;
	}
	
	@Override
	public boolean delete(int id) {
		boolean b=false;
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(searchEmployee(id));
		try
		{
			tx.commit();
			b=true;

		}
		catch (Exception e1) {

			tx.rollback();
			b=false;
		}

		session.close();
		return b;
		
	}






}
