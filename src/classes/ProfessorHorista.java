package classes;

public class ProfessorHorista extends Horista{
    protected String titulo;
    protected String regime;

    public ProfessorHorista(String RG, String nome, String email, String tel, String endereco, String matricula, String departamento, String dataMatricula, double numHoras, double valorHora, String titulo, String regime) {
        super(RG, nome, email, tel, endereco, matricula, departamento, dataMatricula, numHoras, valorHora);
        this.titulo = titulo;
        this.regime = regime;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    protected double calcValorHora(){

        double valorHora = 0;
        if(titulo.equals("especialista"))
            valorHora = 30;
        else if (titulo.equals("mestre"))
            valorHora = 45;
        else if (titulo.equals("doutor"))
            valorHora = 50;
        else
            valorHora = 0;

        if(regime.equals("indeterminado"))
            valorHora = valorHora + (valorHora * 0.15);

        return valorHora;

    }

    @Override
    public double calcSalarioBruto() {
        valorHora = this.calcValorHora();
        return numHorasSemana * valorHora * 5.25;
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" +
                "matricula='" + matricula + '\'' +
                ", departamento='" + departamento + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", numHorasSemana=" + numHorasSemana +
                ",\n valorHora=" + valorHora +
                ", RG='" + RG + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", \ntelefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", titulo='" + titulo + '\'' +
                ", regime='" + regime + '\'' +
                ", \nsalario: " + this.calcSalario() + ", salario bruto: " + this.calcSalarioBruto() +
                ", INSS: " + this.calcINSS() +
                ", IRRF: " + this.calcIRRF() +
                "}\n";
    }
}
