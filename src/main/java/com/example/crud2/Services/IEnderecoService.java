package com.example.crud2.Services;

import java.util.List;

import com.example.crud2.Models.*;

public interface IEnderecoService {

 public List<Endereco> getAllEnderecos();
 
 public Endereco getEnderecoById(long id);
 
 public void saveOrUpdate(Endereco endereco);
 
 public void deleteEndereco(long id);
}