package util;

import model.NavegadorInternet;

public class Safari implements NavegadorInternet{

	@Override
	public void atualizarPagina() {
		System.out.println("Safari atualizou a página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Safari adicionou nova aba");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Safari exibiu nova página : " + url);
	}

}
