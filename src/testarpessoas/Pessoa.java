
package testarpessoas;

import java.util.List;

/**
 *
 * @author taris
 */
public class Pessoa {
    protected String nome;
    protected String endereco;
    protected double valorPagamento;
    protected List<String> contatos;

    public Pessoa(String nome, String endereco, double valorPagamento, List<String> contatos) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorPagamento = valorPagamento;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public List<String> getContatos() {
        return contatos;
    }

    public void setContatos(List<String> contatos) {
        this.contatos = contatos;
    }

}
