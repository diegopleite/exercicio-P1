public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String n, String c, double s){
        super(n,c,s);
    }
    public Gerente(String n, String c, double s, double bonus){
        super(n,c,s);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    @Override
    public double getSalarioBruto() {
        return super.getSalarioBruto() + bonus;
    }
    @Override
    public double getSalarioLiquido() {

        double novoSalBruto = super.getSalarioBruto() + bonus;
        double inss = novoSalBruto * 0.10;
        double irpf = 0;
        super.setSalarioBruto(novoSalBruto);

        if(novoSalBruto > 2500){
            irpf = getSalarioBruto() * 0.07;
        }
        double salarioLiquido = super.getSalarioBruto() - inss - irpf;
        return salarioLiquido;
    }

    @Override
    public String toString(){
        return super.toString() + "- Bonus: R$" + bonus + "\n";
    }
}
