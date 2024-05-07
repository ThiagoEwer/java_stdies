package POO.ATIVIDADES;

import java.util.Scanner;

public class PrincipalExerc {
    public static void main(String[] args) {
        // Criando as disciplinas
        Disciplina disciplina1 = new Disciplina("001", "Matemática");
        Disciplina disciplina2 = new Disciplina("002", "Português");

        // Instanciando a classe Scanner para entrada de dados
        Scanner tec = new Scanner(System.in);

        // Recebendo os dados do aluno
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = tec.nextLine();

        System.out.println("Digite a matrícula do aluno:");
        String matriculaAluno = tec.nextLine();

        // Solicitando ao usuário que escolha a disciplina
        System.out.println("Escolha a disciplina (1 para Matemática, 2 para Português):");
        int escolhaDisciplina = tec.nextInt();
        Disciplina disciplinaSelecionada;

        // Verificando a escolha do usuário e atribuindo a disciplina correspondente
        if (escolhaDisciplina == 1) {
            disciplinaSelecionada = disciplina1;
        } else if (escolhaDisciplina == 2) {
            disciplinaSelecionada = disciplina2;
        } else {
            System.out.println("Opção inválida!");
            return; // Encerra o programa se a opção for inválida
        }

        // Recebendo notas da disciplina selecionada
        System.out.println("Digite a nota 1 de " + disciplinaSelecionada.getNome() + ":");
        double nota1 = tec.nextDouble();
        System.out.println("Digite a nota 2 de " + disciplinaSelecionada.getNome() + ":");
        double nota2 = tec.nextDouble();
        System.out.println("Digite a nota 3 de " + disciplinaSelecionada.getNome() + ":");
        double nota3 = tec.nextDouble();

        // Setando as notas na disciplina selecionada
        disciplinaSelecionada.setNota1(nota1);
        disciplinaSelecionada.setNota2(nota2);
        disciplinaSelecionada.setNota3(nota3);

        // Calculando a média da disciplina selecionada
        disciplinaSelecionada.calcularMedia();

        // Criando o objeto Aluno
        Aluno aluno = new Aluno(nomeAluno, matriculaAluno);
        aluno.adicionarDisciplina(disciplinaSelecionada);

        // Exibindo os dados do aluno em um relatório
        System.out.println("Relatório do Aluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Disciplina: " + disciplinaSelecionada.getNome());
        System.out.println("Nota 1: " + disciplinaSelecionada.getNota1());
        System.out.println("Nota 2: " + disciplinaSelecionada.getNota2());
        System.out.println("Nota 3: " + disciplinaSelecionada.getNota3());
        System.out.println("Média: " + disciplinaSelecionada.getMedia());
        System.out.println("Status: " + disciplinaSelecionada.getStatus());
    }
}

