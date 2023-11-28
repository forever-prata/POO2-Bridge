package bridgeTela;

public class NavegadorChrome extends Navegador {

	public NavegadorChrome(Tela tela) {
		super(tela);
	}

	@Override
	public void abrirNavegador() {
        System.out.println("Abrindo navegador Chrome");
        Tela.configurarTamanho();
        System.out.println("--------------------------");
	}

}
