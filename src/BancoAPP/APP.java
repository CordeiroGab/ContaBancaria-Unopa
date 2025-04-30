package BancoAPP;

import ContaBancaria.ContaBancaria;
import Usuario.Usuario;

import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        Usuario usuario = new Usuario(nome, sobrenome, cpf);
        ContaBancaria conta = new ContaBancaria();

        int opcao;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema. Até logo, " + usuario.getNomeCompleto() + "!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
