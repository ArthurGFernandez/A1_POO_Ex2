package program;
import entities.Elevador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas;
        int andar;

        Elevador elevador = new Elevador();
        System.out.print("Qual a capacidade maxima de pessoas no elevador? ");
        int capPessoa = sc.nextInt();
        System.out.print("Qual o numero de andares? ");
        int capAndar = sc.nextInt();

        elevador.setCapacidadePessoas(capPessoa);
        elevador.setTotalAndar(capAndar);

        int opt;
        do{
            System.out.println("\nNúmero atual de pessoas no elevador: " + elevador.getPessoas() + " Andar atual: " + elevador.getAndar());
            System.out.println("1 -- Entrar");
            System.out.println("2 -- Sair");
            System.out.println("3 -- Subir Andar");
            System.out.println("4 -- Descer Andar");
            System.out.println("0 -- Finalizar");
            System.out.print("Digite a opção: ");

            opt = sc.nextInt();

            switch (opt){
                case 1:
                    try{
                        System.out.print("Digite número de pessoas que vai entrar: ");
                        pessoas = sc.nextInt();
                        elevador.entrar(pessoas);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Digite número de pessoas que vai sair: ");
                        pessoas = sc.nextInt();
                        elevador.sair(pessoas);
                    }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite número de andares que deseja subir: ");
                    andar = sc.nextInt();
                    elevador.subirAndar(andar);
                    break;
                case 4:
                    System.out.print("Digite número de andares que deseja descer: ");
                    andar = sc.nextInt();
                    elevador.descerAndar(andar);
                    break;
                case 0:
                    opt = 0;
                    break;
            }

        }while(opt != 0);
    }
}