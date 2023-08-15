
//um método "void" faz sentido para armazenar dados em um array.
//Um método void, não retorna valor nenhum, como um resultado da execução do método.(valor double de uma operação)
//Em vez disso, o método pode executar ações, como adicionar elementos a um array, exibir informações, atualizar o estado interno de um objeto, entre outros.

import java.util.ArrayList;

public class Agenda{
    ArrayList<Pessoa> armazenarPessoa; // classe import onde vai armazenar. Tipo: Pessoa(classe), nome:armazenarPessoa.
    //O ArrayList Puxa o Objeto Pessoa;

    public  Agenda () {
        this.armazenarPessoa = new ArrayList<>(); //Metodo construtor, para a classe inteira percorrer os arrays.
    } //Um array list tem que ser construido fora do escopo da função. Para ser global.


    //armazenar a pessoa em um array, uma pessoa com seus dados, vira um array:
    //Nisso, criei uma classe pessoa e instaciei um objeto dentro do Array.
    public void armazenarPessoa(Pessoa pessoa) {
        armazenarPessoa.add(pessoa);
        System.out.println("Armazenado" + pessoa);}

    public void removerPessoa(String nome) {
        //Remove a pessoa e todos os seus dados do array, tendo como parametro o nome.
        for (Pessoa pessoa : armazenarPessoa) { //Para cada Objeto da classe Pessoa dentro do array;
            if(pessoa.getNome().equals(nome)){ //sse se o valor da variavel que receber for uma string nome no teclado.
                armazenarPessoa.remove(pessoa); //Remove o objeto inteiro
                System.out.println("Contado removido" + pessoa);
                break;
            }
            }
        }
    public void imprimirPessoa(String nome) {
        //Imprime a pessoa pesquisada e seus dados.
        for (Pessoa pessoa : armazenarPessoa) {//Para cada  Objeto da classe Pessoa dentro do array;
            if(pessoa.getNome().equals(nome)) // se se o valor da variavel que receber for uma string nome no teclado.
               pessoa.Exibir1(); //Exibe seus dados
            }
        }

    public void imprimirAgenda() {
        //Imprime os dados de todas as pessoas;
        System.out.println("Lista de Contatos: "); //Para  novo Objeto da classe Pessoa dentro do array;
        for (Pessoa pessoa:armazenarPessoa) { //Exibe a lista
            pessoa.Listar();
        }

    }

}