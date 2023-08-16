
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda objetoAgenda = new Agenda(); //New Aluno
        System.out.println("AGENDA 2023");

        while (true) {
            System.out.println("Escolha: 1- Adicionar, 2- Remover, 3- Buscar, 4- Exibir todos, 5- Encerrar");

            int op = leitor.nextInt();
            // Consumindo a quebra de linha deixada pelo nextInt()
            leitor.nextLine();
            if (op == 1) {
                //Criei variaveis locals no main, para atribuir valores aos atributos do Array.
                System.out.println("NOME:  ");
                String nome = leitor.nextLine();//Neste caso deve-se usar o nextLine, uma vez que o next lê apenas uma sequencia de caracteres sem espaço
                System.out.print("Tel:  ");
                String numeroTel = leitor.nextLine();
                System.out.print("Email:  ");
                String email = leitor.nextLine();

                Pessoa obPessoa = new Pessoa(nome, numeroTel, email); //Criando um objeto novo.
                objetoAgenda.armazenarPessoa(obPessoa); //instancia atribuida a esses atributos da array.

            } else if (op == 2) {
                System.out.println("Para remover um contato digite o nome da pessoa:  ");
                String nome = leitor.nextLine();
                objetoAgenda.removerPessoa(nome);

            }else if (op == 3) {
                System.out.println("Para buscar um contato digite o nome da pessoa:  ");
                String nome = leitor.nextLine();
                objetoAgenda.imprimirPessoa(nome);

            } else if (op == 4) {
               objetoAgenda.imprimirAgenda();

            } else if (op == 5){
               System.out.println("Encerrando...");
	       break;
	    }
        }


    }
}
