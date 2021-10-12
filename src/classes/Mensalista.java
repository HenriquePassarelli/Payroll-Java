package classes;

public class Mensalista extends Funcionario{
    protected String cargo;

    public Mensalista(String RG, String nome, String email, String tel, String endereco, String matricula, String departamento, String dataMatricula, String cargo) {
        super(RG, nome, email, tel, endereco, matricula, departamento, dataMatricula);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    @Override
    public double calcSalarioBruto() {
        if(cargo.equals("auxiliar") ){
            return 1100;
        }else if( cargo.equals("atendente")) {
            return 1700;
        }else if(cargo.equals("gerente")){
            return 2500;
        }else if(cargo.equals("diretor")){
            return 3500;
        }else { return 0; }
    }

    @Override
    public String toString() {
        return "Mensalista{" +"matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                "cargo='" + cargo + '\'' +
                " \nsálario bruto = "+ this.calcSalarioBruto()+
                ", RG='" + RG + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                "}\n";
    }

}
