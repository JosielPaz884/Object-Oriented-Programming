import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String name;
    private List<Professor> professors;

    public Universidade(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void listProfessors() {
        System.out.println("Professores da Universidade " + name + ":");
        for (Professor professor : professors) {
            System.out.println("Nome: " + professor.getName() + ", Especialidade: " + professor.getSubject());
        }
    }
}