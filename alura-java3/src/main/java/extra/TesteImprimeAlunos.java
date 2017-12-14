package extra;

class Aluno{
	private String nome;	
	private int idade;	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
}
public class TesteImprimeAlunos {
	public void imprime(Aluno... alunos) {
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Imprimindo Alunos passando varios objetos como argumento");
		new TesteImprimeAlunos().imprime(new Aluno("Joao",33),new Aluno("Jose",44));
		System.out.println("Imprimindo Alunos passando Array de Objetos como argumento para o mesmo metodo");
		Aluno[] alunos = {new Aluno("Maria",33),new Aluno("Marcia",44)};
		
		new TesteImprimeAlunos().imprime(alunos);
	}
}
