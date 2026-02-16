package es.cursojava.spring.ejercicio1.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import es.cursojava.spring.ejercicio1.beans.UserContext;
import es.cursojava.spring.ejercicio1.pojos.Rol;
import es.cursojava.spring.ejercicio1.pojos.User;
import lombok.AllArgsConstructor;

@Aspect
@Component
@AllArgsConstructor
public class LoginAspect {

	private final UserContext userContext;
	
	@Pointcut("@annotation(es.cursojava.spring.ejercicio1.annotations.OnlyAdmin)")
	public void securityLayer() {}
	
	@Around("securityLayer()")
	public Object validateUser(ProceedingJoinPoint pjp) throws Throwable{
		User user = userContext.getCurrentUser();
		if(user==null) {
			throw new SecurityException("Acceso denegado. No hay usuario autenticado ");
		}
		if(!Rol.ADMIN.equals(user.getRol())) {
	           throw new SecurityException(
	                   "Acceso denegado. Usuario " + user.getName() +
	                   " no tiene permisos necesarios para ejecutar la operacion "
	               );
		}
		return pjp.proceed();
	}
	
	
}
