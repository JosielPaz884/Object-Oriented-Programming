import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String name;
    private int registration;
    private List<Disciplina> discipline;

    public Aluno(String name, int registration) {
        this.name = name;
        this.registration = registration;
        this.discipline = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getRegistration() {
        return registration;
    }

    public List<Disciplina> getDiscipline() {
        return discipline;
    }

    public void register(Disciplina disciplines) {
        discipline.add(disciplines);
    }

    public double sum() {
        double sum = 0;
        for (Disciplina d : discipline) {
            sum += d.getNote();
        }
        return sum / discipline.size();
    }

}
