package com.alicie.prjEmpresa.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alicie.prjEmpresa.entities.Departamento;
import com.alicie.prjEmpresa.entities.Funcionario;
import com.alicie.prjEmpresa.repositories.DepartamentoRepository;
import com.alicie.prjEmpresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

private final FuncionarioRepository funcionarioRepository;
	
	@Autowired
	public FuncionarioService (FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}
	
	public Funcionario saveFuncionario (Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> getAllFuncionario(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario getFuncionarioByid(Long funcodigo) {
		return funcionarioRepository.findById(funcodigo).orElse(null);
	}
	
	public void deleteFuncionario(Long funcodigo) {
		funcionarioRepository.deleteById(funcodigo);
	}
	
	public Funcionario updateFuncionario(Long funcodigo, Funcionario novoFuncionario) {
        Optional<Funcionario> funcionarioOptional = funcionarioRepository.findById(funcodigo);
        if (funcionarioOptional.isPresent()) {
        	Funcionario funcionarioExistente = funcionarioOptional.get();
        	funcionarioExistente. setFunnome(novoFuncionario.getFunnome());
            return funcionarioRepository.save(funcionarioExistente); 
        } else {
            return null; 
        }
	}
}
