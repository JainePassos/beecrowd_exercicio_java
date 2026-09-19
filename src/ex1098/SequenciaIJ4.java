package ex1098;

public class SequenciaIJ4 {
    public static void main(String[] args) {

        for (double i = 0; i <= 2.0; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                // Formatação para I e J inteiros quando o valor for inteiro (próximo de .0 ou .2/.8 etc)
                // Usamos uma verificação simples ou arredondamento para exibir sem casa decimal quando for inteiro
                if (i == 0 || i == 1 || (i > 1.8 && i < 2.2) || i == 2) {
                    System.out.printf("I=%.0f J=%.0f\n", i, i + j);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, i + j);
                }

                }
            }



        }
    }

