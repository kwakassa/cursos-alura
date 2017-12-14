public class Empresa {
	
	private String nome;
	private String cnpj;
	private Funcionario[] listaFuncionarios = new Funcionario[3];
	private int qtdPreenchida = 0;
	
	public void adiciona(Funcionario funcionario){
		
		if (qtdPreenchida < listaFuncionarios.length){
			this.listaFuncionarios[qtdPreenchida] = funcionario;
			++qtdPreenchida;
		}
	}
	
	public void mostraEmpregados(){
		for(int i=0; i<this.listaFuncionarios.length; i++){
			System.out.println(this.listaFuncionarios[i].nome);
		}
	}
	
	public boolean contem(Funcionario funcionario){
		
		for (int i = 0; i < listaFuncionarios.length; i++) {
			if (funcionario.nome.equalsIgnoreCase(listaFuncionarios[i].nome))
				return true;
		}
		
		return false;
			
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCnpj(String string) {
		// TODO Auto-generated method stub
		
	}
}

class TestaEmpresa{
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Groselha S/A");
		empresa.setCnpj("12345678000101");
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Joao";
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome="Maria";
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		f3.nome="Pedro";
		empresa.adiciona(f3);
		
		empresa.mostraEmpregados();
		
				
		System.out.println(empresa.contem(f1));
		
			
		Funcionario f4 = new Funcionario();
		f4.nome = "Joao";
		
		System.out.println(empresa.contem(f4));
		
		System.out.println(f1);
		System.out.println(f4);
		
	}
}
