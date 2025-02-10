package application;

import devices.iPhone;
import model.AparelhoTelefonico;
import model.NavegadorInternet;
import model.ReprodutorMusical;
import util.Safari;
import util.Spotify;
import util.Telefone;

public class Program {

	public static void main(String[] args) {
	
		ReprodutorMusical reprodutorMusical = new Spotify();
		NavegadorInternet navegadorInternet = new Safari();
		AparelhoTelefonico aparelhoTelefonico = new Telefone();
		iPhone meuIphone = new iPhone(reprodutorMusical, aparelhoTelefonico, navegadorInternet);
		
		//Teste do reprodutor de musica
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println("\n ------");

        //Teste do aparelho telefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println("\n ------");

        //Teste do navegador de internet
        meuIphone.exibirPagina("https://www.dio.me");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
		System.out.println("\n ------");
		
	}

}
