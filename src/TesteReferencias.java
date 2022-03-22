public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente();
        Funcionario editorDeVideo1 = new EditorDeVideo();
        Funcionario designer = new Designer();

        gerente1.setSalario(5000.0);
        editorDeVideo1.setSalario(2500.0);
        designer.setSalario(1000);


        ControleBonificacao control = new ControleBonificacao();
        control.registra(gerente1);
        control.registra(editorDeVideo1);
        control.registra(designer);
        System.out.println(control.getSoma());
    }
}
