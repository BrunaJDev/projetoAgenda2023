
public class Pessoa {
    String nome;
    String numeroTel;
    String email;

    public Pessoa(String nome, String numeroTel, String email) {
        setEmail(email);
        setNome(nome);
        setNumero(numeroTel);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numeroTel;
    }

    public void setNumero(String numero) {
        this.numeroTel = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Função usada para chamar no outro metodo de exibir contados.
    public void Listar(){
        System.out.println("Nome" + this.nome);
        System.out.println("Numero:" + this.numeroTel);
        System.out.println("Email: " + this.email);
    }

    public void Exibir1(){
        System.out.println("Nome" + this.nome);
        System.out.println("Numero:" + this.numeroTel);
        System.out.println("Email: " + this.email);
    }


}
