package util;

import model.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("Telefone está ligando para : " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Telefone atendeu");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Telefone iniciou correio de voz");
	}

}
