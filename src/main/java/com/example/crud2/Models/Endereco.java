package com.example.crud2.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable{
    private static final long serialVersionUID = -5294188737237640015L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @Transient
    private int pessoa_id;

    @ManyToOne
    private Pessoa pessoa;

    private String cidade;
    private String estado;
    private String cep;
    private String logradouro;
   

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
     * @return String return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return String return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return Pessoa return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }




    /**
     * @return int return the pessoa_id
     */
    public int getPessoa_id() {
        return pessoa_id;
    }

    /**
     * @param pessoa_id the pessoa_id to set
     */
    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }


    /**
     * @return String return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

}