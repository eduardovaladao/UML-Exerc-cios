package domain;

import java.util.List;

public class Pessoa {

    protected Integer codigo;

    protected String nome;

    protected String email;

    protected List<Processo> processos;

    public Pessoa(Integer codigo, String nome, String email, List<Processo> processos) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.processos = processos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(List<Processo> processos) {
        this.processos = processos;
    }

    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", processos=" + processos + "]";
    }

}
