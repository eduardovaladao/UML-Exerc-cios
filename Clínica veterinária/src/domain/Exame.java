package domain;

import java.util.Date;

public class Exame {

    private Integer codigo;

    private Consulta consulta;

    private String tipo;

    private Date data;

    private String resumo;

    public Exame(Integer codigo, Consulta consulta, String tipo, Date data, String resumo) {
        this.codigo = codigo;
        this.consulta = consulta;
        this.tipo = tipo;
        this.data = data;
        this.resumo = resumo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    @Override
    public String toString() {
        return "Exame [codigo=" + codigo + ", consulta=" + consulta + ", tipo=" + tipo + ", data=" + data + ", resumo="
                + resumo + "]";
    }

}
