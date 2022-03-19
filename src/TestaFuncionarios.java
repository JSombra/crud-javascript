public class TestaFuncionarios {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setCpf("111.222.333.44");
        f1.setNome("Jefferson");
        f1.setSalario(4000);

        Gerente g1 = new Gerente();

        g1.setCpf("111.444.555.22");
        g1.setNome("Raquel");
        g1.setSalario(7000);

        boolean autentica = g1.autentica(1234);

        System.out.println(autentica);
        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(g1.getBonificacao());
        System.out.println(f1.getBonificacao());
    }
}
