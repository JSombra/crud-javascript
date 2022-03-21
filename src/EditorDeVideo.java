public class EditorDeVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("Método BonificaçãoEditor de Vídeo");
        return super.getBonificacao() + 100;
    }
}
