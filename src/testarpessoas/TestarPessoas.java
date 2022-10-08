package testarpessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author taris
 */
public class TestarPessoas {
    public static void main(String[] args) {

        List<String> contatos = new ArrayList<>();
        contatos.add("Maria");
        contatos.add("Joao");
        contatos.add("José");
        System.out.println(contatos.get(0));

        Collections.shuffle(contatos);

        PessoaFisica pf1 = new PessoaFisica("Taris", "Rua A", 5000, contatos, "123.456.789-00");

        System.out.println(
                "\nNome: " + pf1.getNome() +
                        "\nEndereço: " + pf1.getEndereco() +
                        "\nValor do pagamento: " + pf1.getValorPagamento() +
                        "\nContatos: " + pf1.getContatos() +
                        "\nCPF: " + pf1.getCpf());

    }

}
