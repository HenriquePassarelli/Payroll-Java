package classes;

public class Horista extends Funcionario {
    protected double numHorasSemana;
    protected double valorHora;

    public Horista(String RG, String nome, String email, String tel, String endereco, String matricula, String departamento, String dataMatricula, double numHoras, double valorHora) {
        super(RG, nome, email, tel, endereco, matricula, departamento, dataMatricula);
        this.numHorasSemana = numHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcSalarioBruto() {
        return valorHora * numHorasSemana * 4;
    }

    public double getNumHorasSemana() {
        return numHorasSemana;
    }

    public void setNumHorasSemana(double numHorasSemana) {
        this.numHorasSemana = numHorasSemana;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "numHorasSemana=" + numHorasSemana +
                ", valorHora=" + valorHora +
                ", salarioBruto=" + this.calcSalarioBruto()
                + "\n, IRRF=" + this.calcIRRF()
                + ", INSS="
                + this.calcINSS()
                + ", salario=" + this.calcSalario() +
                ", RG='" + RG + '\'' +
                ", \nnome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                "}\n";
    }
}
