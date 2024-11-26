public class Question4 {
    public static void main(String[] args) {

        Banco banco = new Banco("O Banco");


        Conta conta1 = new Conta(1001, 500.0);
        Conta conta2 = new Conta(1002, 1500.0);
        Conta conta3 = new Conta(1003, 2000.0);

        banco.adicionaConta(conta1);
        banco.adicionaConta(conta2);
        banco.adicionaConta(conta3);

        Conta c = banco.recuperaConta(1002);
        if (c != null) {
            System.out.println("Conta encontrada: " + c);
        } else {
            System.out.println("Conta não encontrada.");
        }


        System.out.println(banco);
    }
}
