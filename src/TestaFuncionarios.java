public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();

        f1.setSalario(1000);
        f1.setNome("Jefferson");
        f1.setCpf("111.222.333.44");

        g1.setNome("Raquel");
        g1.setSalario(5000);
        g1.setCpf("111.555.444.55");

        boolean autenticaLogin = g1.autentica(1234, "Jefferson");

        System.out.println(autenticaLogin);
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(g1.getBonificacao());
        System.out.println(f1.getBonificacao());
    }
}
