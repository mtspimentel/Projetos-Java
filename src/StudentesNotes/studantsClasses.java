package StudentesNotes;

import java.util.Scanner;

public class studantsClasses {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        FinalNotes aluno = new FinalNotes();
        aluno.name = sc.nextLine();

        System.out.println("Qual foi a nota 1: ");
        aluno.note1 = sc.nextDouble();

        System.out.println("Qual foi a nota 2: ");
        aluno.note2 = sc.nextDouble();

        System.out.println("Qual foi a nota 3: ");
        aluno.note3 = sc.nextDouble();

        System.out.print(aluno);
        System.out.println();

        if (aluno.totalNotes() >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.missingNote());
        }

        sc.close();
    }
}
