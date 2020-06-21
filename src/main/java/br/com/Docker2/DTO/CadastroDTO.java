package br.com.Docker2.DTO;

import br.com.Docker2.Model.Cadastro;

import java.util.List;
import java.util.Objects;

public class CadastroDTO {

    private Long id_c;
    private String nome;
    private String fone;
    private String email;

    public static CadastroDTO converter(Cadastro c){
        CadastroDTO cad = new CadastroDTO();
        cad.setId_c(c.getId_c());
        cad.setNome(c.getNome());
        cad.setFone(c.getFone());
        cad.setEmail(c.getEmail());
        return cad;
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


}
