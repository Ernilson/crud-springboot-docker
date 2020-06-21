package br.com.Docker2.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cadastro")
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_c;
    private String nome;
    private String fone;
    private String email;

    public Cadastro() {

    }

    public Cadastro(Long id_c, String nome, String fone, String email) {
        this.id_c = id_c;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Long getId_c() {
        return id_c;
    }

    public void setId_c(Long id_c) {
        this.id_c = id_c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cadastro)) return false;
        Cadastro cadastro = (Cadastro) o;
        return Objects.equals(id_c, cadastro.id_c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_c);
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "id_c=" + id_c +
                ", nome='" + nome + '\'' +
                ", fone='" + fone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
