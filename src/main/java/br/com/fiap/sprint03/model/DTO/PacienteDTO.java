package br.com.fiap.sprint03.model.DTO;

import java.time.LocalDate;

public class PacienteDTO {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataDeNascimento;

    // Construtores
    public PacienteDTO() {}

    public PacienteDTO(Long id, String nome, String telefone, String email, LocalDate dataDeNascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDataDeNascimento() { return dataDeNascimento; }
    public void setDataDeNascimento(LocalDate dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }
}
