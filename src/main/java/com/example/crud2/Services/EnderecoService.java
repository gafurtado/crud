package com.example.crud2.Services;

import java.util.List;

import com.example.crud2.Models.Endereco;
import com.example.crud2.Models.Pessoa;
import com.example.crud2.Repositories.EnderecoRepository;
import com.example.crud2.Repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    EnderecoRepository repo;

    @Override
    public List<Endereco> getAllEnderecos() {
        return (List<Endereco>) repo.findAll();
    }

    @Override
    public Endereco getEnderecoById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Endereco obj) {
        repo.save(obj);
        
    }

    @Override
    public void deleteEndereco(long id) {
        repo.deleteById(id);
    }

}