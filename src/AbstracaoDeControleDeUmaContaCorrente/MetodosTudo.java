package AbstracaoDeControleDeUmaContaCorrente;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MetodosTudo {

    public static void main(String[] args) {
        Double saldo=1920.0;
        Double sacar=120.0;
        Double deposito=200.0;
        Map<String,Double> extrato = new LinkedHashMap<>();


metodosaldo(saldo);

metodoSaque(sacar,saldo);

metodoDepositar(saldo,deposito);

//metodoExtratos(extrato);

    }


//SALDO
    public static Double metodosaldo(Double saldo){
        return saldo;
    }

//SAQUE
    public static Double metodoSaque(Double sacar, Double saldo){
        saldo=saldo-sacar;
        return saldo;
    }

    public static Double metodoDepositar(Double saldo, Double deposito){
        saldo=deposito+saldo;
        return saldo;
    }

     public Map<String, Double> metodoExtratos(){
        Map<String,Double> extrato = new LinkedHashMap<>();
        extrato.put("\n 20/09 SAQUE  ",120.0 );
        extrato.put("\n 23/09 COMPRA ",320.0);
        extrato.put("\n 01/10 COMPRA ",220.0);
        return extrato;
     }

}
