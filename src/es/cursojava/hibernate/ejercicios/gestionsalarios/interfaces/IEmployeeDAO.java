package es.cursojava.hibernate.ejercicios.gestionsalarios.interfaces;

import java.util.List;

import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeResDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.exception.BussinesException;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Deparment;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Employee;

public interface IEmployeeDAO {

	//NIF and name mandatory, valid department
		Employee saveEmployee(Employee employeeReqDTO) throws BussinesException;
		//validate salary 
		Employee updateEmployee(Employee employee)throws BussinesException;
		//if doesn't exist, throw an exception
		Employee fetchEmployeeById(Long id)throws BussinesException;
		Employee fetchEmployeeByNif(String nif)throws BussinesException;
		List<Employee> fetchEmployeesByDepartment(Deparment deparment) throws BussinesException;
		boolean existEmployeeByNif(String nif)throws BussinesException;
}
