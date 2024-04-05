package Calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main (String[] args){
       int soma = 1;
       int subtracao = 2;
       int multiplicacao = 3;
       int divisao = 4;
       int restoDivisao = 5;
       int porcentagem =6 ;
       int somarPorcentagem = 7;
       int subtracaoPorcentage = 8;
       Scanner sc=new Scanner(System.in);


       System.out.println("Digite o numero correspondente a operação");
       int operacao = sc.nextInt();
       if (operacao >8) {
           System.out.println("Operação inválida, Digite uma operação válida");
           return;
       }

       System.out.println("Digite um numero para o cálculo");
       double numero1 = sc.nextDouble();
        System.out.println("Digite um segundo numero para o cálculo");
       double numero2 = sc.nextDouble();

       if (operacao==1){
           System.out.println("O resultado dessa operação é: " +(numero1 + numero2));
       } else if (operacao==2) {
           System.out.println("O resultado dessa operação é: " +(numero1 - numero2));
       } else if (operacao==3) {
           System.out.println("O resultado dessa operação é: " +(numero1 * numero2));
       } else if (operacao==4) {
           System.out.println("O resultado dessa operação é: " +(numero1 / numero2));
       } else if (operacao==5) {
           System.out.println("O resultado dessa operação é: " +(numero1 % numero2));
       } else if (operacao==6) {
           System.out.println("O resultado dessa operação é: " +(numero1*numero2)/100);
       } else if (operacao==7) {
           System.out.println("O resultado dessa operação é: " +(numero1+(numero1*numero2)/100));
       } else if (operacao==8) {
           System.out.println("O resultado dessa operação é: " +(numero1-(numero1*numero2)/100));
       }
    }
}
