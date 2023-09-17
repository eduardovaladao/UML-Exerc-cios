package domain;

import java.util.List;

public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica(Integer codigo, String nome, String email, List<Processo> processos, String cnpj) {
        super(codigo, nome, email, processos);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + "]";
    }

    
}
