package com.alicie.prjEmpresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alicie.prjEmpresa.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
