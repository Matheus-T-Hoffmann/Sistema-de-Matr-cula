import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int codigodisciplina;
    private String nome;
    private String unidadeAcademica;
    private String curso;
    private List<Oferecimento> oferecimentos;

    public Disciplina(int codigodisciplina, String nome, String unidadeAcademica, String curso) {
        this.codigodisciplina = codigodisciplina;
        this.nome = nome;
        this.unidadeAcademica = unidadeAcademica;
        this.curso = curso;
        this.oferecimentos = new ArrayList<>();
    }

    public int getCodigoDisciplina() {
        return codigodisciplina;
    }
    
    public String getNome() {
        return nome;
    }

    public String getUnidadeAcademica() {
        return unidadeAcademica;
    }

    public String getCurso() {
        return curso;
    }

    public List<Oferecimento> getOferecimentos() {
        return oferecimentos;
    }

    public void listaOferecimentos(){
        for (Oferecimento oferecimento : oferecimentos){
            System.out.println("Disciplina: "+oferecimento.getNome());
            System.out.println("Código: "+oferecimento.getCodigoDisciplina());
            System.out.println("Semestre: "+oferecimento.getSemestre());
            System.out.println("DRT do professor responsável: "+oferecimento.getProfessorResponsavel());
        }
    }

    public void adicionarOferecimento(Oferecimento oferecimento) {
        if (!oferecimentos.contains(oferecimento)) {
          oferecimentos.add(oferecimento);
        }
    }
}
