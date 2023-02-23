package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
        //criamos uma conta
		ContaCorrente c1 = (ContaCorrente) new Conta(1, 123, 1, "Gabriel de Souza", 30000.f );
		
	  
		c1.visualizar();
		// alteramos o saldo
		c1.setSaldo(35000.f);
		//ver saldo
		c1.getSaldo();
		
		System.out.println("\n\n" + c1.getSaldo());
		//criamos uma conta 2
		ContaCorrente c2 = (ContaCorrente) new Conta(2, 123, 1, "Dener Cardoso", 50000.0f);
		
		c2.visualizar();
		//fizemos um saque
		if(c2.sacar(10000.0f))
			System.out.println("\n\n" + c2.getSaldo());
		//fizemos um deposito
		c1.depositar(10000.0f);
		
		int opcao;
		
	  while (true) {
		  
		  
		  System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_BLACK_BACKGROUND +"*****************************************************************");
		  System.out.println("*                                                                *");
		  System.out.println("*                          GEN BANK                             *");
		  System.out.println("*                                                               *");
		  System.out.println("*****************************************************************");
		  System.out.println("*                                                               *");
		  System.out.println("*                  1- Criar conta:                              *");
		  System.out.println("*                  2- listar todas as contas                    *");
		  System.out.println("*                  3- Bucas conta por número                    *");
		  System.out.println("*                  4- Atualizar Dados das conta                 *");
		  System.out.println("*                  5- Apagar conta                              *");
		  System.out.println("*                  6- Sacar                                     *");
		  System.out.println("*                  7- Depositar                                 *");
		  System.out.println("*                  8- tranferir valores entre contas            *");
		  System.out.println("*                  9- Sair                                      *");
		  System.out.println("*                                                               *");
		  System.out.println("*****************************************************************");
		  System.out.println("*                                                               *");
		  System.out.println("*Entre com a opção desejada:                                    *");
		    opcao = leia.nextInt();
		  System.out.println("*                                                               *");
		  System.out.println("*****************************************************************" + Cores.TEXT_RESET);
		  
		
		  
		  if (opcao == 9) {
			  System.out.println("\nGen Bank - Construindo Hitórias, Realizando Sonhos ");
			  leia.close();
			  System.exit(0);
			
		  }
		  
		  switch (opcao) {
		
		  case 1:
			  System.out.println("Criar Conta\n\n");
			  break;
			  
		  case 2:
			  System.out.println("Listar todas as contas\n\n");
			  break;
			  
		  case 3:
			  System.out.println("Consultar dados da conta\n\n");
			  break;
			  
		  case 4:
			  System.out.println("Atualizar dados da conta\n\n");
			  break;
			  
		  case 5:
			  System.out.println("Apagar a conta\n\n");
			  break;
			  
		  case 6:
			  System.out.println("Saque\n\n");
			  break;
			  
		  case 7:
			  System.out.println("Deposito\n\n");
			  break;
			  
		  case 8:
			  System.out.println("Transferência entre contas");
			  break;
			  
		  default:
			  System.out.println("\n Opção inválida\n");
		 }
		  
	   }
	}

}
