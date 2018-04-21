public class app {

    public static void main(String[] args) {

        Funcionario func1 = new Vendedor("zé","1050",2500);
        Funcionario func2 = new Gerente("Joao","1051",3000);
        Funcionario func3 = new Vendedor("Mario", "1052",1500);

        ((Vendedor) func1).setTotalVendas(1500);
        ((Vendedor) func3).setTotalVendas(2500);
        ((Gerente) func2).setBonus(500);

        System.out.println(func2.getSalarioBruto());
        System.out.println(func2.getSalarioLiquido());



        Cadastro c1 = new Cadastro();
        c1.inclui(func1);
        c1.inclui(func2);
        c1.inclui(func3);

        c1.ordenaNome();
        System.out.println(c1.geraRelatorio());
        c1.ordenaCodigo();
        System.out.println(c1.geraRelatorio());
    }
}
