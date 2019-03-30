package com.example.crud2.Models;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projeto implements Serializable{
    private static final long serialVersionUID = -5294188537237640015L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;

    @ManyToMany(mappedBy = "projetos")
    private Set<Pessoa> pessoas;

    private Date dtInicio;
    private Date dtEntrega;
    private String nome;
    private int orcamento;
   

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
     * @return Date return the dtInicio
     */
    public Date getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return Date return the dtEntrega
     */
    public Date getDtEntrega() {
        return dtEntrega;
    }

    /**
     * @param dtEntrega the dtEntrega to set
     */
    public void setDtEntrega(Date dtEntrega) {
        this.dtEntrega = dtEntrega;
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
     * @return int return the orcamento
     */
    public int getOrcamento() {
        return orcamento;
    }

    /**
     * @param orcamento the orcamento to set
     */
    public void setOrcamento(int orcamento) {
        this.orcamento = orcamento;
    }

}