package com.testeProjetoTDC;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.testeProjetoTDC.validation.Nome.constraints.Nome;
import com.testeProjetoTDC.validation.telefone.constraints.Telefone;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document(collection = "alunos")
@Data
public class Usuario {

    @Id
    private String id;

    @Nome
    private String nomeAluno;

    @PastOrPresent
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
    
    @Nome
    private String nomeResponsavel;

    @Nome
    private String nomeContatoEmergencia;

    //validar teleofnes
    @Telefone
    private String telefoneAluno;
    @Telefone
    private String telefoneDoResponsavel;
    @Telefone
    private String telefoneContatoDeEmergencia;

    //validar campos abaixo
    @NotBlank
    private String modalidade;
    @Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas")
    private String parentescoDoesponsavel;
    @Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas")
    private String parentescoDoContatoDeEmergencia;

    @org.hibernate.validator.constraints.br.CPF
    private String CPF;

    @com.testeProjetoTDC.validation.BrRg.constraints.Rg
    private String rg;

    //Getters e Setters


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome não informado") String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(@NotBlank(message = "Nome não informado") String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public @PastOrPresent LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@PastOrPresent LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotBlank(message = "Nome não informado") String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(@NotBlank(message = "Nome não informado") String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public @NotBlank(message = "Nome não informado") String getNomeContatoEmergencia() {
        return nomeContatoEmergencia;
    }

    public void setNomeContatoEmergencia(@NotBlank(message = "Nome não informado") String nomeContatoEmergencia) {
        this.nomeContatoEmergencia = nomeContatoEmergencia;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getTelefoneDoResponsavel() {
        return telefoneDoResponsavel;
    }

    public void setTelefoneDoResponsavel(String telefoneDoResponsavel) {
        this.telefoneDoResponsavel = telefoneDoResponsavel;
    }

    public String getTelefoneContatoDeEmergencia() {
        return telefoneContatoDeEmergencia;
    }

    public void setTelefoneContatoDeEmergencia(String telefoneContatoDeEmergencia) {
        this.telefoneContatoDeEmergencia = telefoneContatoDeEmergencia;
    }

    public @NotBlank String getModalidade() {
        return modalidade;
    }

    public void setModalidade(@NotBlank String modalidade) {
        this.modalidade = modalidade;
    }

    public @Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas") String getParentescoDoesponsavel() {
        return parentescoDoesponsavel;
    }

    public void setParentescoDoesponsavel(@Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas") String parentescoDoesponsavel) {
        this.parentescoDoesponsavel = parentescoDoesponsavel;
    }

    public @Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas") String getParentescoDoContatoDeEmergencia() {
        return parentescoDoContatoDeEmergencia;
    }

    public void setParentescoDoContatoDeEmergencia(@Pattern(regexp = "^[A-Za-zÀ-ÿ]+$", message = "Somente letras são permitidas") String parentescoDoContatoDeEmergencia) {
        this.parentescoDoContatoDeEmergencia = parentescoDoContatoDeEmergencia;
    }

    public @org.hibernate.validator.constraints.br.CPF String getCPF() {
        return CPF;
    }

    public void setCPF(@org.hibernate.validator.constraints.br.CPF String CPF) {
        this.CPF = CPF;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
