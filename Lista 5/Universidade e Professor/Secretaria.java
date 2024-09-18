public class Secretaria {
    public static void main(String[] args) {
        Universidade amf = new Universidade("AMF");
        Professor professor1 = new Professor("João", "Matemática");
        Professor professor2 = new Professor("Maria", "Física");
        Professor professor3 = new Professor("Pedro", "Computação");

        amf.addProfessor(professor1);
        amf.addProfessor(professor2);
        amf.addProfessor(professor3);

        amf.listProfessors();
    }
}