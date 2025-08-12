package dev.psbios.CadastroDeNinjas.Ninjas;

import dev.psbios.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

// @Entity transforma uma classe em uma entidade
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne = Um ninja só pode ter uma única missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign key (chave estrangeira)
    private MissaoModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}