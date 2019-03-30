package com.example.crud2;

import com.example.crud2.Models.Pessoa;
import com.example.crud2.Services.PessoaService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	PessoaService service;

	@Test
	public void InsertPessoaTest(){
		Pessoa umaPessoa = new Pessoa();
		umaPessoa.setCpf("00000000");
		service.saveOrUpdate(umaPessoa);

		Pessoa outraPessoa = service.getPessoaById(umaPessoa.getId());
		Assert.assertEquals(umaPessoa, outraPessoa);
	}

	@Test
	public void contextLoads() {
	}

}

