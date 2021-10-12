package classes;

public class Disciplina {
    private String codigo;
    private String nome;
    private Integer semestre;
    private String curso;
    private ProfessorMensalista titular;

    public Disciplina(String codigo, String nome, Integer semestre, String curso, ProfessorMensalista titular) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
        this.curso = curso;
        this.titular = new ProfessorMensalista(titular.getTitulo(), titular.getRegime(), titular.getCargo() ,titular.getMatricula(),
                titular.getDepartamento(), titular.getDataMatricula(), titular.getRG(),
                titular.getNome(), titular.getEmail(), titular.getTelefone(), titular.getEndereco());;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ProfessorMensalista getTitular() {
        return titular;
    }

    public void setTitular(ProfessorMensalista titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", semestre=" + semestre +
                ", curso='" + curso + '\'' +
                ", titular=" + titular +
                '}';
    }
}
