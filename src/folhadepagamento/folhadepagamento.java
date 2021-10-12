package folhadepagamento;

import classes.*;
import java.text.DecimalFormat;

public class folhadepagamento {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

      /* Pessoa p0 = new Pessoa("431325443","henrique", "henrique..arelli@ho","991586942", "independencia" );
       Aluno a0 = new Aluno("431325443","henrique", "henrique..arelli@ho","991586942", "independencia","44564848","Ads","20/2021");


        Aluno a0 = new Aluno("19.234.234", "Marco Aurelio Guevara", "ma.guevara@fatec.sp.gov.br",
                "11-987654321", "Rua Um, 2, Tres, Quatro-5", "12345",
                "ADS", "23/04/2002");
        System.out.println(a0);

        Disciplina d0 = new Disciplina("POO", "Programacao orientada a objeto", 4, "ADS", pm0);
        System.out.println(d0);

        Matricula m0 = new Matricula(4325, a0, d0, "23/04/2002");
        System.out.println(m0);
*/

        Funcionario funcionarios[] = new Funcionario[5];
        funcionarios[0] = new ProfessorMensalista("14564584985", "Anna",
                "anarenata@fatec.sp.gov.br", "11-987654321", "Av Italia, 150, Independencia, Taubaté - SP", "1000",
                "12.345.678", "23/04/2002", "doutor",
                "doutor", "indeterminado");

        funcionarios[1] = new Mensalista("431325443", "henrique", "henrique..arelli@ho", "991586942", "independencia", "1001", "Ads", "20/2021", "auxiliar");

        funcionarios[2] = new ProfessorHorista("14564584985", "Anna",
                "anarenata@fatec.sp.gov.br", "11-987654321", "Av Italia, 150, Independencia, Taubaté - SP", "1002",
                "12.345.678", "23/04/2002", 10, 40, "doutor", "indeterminado");

        funcionarios[3] = new Horista("431325443", "henrique", "henrique..arelli@ho", "991586942", "Av Italia, 150, Independencia, Taubaté - SP", "1003", "Ti", "20/10", 200, 20);

        funcionarios[4] = new Mensalista("431325443", "henrique", "henrique..arelli@ho", "991586942", "Av Italia, 150, Independencia, Taubaté - SP", "1004", "Ads", "20/2021", "gerente");

        double valorTotal = 0;
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Matricula = " + funcionarios[i].getMatricula() + ", "
                    + df2.format(funcionarios[i].calcSalarioBruto())  + " (Bruto) - "
                    + df2.format(funcionarios[i].calcIRRF()) + " (IRRF) - "
                    + df2.format(funcionarios[i].calcINSS()) + " (INNS) = "
                    + df2.format(funcionarios[i].calcSalario()));
            valorTotal+=funcionarios[i].calcSalarioBruto();
        }
        System.out.println("Valor Total = " + valorTotal);
    }
}
