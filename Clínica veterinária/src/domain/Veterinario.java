package domain;

import java.util.List;

public class Veterinario {

    private Integer codigo;

    private String nome;

    private String crmv;

    private List<Consulta> consultas;

    public Veterinario(Integer codigo, String nome, String crmv, List<Consulta> consultas) {
        this.codigo = codigo;
        this.nome = nome;
        this.crmv = crmv;
        this.consultas = consultas;
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

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Veterinario [codigo=" + codigo + ", nome=" + nome + ", crmv=" + crmv + ", consultas=" + consultas + "]";
    }

}
