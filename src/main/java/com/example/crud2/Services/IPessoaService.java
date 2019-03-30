package com.example.crud2.Services;

import java.util.List;

import com.example.crud2.Models.*;

public interface IPessoaService {

 public List<Pessoa> getAllPessoas();
 
 public Pessoa getPessoaById(long id);
 
 public void saveOrUpdate(Pessoa article);
 
 public void deletePessoa(long id);
}