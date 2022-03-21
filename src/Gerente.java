public class Gerente extends Funcionario{

    private int senha;
    private String login;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public boolean autentica(int senha) {return this.senha == senha;}

    public boolean autentica(int senha, String login){
        return this.senha == senha && this.login.equals(login);
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificação do Gerente");
        return super.getSalario() + super.getBonificacao();
    }
}