package util;

import model.ReprodutorMusical;

public class Spotify implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Spotify está tocando música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Spotify pausou a música...");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Spotify selecionou a música : " + musica);
	}

}
