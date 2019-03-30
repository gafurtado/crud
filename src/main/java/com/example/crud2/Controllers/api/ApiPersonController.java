package com.example.crud2.Controllers.api;

import java.util.List;
import com.example.crud2.Models.Pessoa;
import com.example.crud2.Services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {
    "http://localhost:8090",
    "http://localhost:8081",
    "http://127.0.0.1:8081"
})
@RestController
@RequestMapping("/api/v1")
public class ApiPersonController {

    @Autowired
    PessoaService service;

    @RequestMapping(
            value    = "/pessoas",
            method   = RequestMethod.GET,
            produces = {"application/json"}
    )
	public List<Pessoa> Pessoas() {
		return service.getAllPessoas();
    }

    @RequestMapping(
            value    = "/pessoas",
            method   = RequestMethod.POST,
            produces = {"application/json"}
    )
	public void PessoasCreate(@RequestBody Pessoa p) {
        service.saveOrUpdate(p);
    }
    
    
}