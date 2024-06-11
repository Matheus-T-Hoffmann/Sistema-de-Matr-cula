import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa {
  private int RA;
  private String email;
  private String curso;
  private String semestre;
  private String semestreconclusão;
  private List<Integer> codigosOferecimento;

  public Estudante(int RA, String nomePessoa, String nascimento, String cep, String telefone, String curso, int ano, int semestre) {
    super(nomePessoa, nascimento, cep, telefone);
    this.RA = RA;
    this.email = RA + "@mackenzista.com.br";
    this.curso = curso;
    this.semestre = ano+"."+semestre;
    this.semestreconclusão = CalculaAnoConclusão(semestre, ano)+ "." +CalculaSemestreConclusão(semestre);
    this.codigosOferecimento = new ArrayList<>(); //Lista de códigos de oferecimento das aulas que está matriculado
  }

  public int getRA() {
    return RA;
  }

  public String getEmail() {
    return email;
  }

  public String getCurso() {
    return curso;
  }

  public String getSemestre() {
    return semestre;
  }

  public String getSemestreConclusão() {
    return semestreconclusão;
  }

  public List<Integer> getCodigosOferecimento() {
    return codigosOferecimento;
  }

  public int CalculaSemestreConclusão(int semestre) {
    if (semestre==1) {
      return 2;
    } else {
      return 1;
    }
  }

  public int CalculaAnoConclusão(int semestre, int ano) {
    if (semestre == 1) {
      return (ano + 3);
    } else {
      return ano + 4;
    }
  }

  public void adicionarCodigoOferecimento(int codigoOferecimento) {
    if (!codigosOferecimento.contains(codigoOferecimento)) {
      codigosOferecimento.add(codigoOferecimento);
    }
  }
}
