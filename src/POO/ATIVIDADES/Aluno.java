package POO.ATIVIDADES;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Disciplina> disciplinas;
    private double CRE;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
        this.CRE = 0.0;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double getCRE() {
        return CRE;
    }

    public void setCRE(double CRE) {
        this.CRE = CRE;
    }

    // Método para adicionar disciplina ao aluno
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    // Método para calcular o CRE do Aluno
    public double calcularCRE() {
        double somaCRE = 0;
        int disciplinasConsideradas = 0;

        for (Disciplina disciplina : disciplinas) {
            double media = disciplina.calcularMedia();
            if (media >= 7) {
                somaCRE += media;
                disciplinasConsideradas++;
            }
        }

        if (disciplinasConsideradas > 0) {
            this.CRE = somaCRE / disciplinasConsideradas;
        } else {
            this.CRE = 0.0; // Se não houve disciplinas aprovadas, o CRE é zero
        }

        return this.CRE;
    }
}
