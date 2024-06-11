import java.util.ArrayList;
import java.util.List;

public class Oferecimento extends Disciplina {
    private int codigooferecimento;
    private String semestre;
    private int professorResponsavel;
    private List<Integer> estudantesMatriculados; 

    public Oferecimento(int codigodisciplina, String nome, String unidadeAcademica, String curso, int codigooferecimento, String semestre, int professorResponsavel) {
        super(codigodisciplina, nome, unidadeAcademica, curso);
        this.codigooferecimento = codigooferecimento;
        this.semestre = semestre;
        this.professorResponsavel = professorResponsavel;
        this.estudantesMatriculados = new ArrayList<>();
        super.adicionarOferecimento(this);
    }

    public int getCodigoOferecimento() {
        return codigooferecimento;
    }

    public String getSemestre() {
        return semestre;
    }

    public int getProfessorResponsavel() {
        return professorResponsavel;
    }

    public List<Integer> getEstudantesMatriculados() {
        return estudantesMatriculados;
    }

    public void matricularEstudante(int ra) {
        if (!estudantesMatriculados.contains(ra)) {
            estudantesMatriculados.add(ra);
        }
    }
}
