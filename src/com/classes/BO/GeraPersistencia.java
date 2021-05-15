package com.classes.BO;

import java.util.List;
import com.classes.DTO.Aluno;
import com.classes.DAO.Persistencia;

public class GeraPersistencia {
	protected Persistencia persistencia;
	
		public GeraPersistencia(Persistencia persistencia) {
			this.persistencia = persistencia;
		}
	
		public String GPersistencia(List<Aluno> ListAluno) {
			return persistencia.CriaPersistencia(ListAluno);
		}
		
		public List<Aluno> RPersistencia() {
			return persistencia.RecuperaPersistencia();
		}
}
