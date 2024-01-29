public class Faxineiro extends Funcionario {
    int HorasTrabalhadas;
    public Faxineiro(String nome, String cpf, int idade, String ID, Double salario, String departamento, int HorasTrabalhadas){
        super(nome, cpf, idade, ID, salario, departamento);
        this.HorasTrabalhadas = HorasTrabalhadas;
    }

    public int getHorasSemanaiss() {
        return HorasTrabalhadas*5;
    }
    public void Limpar(){
        System.out.println(nome+" está limpando.");
    }
}
