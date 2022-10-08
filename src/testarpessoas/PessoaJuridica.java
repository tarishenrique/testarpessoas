package testarpessoas;

import java.util.List;

/**
 *
 * @author taris
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private double imposto;

    public PessoaJuridica(String nome, String endereco, double valorPagamento, List<String> contatos, String cnpj,
            String nomeFantasia, String razaoSocial) {
        super(nome, endereco, valorPagamento, contatos);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.imposto = 0.20;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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
