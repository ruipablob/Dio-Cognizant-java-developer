public class Main {
    public static void main(String[] args){
        Cliente rui = new Cliente();
        rui.setNome("Rui");
        Conta cc = new ContaCorrente(rui);
        Conta popanca = new ContaPoupaca(rui);

        cc.depositar(100);
        cc.transferir(100, popanca);

        cc.imprimirExtrato();
        popanca.imprimirExtrato();
    }
}
