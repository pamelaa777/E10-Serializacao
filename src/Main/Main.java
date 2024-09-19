package Main;
import java.io.FileNotFoundException;
import java.io.IOException;

import Cliente.*;
import Contas.*;


public class Main {
    public static boolean realTime = true; //Datas aleatorias/ficticias
    public static void main(String[] args) {

        ClientePessoaFisica junia = new ClientePessoaFisica("Junia", "Av. Antonio Carlos, 662", "010.065.376.20", 20, 'f');
        ClientePessoaFisica joao = new ClientePessoaFisica("Joao", "R. Planalto, 69", "090.957.646.43", 40, 'm');

        ClientePessoaJuridica loja1 = new ClientePessoaJuridica("Brecho", "Av. Antonio Carlos, 112", "555669864", 95, "Shipping");
        ClientePessoaJuridica loja2 = new ClientePessoaJuridica("Americanas", "Av. Fleming, 111", "555669296", 38, "Retail");

        Conta conta1 = new ContaUniversitaria("0000-1", 1021, junia, 565, 00, 500);
        Conta conta2 = new ContaCorrente("1234-5", 1234, joao, 2000, -10, 4000); //
        conta1.setDono(loja2);

        try{
            conta2.salvar();
        }catch (Exception v){
            System.out.println(v);
        }

        String ag = "1234-5";
        int c = 1234;
        try{
            Conta loadedConta = Conta.carregar(ag, c);
            System.out.println(loadedConta);
        }catch(FileNotFoundException e){
            System.out.println("Conta não encontrada no Banco de Dados! (Agência: "+ag+", Conta:"+c+")");
        }catch(ClassNotFoundException e){
            System.out.println("Conflito na versão das classes!");
        }catch(IOException e){
            System.out.println(e);
        }

        /*conta1.imprimirExtratoConta(1); //Depositos seguido de Saques
        conta2.imprimirExtratoConta(0); //Ordem de Data
        System.out.println(conta2);
        //conta2.imprimirExtratoTaxas();

        //System.out.println(conta2);

        System.out.println(junia);
        System.out.println(loja1);

        int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
        System.out.println("\nMédia de operações por conta aberta: " + media);

        System.out.println("conta1 == conta2 ? " + conta1.equals(conta2));
        System.out.println("junia == joao ? " + junia.equals(joao));
        System.out.println("loja2 == loja1 ? " + loja1.equals(loja2));

        System.out.println("authenticator: " + loja1.autenticar("555669813"));
        */
        //System.err.println(new ValorNegativoException());
    }
    
}

/* public static void delay(long millis){
    if (timeout){
        try{Thread.sleep(millis);}
        catch (InterruptedException e){Thread.currentThread().interrupt();}
    }
} */
