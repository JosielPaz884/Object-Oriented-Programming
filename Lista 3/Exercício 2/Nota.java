import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();
        System.out.println("Digite sua matrícula:");
        int registration = scanner.nextInt();
        Aluno aluno = new Aluno(name, registration);
        Disciplina discipline1 = new Disciplina("História", 7.0);
        Disciplina discipline2 = new Disciplina("Matemática", 8.0);
        Disciplina discipline3 = new Disciplina("Português", 9.0);
        aluno.register(discipline1);
        aluno.register(discipline2);
        aluno.register(discipline3);
        System.out.println("Aluno: " + aluno.getName());
        System.out.println("Matrícula: " + aluno.getRegistration());
        for (Disciplina discipline : aluno.getDiscipline()) {
            System.out.println("Disciplina: " + discipline.getName() +
                    " Nota: " + discipline.getNote());
        }
        System.out.println("Média:" + aluno.sum());
        scanner.close();
    }
}
