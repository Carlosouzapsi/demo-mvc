package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;


public interface FuncionarioDao {
	
	void save(Funcionario cargo);
	
	void update(Funcionario cargo);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();

}
