package classes;

public class Aluno extends Pessoa{
    protected String RA;
    protected String curso;
    protected String dataMatricula;

    public Aluno(String RG, String nome, String email, String tel, String endereco, String RA, String curso, String dataMatricula) {
        super(RG, nome, email, tel, endereco);
        this.RA = RA;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA='" + RA + '\'' +
                ", curso='" + curso + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", RG='" + RG + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
