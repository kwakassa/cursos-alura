package br.edu.alura.dp.aula3.tmethod;

import java.util.List;

public abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public final void imprime(List<Conta> contas) {//final evita que os filhos alterem a implementação desse metodo
      cabecalho();
      corpo(contas);
      rodape();
    }
  }
