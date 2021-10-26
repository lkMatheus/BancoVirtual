
package banco.virtual;

import java.util.ArrayList;


public class Banco {
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }
    Cliente getCliente(int conta){
        return clientes.get(conta);
    }
    
    ArrayList<Cliente> getClientes(){
        return clientes;
    }
}
