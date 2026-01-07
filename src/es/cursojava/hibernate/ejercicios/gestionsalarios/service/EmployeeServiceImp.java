package es.cursojava.hibernate.ejercicios.gestionsalarios.service;

import java.util.List;

import es.cursojava.hibernate.ejercicios.gestionsalarios.dao.EmployeeDAO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeReqDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeResDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.exception.BussinesException;
import es.cursojava.hibernate.ejercicios.gestionsalarios.interfaces.IEmployeeService;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Deparment;
import es.cursojava.hibernate.ejercicios.gestionsalarios.pojo.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	@Override
	public EmployeeResDTO saveEmployee(EmployeeReqDTO employeeReqDTO) throws BussinesException {
		if (employeeReqDTO != null) {
			EmployeeDAO dao = new EmployeeDAO();
			if (employeeReqDTO.nif() == null || employeeReqDTO.nif().isBlank()) {
				throw new BussinesException("Error [validating]: The NIF is mandatory");
			}
			if (dao.existEmployeeByNif(employeeReqDTO.nif())) {
				throw new BussinesException("Error [validating]: the NIF already exist");
			}
			if (!isValidDeparment(employeeReqDTO.deparment())) {
				throw new BussinesException("Error [validating]: invalid deparment");
			}
			if (employeeReqDTO.salary() < 0) {
				throw new BussinesException("Error [validating]: invalid salary");
			}
			Employee employee = new Employee(null, employeeReqDTO.nif(), employeeReqDTO.name(),
					parseDeparment(employeeReqDTO.deparment()), employeeReqDTO.salary());
			dao.saveEmployee(employee);
			 return passFromEntityToDTO(employee); 
		} else {
			throw new BussinesException("Error [saving]: the dto is null, there is not possible store ");
		}
	}

	private boolean isValidDeparment(String deparment) {
		if ((deparment == null || deparment.isBlank() || deparment.isEmpty())) {
			return false;
		}
		try {
			Deparment.valueOf(deparment.toUpperCase());
			return true;
		} catch (IllegalArgumentException iae) {
			return false;
		}
	}

	private Deparment parseDeparment(String deparment) {

		return Deparment.valueOf(deparment.valueOf(deparment));
	}

	@Override
	public EmployeeResDTO updateSalary(Long id, double newSalary) throws BussinesException {
		if(id == null || id <= 0) {
			throw new BussinesException("Error [validating]: id must be positive and greather than 0");
		}
		if (newSalary < 0) {
			throw new BussinesException("Error [validating]: invalid salary");
		}
		EmployeeDAO dao = new EmployeeDAO();
		Employee employee = dao.fetchEmployeeById(id);
		if(employee == null) {
			throw new BussinesException("Error [fetching]: employee with id: "+id+" doesn't exist");
		}
		employee.setSalary(newSalary);
		dao.updateEmployee(employee);
		return passFromEntityToDTO(employee);
	}

	@Override
	public EmployeeResDTO fetchEmployeeById(Long id) throws BussinesException {
		// 
		return null;
	}

	@Override
	public List<EmployeeResDTO> fetchEmployeesByDepartment(Deparment deparment) throws BussinesException {
		// TODO Auto-generated method stub
		return null;
	}
	
	private EmployeeResDTO passFromEntityToDTO(Employee employee) {
		return new EmployeeResDTO(employee.getId(), employee.getNif(), employee.getName(), employee.getDeparment(),
				employee.getSalary());
	}

	@Override
	public EmployeeResDTO fetchEmployeeByNif(String nif) throws BussinesException {
		if(nif == null || nif.isEmpty() || nif.isBlank()) {
			throw new BussinesException("Error [validating]: The NIF is mandatory");
		}
		EmployeeDAO dao = new EmployeeDAO();
		Employee employee = dao.fetchEmployeeByNif(nif);
		if(employee == null) {
			throw new BussinesException("Error [fetching]: employee with nif: "+nif+" doesn't exist");
		}
		return passFromEntityToDTO(employee);
	}

}
