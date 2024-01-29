import java.util.List;

public class Professor extends Funcionario{
    List<String> materias;

    public Professor(String nome, String cpf, int idade, String ID, Double salario, String departamento, List<String> materias){
        super(nome, cpf, idade, ID, salario, departamento);
        this.materias = materias;
    }
    public void EnsinarMateria(){
        for (int i=0;i<=materias.size();i++) {
            System.out.println(nome + "está ensinando.");
        }
    }
}
