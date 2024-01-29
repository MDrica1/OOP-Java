import java.util.List;

public class Funcionario extends Pessoa{
    String ID;
    Double salario;
    String departamento;

    public Funcionario(String nome, String cpf, int idade, String ID, Double salario, String departamento){
        super(nome,cpf,idade);
        this.ID= ID;
        this.salario=salario;
        this.departamento=departamento;

    }

    public String getDepartamento() {

        return departamento;
    }

    public Double getRendaAnual() {
        Double RendaAnual = salario*12;
        return RendaAnual;
    }
}
