public class TestaFuncionarios {
    public static void main(String[] args) {
        Autenticavel referencia = new Gerente();

        referencia.setSenha(2222);

        boolean autenticou = referencia.autentica(2222);
        System.out.println(autenticou);
    }
}
