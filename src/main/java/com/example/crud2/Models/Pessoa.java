package com.example.crud2.Models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pessoa implements Serializable{
    private static final long serialVersionUID = -5254188737237640015L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @OneToMany(mappedBy = "pessoa")
    private Set<Endereco> enderecos;

    @ManyToMany
    @JoinTable(
        name="ProjetoPessoa",
        joinColumns=@JoinColumn(name="pessoa_id", referencedColumnName="id"),
        inverseJoinColumns=@JoinColumn(name="projeto_id", referencedColumnName="ID"))
    private Set<Projeto> projetos;

    private String nome;
    private String senha;
    private String email;
    private String idade;
    private String sexo;
    private String cpf;

    @Override
    public boolean equals(Object p){
        return this.cpf == ((Pessoa)p).getCpf() ? true : false;
    }

    /**
     * @return Long return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return int return the idade
     */
    public String getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * @return boolean return the sexo
     */
    public String isSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the sexo
     */
    public String getSexo() {
        return sexo;
    }


    /**
     * @return Set<Endereco> return the enderecos
     */
    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}