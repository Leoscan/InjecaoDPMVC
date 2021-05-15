package persistencia;

import java.util.List;

import classesDTO.Aluno;

public class GeraPersistenciaBO {
	protected PersistenciaDAO persistencia;
	
	public GeraPersistenciaBO(PersistenciaDAO persistencia) {
		this.persistencia = persistencia;
	}
	
	public String GPersistencia(List<Aluno> ListAluno) {
		return persistencia.CriaPersistencia(ListAluno);
	}
	public List<Aluno> RPersistencia() {
		return persistencia.RecuperaPersistencia();
	}
	
}
