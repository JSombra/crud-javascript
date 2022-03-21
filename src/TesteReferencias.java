public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente();
        Funcionario funcionario1 = new Funcionario();
        Funcionario editorDeVideo1 = new EditorDeVideo();

        gerente1.setSalario(5000.0);
        funcionario1.setSalario(2000.0);
        editorDeVideo1.setSalario(2500.0);

        ControleBonificacao control = new ControleBonificacao();
        control.registra(gerente1);
        control.registra(funcionario1);
        control.registra(editorDeVideo1);
        System.out.println(control.getSoma());
    }
}
