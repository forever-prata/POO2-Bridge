package bridgeTela;

public class NavegadorFirefox extends Navegador {

	public NavegadorFirefox(Tela tela) {
		super(tela);
	}

	@Override
	public void abrirNavegador() {
        System.out.println("Abrindo navegador FireFox");
        Tela.configurarTamanho();
        System.out.println("--------------------------");
	}

}
