package br.edu.alura.dp.aula4.decorator;

public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }
    
    public ISS() {
	}

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);//calculoDoOutroImposto que está na classe pai Imposto
    }

}
