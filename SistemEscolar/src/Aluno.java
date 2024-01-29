import java.util.List;

public class Aluno extends Pessoa{
    String matricula;
    String turma;
    List<Double> notas;
    String responsavel;
    String contato;
    public Aluno(String nome, String cpf, int idade, String matricula, String turma, List<Double> notas, String responsavel,String contato){
        super(nome,cpf,idade);
        this.matricula = matricula;
        this.turma=turma;
        this.notas=notas;
        this.responsavel=responsavel;
        this.contato = contato;
    }

    public Double getMedia(){
        if (notas.isEmpty()){
            return 0.0;
        }
        Double soma = 0.0;
        for (Double nota:notas ){
            soma+=nota;
        }
        return soma/notas.size();
    }
    public void setMatricula(){
        System.out.println("Matricula: "+matricula);
    }public void setTurma(){
        System.out.println("Turma: "+turma);
    }
    public void setResponsavel(){
        System.out.println("Responsável: "+responsavel);
    }

    public void setContato(){
        System.out.println("Contato do responsável: "+contato);
    }


}
