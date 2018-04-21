import java.util.*;

public abstract class Funcionario {
    private String nome;
    private String codigo;
    private double salario;

    public Funcionario(String nome, String codigo, double salario){
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract double getSalarioLiquido();

    public double getSalarioBruto() {
        return salario;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salario = salarioBruto;
    }
    @Override
    public String toString(){
        return ("Nome: " + nome + " - " + "Código: " +  codigo + " - " + "Salário: R$" + salario + " ");
    }
}
