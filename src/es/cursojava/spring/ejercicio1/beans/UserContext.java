package es.cursojava.spring.ejercicio1.beans;

import org.springframework.stereotype.Component;

import es.cursojava.spring.ejercicio1.pojos.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class UserContext {

	private User currentUser;
	
	
}
