package AtividadeGrupo;

import java.util.Scanner;

public class ExercicioGrupo {
    Scanner sc = new Scanner(System.in);

    public void IMC() {
        System.out.println("Informe seu Nome:");
        String nome = sc.nextLine();
        System.out.println("Informe sua Idade:");
        int idade = sc.nextInt();
        System.out.println("Informe seu Sexo(1-Feminino 2-Masculino)");
        int sexo = sc.nextInt();
        System.out.println("Informe sua Altura");
        double altura = sc.nextDouble();
        System.out.println("Informe seu Peso");
        double peso = sc.nextDouble();
        double pesoIdeal = 0;
        if (sexo == 1) {
            pesoIdeal = 72.7 * altura - 58;

        } else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.println("Seu peso ideal é " + pesoIdeal + "Kg");
        /* imc */
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é "+imc);
        int faixaEtaria = 0;
        if (idade >= 16 && idade <= 25) {
            faixaEtaria = 1;
        } else if (idade >= 26 && idade <= 35) {
            faixaEtaria = 2;
        } else if (idade >= 36 && idade <= 45) {
            faixaEtaria = 3;

        } else if (idade >= 46 && idade <= 55) {
            faixaEtaria = 4;
        } else if (idade >= 56 && idade <= 65) {
            faixaEtaria = 5;
        } else {
            faixaEtaria = 6;
        }
        int dificuldade = 0;
        if (imc < 20) {
            dificuldade = 1;
        } else if (imc >= 20 && imc <= 27) {
            dificuldade = 2;
        } else if (imc >27){
            dificuldade = 3;
        }
        double diferencaPeso = 0;
        if (peso > pesoIdeal) {
            diferencaPeso = peso - pesoIdeal;
            System.out.println("Você precisa perder " + diferencaPeso + "Kgs");
        } else if (peso < pesoIdeal) {
            diferencaPeso = pesoIdeal - peso;
            System.out.println("Você precisa ganhar " + diferencaPeso + "Kgs");
        } else {
            System.out.println("Você está no peso ideal");
        }
        System.out.println("É recomendado você fazer as seguintes atividades :");
        /* 1 dificil 2 moderado 3 facil */
        if (dificuldade == 1 && faixaEtaria == 2 || dificuldade == 1 && faixaEtaria == 3) {
            System.out.println("Musculação Intensa");
        }if (dificuldade == 2 && faixaEtaria == 1 || dificuldade == 2 && faixaEtaria == 2 || dificuldade == 2 && faixaEtaria == 3 ||dificuldade == 2 && faixaEtaria == 4) {
            System.out.println("Musculação Moderada");
        }if (dificuldade == 3 && faixaEtaria == 1 ||dificuldade == 3 && faixaEtaria == 4 ||dificuldade == 3 && faixaEtaria == 6 ||dificuldade == 3 && faixaEtaria == 5) {
            System.out.println("Musculação Leve");
        }if (dificuldade == 1 && faixaEtaria == 1 ||dificuldade == 1 && faixaEtaria == 2 ||dificuldade == 1 && faixaEtaria == 3 ||dificuldade == 1 && faixaEtaria == 4) {
            System.out.println("Luta");
        }if (dificuldade == 2) {
            System.out.println("Dança");
        }if (dificuldade == 1 && faixaEtaria == 4 ||dificuldade == 1 && faixaEtaria == 6 ||dificuldade == 1 && faixaEtaria == 5) {
            System.out.println("Pilates");
        }if (dificuldade == 2 && faixaEtaria == 2 ||dificuldade == 2 && faixaEtaria == 3 ||dificuldade == 2 && faixaEtaria == 4 ||dificuldade == 2 && faixaEtaria == 5) {
            System.out.println("Corrida");
        }if (dificuldade == 3) {
            System.out.println("Ioga");
        }
    }

}
