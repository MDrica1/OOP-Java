public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void setNome(){
        System.out.println("Nome: "+nome);
    }public void setCpf(){
        System.out.println("CPF: "+cpf);
    }
    public void setIdade(){
        System.out.println("Idade: "+idade);
    }

}
