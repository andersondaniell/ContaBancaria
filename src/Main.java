import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        Conta conta = new Conta();

        System.out.println("Seja Bem-Vindo " + usuario.nome + ", qual operação deseja realizar? \n");

        String[] operacoes = {"1-Sacar\n" + "2-Depositar\n" + "3-Verificar Saldo\n"};

        for (String operacao : operacoes) {
            System.out.println(operacao);
        }


        int transacao = scanner.nextInt();

        switch (transacao){
            case 1:{
                System.out.println("Realizando Saque...\n");
                System.out.println(usuario.RealizarSaque());
                break;
            }
            case 2:{
                System.out.println("Realizando Deposito");
                //System.out.println(conta.depositar());
                break;
            }
            case 3:{
                System.out.println("Verificando saldo...\n");
                System.out.println(conta.verificarSaldo());
                break;
            }

        }
    }
}
