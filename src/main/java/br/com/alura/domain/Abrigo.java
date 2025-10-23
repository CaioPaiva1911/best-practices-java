package br.com.alura.domain;

import java.util.ArrayList;
import java.util.List;

public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private List<Pet> pets = new ArrayList<>();

    public Abrigo() {
    }

    public Abrigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return """
                "id":%s,"nome":"%s","telefone":"%s","email":"%s"
                """.formatted(this.id, this.nome, this.telefone, this.email);
    }
}
