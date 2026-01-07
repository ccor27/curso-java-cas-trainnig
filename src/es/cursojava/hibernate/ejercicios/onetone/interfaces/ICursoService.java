package es.cursojava.hibernate.ejercicios.onetone.interfaces;

import es.cursojava.hibernate.ejercicios.onetone.dto.CursoRequestDTO;
import es.cursojava.hibernate.ejercicios.onetone.dto.CursoResponseDTO;
import es.cursojava.hibernate.ejercicios.onetone.exception.CursoException;

public interface ICursoService {


	CursoResponseDTO save(CursoRequestDTO curso) throws CursoException;
	CursoResponseDTO findParticalCursoById(Long id)throws CursoException;
	CursoResponseDTO findCompleteCursoById(Long id)throws CursoException;
}
