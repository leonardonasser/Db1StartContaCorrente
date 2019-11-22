package AbstracaoDeControleDeUmaContaCorrente;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ContaCorrenteTest {

    @Test
    public void testarSaldo(){
        MetodosTudo saldoo = new MetodosTudo();
        Double expected = 1920.0;
        Double response = saldoo.metodosaldo(1920.0);
        System.out.println("Seu saldo: "+response);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void  testarSaque() {
        MetodosTudo sacar = new MetodosTudo();
        Double expected = 1820.0;
        Double response = sacar.metodoSaque(100.0,1920.0);
        System.out.println("Saque de "+100.0+" efetuado com sucesso\n Saldo atual: "+response);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void  testarDepositar() {
        MetodosTudo depositar = new MetodosTudo();

        Double expected = 2120.0;
        Double response = depositar.metodoDepositar(1920.0,200.0);
        System.out.println("Deposito de "+200.0+" efetuado com sucesso\nSaldo anterior: "+1920.0+"\nSaldo atual: "+response);
        Assert.assertEquals(expected, response);
    }



    @Test
    public void metodoExtratos(){
        MetodosTudo extratos = new MetodosTudo();
        Map<String, Double> extrato = extratos.metodoExtratos();
        System.out.println("Extrato: \n"+extrato);
    }

    @Test
    public void metodoTransferencia(){
        ContaCliente dadosContaCliente1 = new ContaCliente();
        ContaCliente saldos             = new ContaCliente();
        ContaCliente transferenciaClienteJoao= new ContaCliente();


        Double transferirValorClienteJoao = transferenciaClienteJoao.transferenciaClientejoao();
        Map<String, Integer> dadosContaCliente = dadosContaCliente1.metodoChamaClientes();
        Double saldoJoao = saldos.saldoJoao();
        Double saldoLeonardo = saldos.saldoLeonardo();

        System.out.println(dadosContaCliente+"\n\nSaldo de João: "+saldoJoao+"\nSaldo de Leonardo: "+saldoLeonardo);

        saldoJoao=saldoJoao-transferirValorClienteJoao;
        saldoLeonardo=transferirValorClienteJoao+saldoLeonardo;

        System.out.printf("\nTransferência de: "+transferirValorClienteJoao+"\n");

        System.out.printf("\nSaldo de João após transferência: "+saldoJoao+"\nSaldo de Leonardo após transferência: "+saldoLeonardo);


    }


}





