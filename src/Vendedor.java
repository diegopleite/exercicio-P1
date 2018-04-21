public class Vendedor extends Funcionario{

    private double totalVendas;

    public Vendedor(String n, String c, double s){
        super(n,c,s);
    }
    public Vendedor(String n, String c, double s, double totalVendas){
        super(n,c,s);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {

        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public double getSalarioBruto() {
        double comissao = totalVendas * 0.05;
        return super.getSalarioBruto() + comissao;
    }

    @Override
    public double getSalarioLiquido() {
        double comissao = totalVendas * 0.05;
        double irpf = 0;
        double novoSalBruto = super.getSalarioBruto() + comissao;
        double inss = novoSalBruto * 0.10;
        super.setSalarioBruto(novoSalBruto);

        if(novoSalBruto > 2500) {
            irpf = super.getSalarioBruto() * 0.07;
            }
        double salarioLiquido = super.getSalarioBruto() - inss - irpf;
        return salarioLiquido;
    }

    @Override
    public String toString() {
        return super.toString() + "Total de Vendas: R$" +totalVendas+"\n";
    }
}

