package com.example.crud2.Controllers;

import com.example.crud2.Models.Endereco;
import com.example.crud2.Models.Pessoa;
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
public class PersonController {

    @Autowired
    PessoaService service;

    /**
     * Action para a pagina principal
     * @param model
     * @return
     */
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String Home(Model model){
        //model.addAttribute("meunome", lista);
        return "index";
    }

    /**
     * Action para a tela de criacao de Pessoa
     * @param model
     * @return
     */
    @RequestMapping(value = "/create" , method = RequestMethod.GET)
    public String Create(Model model){
        return "create";
    }

    /**
     * Action para a tela de criacao de Pessoa
     * @param model
     * @return
     */
    @RequestMapping(value = "/create" , method = RequestMethod.POST)
    public String CreatePost(Pessoa obj, Model model){
        // primeiro nois salva.
        service.saveOrUpdate(obj);
        // depois, nois pega tudo
        return "redirect:list";
    }

    /**
     * Action para a tela de criacao de Pessoa
     * @param model
     * @return
     */
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String List(Model model){
        List<Pessoa> pessoasList = service.getAllPessoas();
        // depois, nois seta as pessoa na view (twig)
        model.addAttribute("pessoas", pessoasList);
        // e renderiza e retorna view "List" pro criente.
        return "list";
    }

    @RequestMapping(value = "/delete" , method = RequestMethod.POST)
    public String Delete(Pessoa obj) {
        service.deletePessoa(obj.getId());
        return "redirect:list";
    }

    @RequestMapping(value = "/update/{id}" , method = RequestMethod.GET)
    public String Update(Model model, @PathVariable("id") long id) {
        Pessoa pessoa = service.getPessoaById(id);
        model.addAttribute("pessoa", pessoa);
        return "create";
    }
    
}