// Nome: Breno Guedes da Silva - 10425218
// Matheus Tramont Hoffmann - 10425295
// Sérgio de Souza Melo - 10425206

public class Main {
    public static void main(String[] args) {
      Listas listas = new Listas();
  
      // Criação de estudantes
      Estudante estudante1 = new Estudante(1, "Matheus", "2004", "12345-67", "(11) 99782-6139", "Sistemas de Informação", 2023, 2);
      Estudante estudante2 = new Estudante(2, "Sérgio", "2003", "12345-67", "(11) 12345-6789", "Sistemas de Informação", 2023, 2);
      Estudante estudante3 = new Estudante(3, "Breno", "2004", "12345-67", "(11) 12345-6789", "Sistemas de Informação", 2023, 2);
      Estudante estudante4 = new Estudante(4, "Julio", "2003", "12345-67", "(11) 12345-6789", "Sistemas de Informação", 2023, 2);
      listas.adicionarEstudante(estudante1);
      listas.adicionarEstudante(estudante2);
      listas.adicionarEstudante(estudante3);
      listas.adicionarEstudante(estudante4);
  
      // Criação de professores
      Professor professor1 = new Professor(1, "André", "1990", "12345-67", "(11) 12345-6789", "FCI");
      Professor professor2 = new Professor(2, "Thiago", "1990", "12345-67", "(11) 12345-6789", "FCI");
      listas.adicionarProfessor(professor1);
      listas.adicionarProfessor(professor2);
  
      // Criação de disciplinas
      Disciplina disciplina1 = new Disciplina(1, "Programação", "FCI", "Sistemas de Informação");
      Disciplina disciplina2 = new Disciplina(2, "Banco de Dados", "FCI", "Sistemas de Informação");
      Disciplina disciplina3 = new Disciplina(3, "Inteligência Artificial", "FCI", "Sistemas de Informação");
      Disciplina disciplina4 = new Disciplina(4, "Redes de Computadores", "FCI", "Sistemas de Informação");
      listas.adicionarDisciplina(disciplina1);
      listas.adicionarDisciplina(disciplina2);
      listas.adicionarDisciplina(disciplina3);
      listas.adicionarDisciplina(disciplina4);
  
      // Criação de oferecimentos e matrícula de estudantes
      Oferecimento oferecimento1 = new Oferecimento(1, "Programação", "FCI", "Sistemas de Informação", 1, "2024/01", 1);
      Oferecimento oferecimento2 = new Oferecimento(2, "Banco de Dados", "FCI", "Sistemas de Informação", 2, "2024/01", 2);
      Oferecimento oferecimento3 = new Oferecimento(3, "Inteligência Artificial", "FCI", "Sistemas de Informação", 3, "2024/01", 1);
      disciplina1.adicionarOferecimento(oferecimento1);
      disciplina2.adicionarOferecimento(oferecimento2);
      disciplina3.adicionarOferecimento(oferecimento3);
  
      oferecimento1.matricularEstudante(1);
      oferecimento1.matricularEstudante(2);
      oferecimento1.matricularEstudante(3);
      oferecimento1.matricularEstudante(4);
  
      oferecimento2.matricularEstudante(1);
      oferecimento2.matricularEstudante(2);
      oferecimento2.matricularEstudante(3);
      oferecimento2.matricularEstudante(4);
  
      oferecimento3.matricularEstudante(1);
      oferecimento3.matricularEstudante(2);
      oferecimento3.matricularEstudante(3);
  
      // Adicionar códigos de oferecimento aos estudantes
      estudante1.adicionarCodigoOferecimento(1); 
      estudante2.adicionarCodigoOferecimento(1); 
      estudante3.adicionarCodigoOferecimento(1);
      estudante4.adicionarCodigoOferecimento(1);
  
      estudante1.adicionarCodigoOferecimento(2); 
      estudante2.adicionarCodigoOferecimento(2); 
      estudante3.adicionarCodigoOferecimento(2);
      estudante4.adicionarCodigoOferecimento(2);
  
      estudante1.adicionarCodigoOferecimento(3); 
      estudante2.adicionarCodigoOferecimento(3); 
      estudante3.adicionarCodigoOferecimento(3);
      estudante4.adicionarCodigoOferecimento(3);
  
      estudante1.adicionarCodigoOferecimento(4); 
      estudante2.adicionarCodigoOferecimento(4); 
      estudante3.adicionarCodigoOferecimento(4);
      estudante4.adicionarCodigoOferecimento(4);
  
      professor1.adicionarOferecimento(1);
  
      // Chamada de métodos para listar informações
      listas.buscaEstudante(1);
      System.out.println(" ");
      listas.buscaProfessor(1);
      System.out.println(" ");
      listas.buscaDisciplina(3);
      System.out.println(" ");
      listas.buscaOferecimento(2,2);
      System.out.println(" ");
  
      listas.listaEstudantes();
      System.out.println(" ");
      listas.listaProfessores();
      System.out.println(" ");
      listas.listaDisciplinas();
      System.out.println(" ");
      disciplina1.listaOferecimentos();
      System.out.println(" ");
      listas.listaOferecimento(2,2);
      System.out.println(" ");
  
    }
  }
  