import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private int DRT; 
    private String email;
    private String unidadeAcademica;
    private List<Integer> disciplinasOferecimentos;

    public Professor(int DRT, String nomePessoa, String nascimento, String cep, String telefone, String unidadeAcademica) {
        super(nomePessoa, nascimento, cep, telefone);
        this.DRT = DRT; 
        this.email = this.DRT + "@mackenzie.br";
        this.unidadeAcademica = unidadeAcademica; 
        this.disciplinasOferecimentos = new ArrayList<>();
    }

    public int getDRT() {
        return DRT;
    }

    public String getEmail() {
        return email;
    }

    public String getUnidadeAcademica() {
        return unidadeAcademica;
    }

    public List<Integer> getDisciplinasOferecimentos() {
        return disciplinasOferecimentos;
    }

    public void adicionarOferecimento(int codigoOferecimento) {
        if (!disciplinasOferecimentos.contains(codigoOferecimento)) {
            disciplinasOferecimentos.add(codigoOferecimento);
        }
    }
}