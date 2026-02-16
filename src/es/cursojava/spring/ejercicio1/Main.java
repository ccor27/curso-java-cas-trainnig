package es.cursojava.spring.ejercicio1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.cursojava.spring.ejercicio1.beans.UserContext;
import es.cursojava.spring.ejercicio1.config.Config;
import es.cursojava.spring.ejercicio1.pojos.Rol;
import es.cursojava.spring.ejercicio1.pojos.User;
import es.cursojava.spring.ejercicio1.service.CalculadoraService;

public class Main {
	public static void main(String[] args) {
		try(var cxn = new AnnotationConfigApplicationContext(Config.class)){
			System.out.println("Iniciando calculadora con spring core");
			CalculadoraService calculadora = cxn.getBean(CalculadoraService.class);
			UserContext userContext = cxn.getBean(UserContext.class);
			System.out.println("------ USUARIOS AUTENTICADOS Y CON PERMISO ------");
			userContext.setCurrentUser(new User("Andrea", Rol.ADMIN));
			calculadora.ejecutarOperaciones(2, 8, "+");
			userContext.setCurrentUser(new User("Juan", Rol.ADMIN));
			calculadora.ejecutarOperaciones(8, 2, "-");
			userContext.setCurrentUser(new User("William", Rol.ADMIN));
			calculadora.ejecutarOperaciones(2, 8, "*");
			userContext.setCurrentUser(new User("Mark", Rol.ADMIN));
			calculadora.ejecutarOperaciones(8, 2, "/");
			System.out.println("------ USUARIOS SIN PERMISO ------");
			try {
				userContext.setCurrentUser(new User("Julia", Rol.USER));
				calculadora.ejecutarOperaciones(2, 8, "+");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			try {
				userContext.setCurrentUser(new User("Camilo", Rol.USER));
				calculadora.ejecutarOperaciones(8,2, "-");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			try {
				userContext.setCurrentUser(new User("Teresa", Rol.USER));
				calculadora.ejecutarOperaciones(2, 8, "*");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			System.out.println("------ USUARIOS NO AUTENTICADOS ------");
			userContext.setCurrentUser(null);
			try {
				calculadora.ejecutarOperaciones(2, 8, "+");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			try {
				calculadora.ejecutarOperaciones(8,2, "-");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			try {
				calculadora.ejecutarOperaciones(2, 8, "*");
			}catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}
