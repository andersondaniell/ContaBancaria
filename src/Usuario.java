public class Usuario {

    Conta contas = new Conta();

    String nome = "Anderson";
    int saldoUsuario = 10;

    int novoSaldoUsuario = contas.saldoConta + saldoUsuario;


    double RealizarSaque() {
        System.out.println("O valor sacado foi: " + novoSaldoUsuario);
        return 0;
    }
}
