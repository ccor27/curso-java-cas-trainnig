package es.cursojava.poo.exception.own;

import es.cursojava.poo.exception.GetafeException;

public class TestExcepcionesPropias {

	public static void main(String[] args) {

		try {
			metodoTest();
		} catch (GetafeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void metodoTest() throws GetafeException{
		if(Math.random() > 0.5) {
			GetafeException exception = new GetafeException();
			throw exception;
			
		}else {
			System.out.println("Todo bien");;
		}
	}
}
