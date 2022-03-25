public class TestaSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Administrador adm = new Administrador();
        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        Administrador adm2 = new Administrador();

        adm.setSenha(2221);
        adm.setSenha(2222);
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(adm);
        si.autentica(g);
        si.autentica(adm2);
        si.autentica(cliente);
    }
}
