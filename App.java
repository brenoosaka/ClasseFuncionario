public class App {
    public static void main(String[] args) {
        // teste
        Funcionario funcionário = new Funcionario("Harry", 2500.0);

        System.out.println("Nome do funcionário: " + funcionário.getNome());
        System.out.println("Salário do funcionário: " + funcionário.getSalário());

        funcionário.aumentarSalario(10.0);

        System.out.println("Salário atualizado do funcionário: " + funcionário.getSalário());
    }
}
