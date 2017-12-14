package br.edu.alura.java1.aula3;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if(this.validaData(dia, mes, ano)){
			this.ano = ano;
			this.mes = mes;
			this.dia = dia;
		}
		
	}
	
	private boolean validaData(int dia, int mes, int ano){
		if(ano>0){//Verifica se ano ew positivo
			if(dia > 0 && dia < 31){//Valida intervalo de dias
				if(mes >= 1 && mes <= 12){//Valida Intervalo de mes
					if(mes==2){//Verifica se ew fevereiro
						if(verificaAnoBissexto()){//Verifica se ew ano bissexto
							if(dia <= 29){
								return true;
							}
						}else{
							if(dia <= 28){
								return true;
							}
						}
					}else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
						//Meses com 31 dias
						if(dia <= 31){
							return true;
						}
					}else{
						//Restante dos meses tem 30 dias
						if(dia<=30){
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private boolean verificaAnoBissexto(){
		//1a Regra: Se divisivel por 4
		//2a regra: Nao divisivel por 100		
		if(this.ano % 4 != 0){
			if(this.ano % 100 != 0){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public String getFormatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
	
	
	
}
