
package banco.virtual;
import java.util.Scanner;

public class Menu {
    Scanner keyboard = new Scanner(System.in);
    Banco banco = new Banco();
    boolean exit;
    
    public static void main(String[] args){
        
    }
    public void runMenu(){
        printCabeca();
        while(!exit){
            printMenu();
            int escolha = getInput();
            Acao(escolha);
        }
        
    }

    private void printCabeca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Acao(int escolha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
