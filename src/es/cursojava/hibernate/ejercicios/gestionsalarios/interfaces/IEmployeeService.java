package es.cursojava.hibernate.ejercicios.gestionsalarios.interfaces;

import java.util.List;

import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeReqDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeResDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.exception.BussinesException;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Deparment;

public interface IEmployeeService {

	//NIF and name mandatory, valid department
	EmployeeResDTO saveEmployee(EmployeeReqDTO employeeReqDTO) throws BussinesException;
	//validate salary 
	EmployeeResDTO updateSalary(Long id, double newSalary)throws BussinesException;
	EmployeeResDTO fetchEmployeeByNif(String nif)throws BussinesException;
	//if doesn't exist, throw an exception
	EmployeeResDTO fetchEmployeeById(Long id)throws BussinesException;
	List<EmployeeResDTO> fetchEmployeesByDepartment(Deparment deparment) throws BussinesException;
}
