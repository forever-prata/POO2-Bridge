package bridgeControle;

public class Main {

	public static void main(String[] args) {
		
		
		ControleRemoto controleTelevisao = new ControleRemotoComDispositivo(new Televisao());
		ControleRemoto controleArCondicionado = new ControleRemotoComDispositivo(new ArCondicionado());

		controleTelevisao.ligar();
		controleTelevisao.aumentarVolume();

		controleArCondicionado.ligar();
		controleArCondicionado.aumentarVolume();

	}

}
