package testarpessoas;

import java.util.List;

/**
 *
 * @author taris
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double imposto;

    public PessoaFisica(String nome, String endereco, double valorPagamento, List<String> contatos, String cpf) {
        super(nome, endereco, valorPagamento, contatos);
        this.cpf = cpf;
        this.imposto = 0.10;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double realizarPagamento() {

        return valorPagamento - valorPagamento * imposto;
    }

}
