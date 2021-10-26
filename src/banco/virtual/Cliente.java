
package banco.virtual;


public class Cliente {
    private final String Nome;
    private final String SobreNome;
    private final Conta conta;
    
    Cliente(String Nome, String SobreNome, Conta conta){
        this.Nome = Nome;
        this.SobreNome = SobreNome;
        this.conta = conta;
    }
    
   
}
