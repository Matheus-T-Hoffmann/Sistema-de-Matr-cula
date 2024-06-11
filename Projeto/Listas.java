import java.util.ArrayList;
import java.util.List;

public class Listas{
  private List <Estudante> Estudantes;
  private List <Professor> Professores;
  private List <Disciplina> Disciplinas;

  public Listas(){
    this.Estudantes = new ArrayList<>();
    this.Professores = new ArrayList<>();
    this.Disciplinas = new ArrayList<>();
  }

  public void adicionarEstudante(Estudante estudante){
    Estudantes.add(estudante);
  }

  public List<Estudante> getEstudantes(){
    return Estudantes;
  }
  
  public boolean buscaEstudante(int RA) {
      for(Estudante estudante : Estudantes){
          if (estudante.getRA() == RA){
              System.out.println("Nome: "+estudante.getNomePessoa());
              System.out.println("Curso: "+estudante.getCurso());
              System.out.println("Semestre em que ingressou: "+estudante.getSemestre());
              System.out.println("Semestre de conclusão previsto: "+estudante.getSemestreConclusão());
              System.out.println("Ano de nascimento: "+estudante.getNascimento());
              System.out.println("CEP: "+estudante.getCEP());
              System.out.println("Email: "+estudante.getEmail());
              System.out.println("Número de telefone: "+estudante.getTelefone());
              System.out.println("Códigos de oferecimentos em que está matriculado: "+estudante.getCodigosOferecimento());
              return true;
          }
      }
      System.out.println("Estudante não encontrado.");
      return false;
  }

  public void listaEstudantes() {
    for(Estudante estudante : Estudantes){
      System.out.println("Nome: "+estudante.getNomePessoa());
      System.out.println("RA: "+estudante.getRA());
      System.out.println("Curso: "+estudante.getCurso());
    }
  }

  public void listaEstudantesMatriculados(int codigoDisciplina) {
      for (Disciplina disciplina : Disciplinas) {
          if (disciplina.getCodigoDisciplina() == codigoDisciplina) {
              System.out.println("Estudantes matriculados na disciplina " + disciplina.getNome() + ":");
              for (Oferecimento oferecimento : disciplina.getOferecimentos()) {
                  System.out.println("Oferecimento " + oferecimento.getCodigoOferecimento() + ":");
                  for (int RA : oferecimento.getEstudantesMatriculados()) {
                      for (Estudante estudante : Estudantes) {
                          if (estudante.getRA() == RA) {
                              System.out.println("- " + estudante.getNomePessoa() + " (RA: " + RA + ")");
                          }
                      }
                  }
              }
              return;
          }
      }
      System.out.println("Disciplina não encontrada.");
  }

  public void adicionarProfessor(Professor professor){
    Professores.add(professor);
  }

  public boolean buscaProfessor(int DRT){
    for (Professor professor : Professores){  
      if (professor.getDRT() == DRT){
            System.out.println("Nome: "+professor.getNomePessoa());
            System.out.println("Unidade: "+professor.getUnidadeAcademica());
            System.out.println("Ano de nascimento: "+professor.getNascimento());
            System.out.println("CEP: "+professor.getCEP());
            System.out.println("Email: "+professor.getEmail());
            System.out.println("Número de telefone: "+professor.getTelefone());
            System.out.println("Códigos de oferecimentos sob sua responsabilidade: "+professor.getDisciplinasOferecimentos());
            return true;
        }
      }
      System.out.println("Professor não encontrado.");
      return false;
  }

  public void listaProfessores(){
    for (Professor professor : Professores){
      System.out.println("Nome: "+professor.getNomePessoa());
      System.out.println("DRT: "+professor.getDRT());
    }
  }
  
  public void adicionarDisciplina(Disciplina disciplina){
    Disciplinas.add(disciplina);
  }

  public boolean buscaDisciplina(int codigo){
    for (Disciplina disciplina : Disciplinas){
      if (disciplina.getCodigoDisciplina() == codigo){
          System.out.println("Disciplina: "+disciplina.getNome());
          System.out.println("Unidade: "+disciplina.getUnidadeAcademica());
          System.out.println("Curso: "+disciplina.getCurso());
          return true;
      }
    }
      System.out.println("Disciplina não encontrada.");
      return false;
  }

  public void listaDisciplinas(){
    for (Disciplina disciplina : Disciplinas){
      System.out.println("Disciplina: "+disciplina.getNome());
      System.out.println("Unidade: "+disciplina.getUnidadeAcademica());
      System.out.println("Código: "+disciplina.getCodigoDisciplina());
    }
  }

  

  public boolean buscaOferecimento(int codigoDisciplina, int codigoOferecimento){
    for (Disciplina disciplina : Disciplinas){
      if (disciplina.getCodigoDisciplina() == codigoDisciplina){
        for (Oferecimento oferecimento : disciplina.getOferecimentos()){
          if (oferecimento.getCodigoOferecimento() == codigoOferecimento){
            System.out.println("Disciplina: "+oferecimento.getNome());
            System.out.println("Unidade: "+oferecimento.getUnidadeAcademica());
            System.out.println("Curso: "+oferecimento.getCurso());
            System.out.println("Semestre: "+oferecimento.getSemestre());
            System.out.println("DRT do professor responsável: "+oferecimento.getProfessorResponsavel());
            return true;
          }
        }
        System.out.println("Oferecimento não encontrado.");
        return false;
      }
    }
    System.out.println("Disciplina não encontrada.");
    return false;
  }

  public boolean listaOferecimento(int codigoDisciplina, int codigoOferecimento){
    for (Disciplina disciplina : Disciplinas){
      if (disciplina.getCodigoDisciplina() == codigoDisciplina){
        for (Oferecimento oferecimento : disciplina.getOferecimentos()){
          if (oferecimento.getCodigoOferecimento() == codigoOferecimento){
              System.out.println("Disciplina: "+oferecimento.getNome());
              System.out.println("Semestre: "+oferecimento.getSemestre());
              System.out.println("Professor: "+oferecimento.getProfessorResponsavel());
              System.out.println("Alunos matriculados: ");
              for(int RA : oferecimento.getEstudantesMatriculados()){
                  for(Estudante estudante : Estudantes){
                      if (estudante.getRA() == RA){
                          System.out.println("Nome: "+estudante.getNomePessoa());
                      }
                  }
                  System.out.println("RA: "+RA);
              }
              return true;
          }
        }
        System.out.println("Oferecimento não encontrado.");
        return false;
      }
    }
    System.out.println("Disciplina não encontrada.");
    return false;
  }
}
    