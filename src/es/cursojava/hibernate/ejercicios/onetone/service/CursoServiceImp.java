package es.cursojava.hibernate.ejercicios.onetone.service;

import es.cursojava.hibernate.ejercicios.onetone.dao.CursoDAO;
import es.cursojava.hibernate.ejercicios.onetone.dto.AulaRequestDTO;
import es.cursojava.hibernate.ejercicios.onetone.dto.CursoRequestDTO;
import es.cursojava.hibernate.ejercicios.onetone.dto.CursoResponseDTO;
import es.cursojava.hibernate.ejercicios.onetone.exception.CursoException;
import es.cursojava.hibernate.ejercicios.onetone.interfaces.ICursoService;
import es.cursojava.hibernate.ejercicios.onetone.model.Aula;
import es.cursojava.hibernate.ejercicios.onetone.model.Codigo;
import es.cursojava.hibernate.ejercicios.onetone.model.Curso;

public class CursoServiceImp implements ICursoService {

	private CursoDAO cursoDAO;
	public CursoServiceImp() {
		this.cursoDAO = new CursoDAO();
	}
	
	@Override
	public CursoResponseDTO save(CursoRequestDTO curso) throws CursoException {
		if(curso==null) {
			throw new CursoException("Error [saving]: the dto is null");
		}
		//TODO: make validations
		Curso c = new Curso(
				null,
				parseCodigo(curso.codigo()),
				curso.titulo(),
				curso.descripcion(),
				curso.duracionHoras(),
				curso.disponible(),
				curso.nivel(),
				curso.categoria(),
				curso.precio(),
				curso.fechaInicio(),
				curso.fechaFin(),
				isAula(curso.aula()));
		
		return null;
	}
	private Aula isAula(AulaRequestDTO aulaRequestDTO) {
		if(aulaRequestDTO==null) {
			return null;
		}
		Aula aula = new Aula(null, aulaRequestDTO.codigoAula(),aulaRequestDTO.capacidad(), aulaRequestDTO.ubicacion());
		return aula;
	}

	private Codigo parseCodigo(String str) {
		try {
			return Codigo.valueOf(str.trim());
		} catch (IllegalArgumentException | NullPointerException e) {
			return Codigo.SIN_DEFINIR; // valor por defecto
		}
	}
	@Override
	public CursoResponseDTO findParticalCursoById(Long id) throws CursoException {
		//TODO: finish and test
		return null;
	}

	@Override
	public CursoResponseDTO findCompleteCursoById(Long id) throws CursoException {
		//TODO: finish and test
		return null;
	}

}
