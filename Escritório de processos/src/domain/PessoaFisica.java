package domain;

import java.util.List;

public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(Integer codigo, String nome, String email, List<Processo> processos, String cpf) {
        super(codigo, nome, email, processos);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + "]";
    }


}