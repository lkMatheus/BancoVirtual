
package banco.virtual;


public class Conta {
    private double extrato;
    private int numeroConta;
    private static int numerodeContas = 1000000;
    
    Conta(){
        numeroConta = numerodeContas++;
    }
    public double getExtrato(){
        return extrato;
    }        
    public void setExtrato(double extrato){
        this.extrato = extrato;
    }
    
}
