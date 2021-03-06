package it.alfasoft.rossella;

import java.util.List;

public class Rubrica {
	
	private List<Voce> listaVoci;

	public Rubrica() {
		
	}

	public Rubrica(List<Voce> listaVoci) {
		
		this.listaVoci = listaVoci;
	}

	public List<Voce> getListaVoci() {
		return listaVoci;
	}

	public void setListaVoci(List<Voce> listaVoci) {
		this.listaVoci = listaVoci;
	}
	
	
	public Voce getVoceByName(String nome){
		Voce voce=null;
		for(Voce voceTemp : listaVoci){
			
			if( voceTemp.getNome().equals(nome)){
				voce=voceTemp;
			}	
		}
		return voce;
	}
	
	

}
