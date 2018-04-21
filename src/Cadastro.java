import java.util.ArrayList;
import java.util.Comparator;

public class Cadastro{

        ArrayList<Funcionario> func = new ArrayList<>();

    public void inclui(Funcionario f){
        func.add(f);
    }
    public boolean exclui(String codigo){
        for (Funcionario f: func) {
            if(f.getCodigo().equals(codigo)){
                func.remove(f);
                return true;
            }
        }
        return false;
    }
    public void ordenaNome(){
        func.sort(Comparator.comparing(Funcionario::getNome));
    }
    public void ordenaCodigo(){
        func.sort(Comparator.comparing(Funcionario::getCodigo));
    }
    public String geraRelatorio(){
        if (func.isEmpty()){
            return null;
        }
        return func.toString();
    }

}
