package folhadepagamento;

import classes.*;

public class MatriculaAluno {

    public static void main(String[] args) {

        ProfessorMensalista pm0 = new ProfessorMensalista("14564584985", "Anna",
                "anarenata@fatec.sp.gov.br", "11-987654321", "Av Italia, 150, Independencia, Taubaté - SP", "1000",
                "12.345.678", "23/04/2002", "doutor",
                "doutor", "indeterminado");

        Pessoa p0 = new Pessoa("431325443","henrique", "henrique..arelli@ho","991586942", "independencia" );
        Aluno a0 = new Aluno("431325443","henrique", "henrique..arelli@ho","991586942", "independencia","44564848","Ads","20/2021");

        System.out.println(a0);

        Disciplina d0 = new Disciplina("POO", "Programacao orientada a objeto", 4, "ADS", pm0);
        System.out.println(d0);

        Matricula m0 = new Matricula(4325, a0, d0, "23/04/2002");
        System.out.println(m0);




    }
}
