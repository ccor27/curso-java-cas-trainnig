package es.cursojava.hibernate.ejercicios.gestionsalarios.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeResDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.exception.BussinesException;
import es.cursojava.hibernate.ejercicios.gestionsalarios.interfaces.IEmployeeDAO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Deparment;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Employee;
import es.cursojava.hibernate.utils.Hibernateutil;

public class EmployeeDAO implements IEmployeeDAO {

//	private Session session;
//	private Transaction transaction;

//	public EmployeeDAO() {
//		session = Hibernateutil.getSessionFactory().openSession();
//        transaction = session.beginTransaction();
//	}

	@Override
	public Employee saveEmployee(Employee employee) throws BussinesException {
		Transaction tx = null;
		try(Session session =  Hibernateutil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.persist(employee);
			session.flush();
			tx.commit();
			return employee;
		}catch (Exception e) {
			if (tx != null) tx.rollback();
			throw new BussinesException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) throws BussinesException {
		Transaction tx = null;
		try(Session session =  Hibernateutil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(employee);
			session.flush();
			tx.commit();
			return employee;
		}catch (Exception e) {
			if(tx!=null) tx.rollback();
			throw new BussinesException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public Employee fetchEmployeeById(Long id) throws BussinesException {
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Query<Employee> query = session.createQuery("from Employee where id =: idParam",Employee.class);
			query.setParameter("idParam", id);
			Employee result = query.uniqueResult();
			tx.commit();
			if(result!=null) {
				return result;
			}else {
				return null;
			}	
		}catch (Exception e) {
			if(tx!=null) tx.rollback();
			throw new BussinesException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public List<Employee> fetchEmployeesByDepartment(Deparment deparment) throws BussinesException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existEmployeeByNif(String nif) throws BussinesException {
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Query<Employee> query = session.createQuery("from Employee where nif =: nifParam",Employee.class);
			query.setParameter("nifParam",nif);
			Employee result =query.uniqueResult();
			tx.commit();
			if(result!=null) {
				return true;
			}else {
				return false;
			}	
		}catch(Exception e) {
			if(tx!=null) tx.rollback();
			throw new BussinesException("Error: "+e.getLocalizedMessage());
		}
	}

	@Override
	public Employee fetchEmployeeByNif(String nif) throws BussinesException {
		Transaction tx = null;
		try(Session session = Hibernateutil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Query<Employee> query = session.createQuery("from Employee where id =: nifParam",Employee.class);
			query.setParameter("nifParam", nif);
			Employee result = query.uniqueResult();
			tx.commit();
			if(result!=null) {
				return result;
			}else {
				return null;
			}	
		}catch (Exception e) {
			if(tx!=null) tx.rollback();
			throw new BussinesException("Error: "+e.getLocalizedMessage());
		}
	}
}
