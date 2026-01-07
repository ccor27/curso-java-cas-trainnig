package es.cursojava.hibernate.ejercicios.gestionsalarios;

import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeReqDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.dto.EmployeeResDTO;
import es.cursojava.hibernate.ejercicios.gestionsalarios.exception.BussinesException;
import es.cursojava.hibernate.ejercicios.gestionsalarios.interfaces.IEmployeeService;
import es.cursojava.hibernate.ejercicios.gestionsalarios.service.EmployeeServiceImp;

public class App {

	public static void main(String[] args) {
		EmployeeReqDTO dto = new EmployeeReqDTO("187326JM", "andrea", "RRHH", 1500.0);
		//TODO: finish the fetch by department, by id and all
		IEmployeeService employeeService = new EmployeeServiceImp();
			try {
				//EmployeeResDTO response = employeeService.saveEmployee(dto);
				EmployeeResDTO response = employeeService.updateSalary(2L, 20);
				System.out.println(response.toString());
			} catch (IllegalArgumentException | BussinesException e) {
			System.out.println(e.getMessage());
			}
	}

}
