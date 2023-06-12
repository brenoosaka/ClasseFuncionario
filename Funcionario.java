public class Funcionario {
    private String nome;
    private double salário;

    public Funcionario(String nome, double salário) {
        this.nome = nome;
        this.salário = salário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salário * (porcentualDeAumento / 100);
        salário += aumento;
    }

}