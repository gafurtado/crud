package com.example.crud2.Services;

import java.util.List;

import com.example.crud2.Models.Pessoa;
import com.example.crud2.Repositories.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    PessoaRepository repo;

    @Override
    public List<Pessoa> getAllPessoas() {
        return (List<Pessoa>) repo.findAll();
    }

    @Override
    public Pessoa getPessoaById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Pessoa obj) {
        repo.save(obj);
        
    }

    @Override
    public void deletePessoa(long id) {
        repo.deleteById(id);
    }

}