package AbstracaoDeControleDeUmaContaCorrente;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContaCliente {

    public Map<String, Integer> metodoChamaClientes() {
        Map<String, Integer> identificaçãoClientes = new LinkedHashMap<>();
       identificaçãoClientes.put("\nNome: João Carlos\n  ContaCliente",26599);
       identificaçãoClientes.put("\nNome: Leonardo Nasser\n  ContaCliente",27386);
       return identificaçãoClientes;
    }
    public Double saldoJoao() {
        Double saldo1joao = 5680.0;
    return saldo1joao;
    }

    public Double saldoLeonardo() {
        Double saldo1Leonardo = 8920.0;
    return saldo1Leonardo;
    }

    public Double transferenciaClientejoao(){
        double tranferenciaValor=520;

        return tranferenciaValor;
    }


}
