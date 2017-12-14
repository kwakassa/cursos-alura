package aula1.br.com.empresa.banco.produto;

import aula1.br.com.empresa.banco.conta.Tributavel;

public class SeguroDeVida implements Tributavel {
    public double calculaTributos() {
        return 42;
    }
}