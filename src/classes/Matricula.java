package classes;

import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;

public class Matricula {
    private Integer numero;
    private Aluno aluno;
    private Disciplina disciplina;
    private String dataMatricula;

    public Matricula(Integer numero, Aluno aluno, Disciplina disciplina, String dataMatricula) {
        this.numero = numero;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.dataMatricula = dataMatricula;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "numero=" + numero +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                ", dataMatricula='" + dataMatricula + '\'' +
                '}';
    }
}
