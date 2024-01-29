import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Pessoa P1 = new Pessoa("Andriele", "123123123", 32);
        P1.setNome();
        List<Double> Notas = List.of(8.9, 6.7, 9.9, 7.8);
        Aluno A1 = new Aluno("jose","23232323", 16,"234332","1A","9.8,8.0","Claudia","12341234");
        A1.getMedia();
    }
}