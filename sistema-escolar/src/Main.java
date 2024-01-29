import java.text.DecimalFormat;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        List<Double> Notas = List.of(8.9, 6.7, 9.9, 7.8);
        List<String> Materias =List.of("Portugês", "Inglês", "Literatura");

        Pessoa P1 = new Pessoa("Jesus", "123123123", 33);
        Aluno A1 = new Aluno("jose","23232323", 16,"234332","1A",Notas,"Claudia","12341234");
        Funcionario F1 = new Funcionario("Victor","1223221",24,"434343",3500.1,"TI");
        Professor Pr1 = new Professor("Claudia","1233234",51,"232",3000.1,"Docência", Materias);
        Faxineiro Fa1 = new Faxineiro("Nava","233322",50,"123",1300.2,"Limpeza",6);

        System.out.println("A pessoa exemplo é "+P1.getNome());
        System.out.println("A média de "+A1.nome+" é "+A1.getMedia());
        System.out.println("A renda anual de "+F1.nome+" é "+F1.getRendaAnual());
        Pr1.EnsinarMateria();
        Fa1.Limpar();
        System.out.println(Fa1.nome+" trabalha "+Fa1.getHorasSemanaiss()+" horas por semana.");

    }
}