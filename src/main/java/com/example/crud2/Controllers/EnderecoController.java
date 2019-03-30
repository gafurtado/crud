package com.example.crud2.Controllers;

import com.example.crud2.Models.Endereco;
import com.example.crud2.Models.Pessoa;
import com.example.crud2.Services.EnderecoService;
import com.example.crud2.Services.PessoaService;
import java.util.*;

import javax.validation.Valid;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EnderecoController {

    @Autowired
    EnderecoService endereco_service;
    @Autowired
    PessoaService person_service;

    @RequestMapping(value = "/pessoa/{id}/endereco/create" , method = RequestMethod.GET)
    public String CreateEndereco(Model model, @PathVariable("id") long id){
        Pessoa estaPessoa = person_service.getPessoaById(id);
        Set<Endereco> enderecos = estaPessoa.getEnderecos();
        model.addAttribute("enderecos", enderecos);
        model.addAttribute("pessoa_id", id);
        return "create_endereco";
    }

    /**
     * Action para a tela de criacao de Pessoa
     * @param model
     * @return
     */
    @RequestMapping(value = "/endereco/create" , method = RequestMethod.POST)
    public String CreateEndereco(Endereco obj, Model model){
        // pegando a respectiva pessoa
        Pessoa estaPessoa = person_service.getPessoaById(obj.getPessoa_id());
        //Inserindo o endereco informado, no banco:
        endereco_service.saveOrUpdate(obj);
        //adicionando o endereco na pessoa
        estaPessoa.getEnderecos().add(obj);
        // associando a pessoa neste endereco
        obj.setPessoa(estaPessoa);
        //salvando pessoa
        person_service.saveOrUpdate(estaPessoa);
        // precisamos salvar endereco novamente?
        return "redirect:/pessoa/" + obj.getPessoa_id() + "/endereco/create";
    }
    
}