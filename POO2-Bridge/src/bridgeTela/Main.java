package bridgeTela;

public class Main {
	public static void main(String[] args) {
		Tela celular = new TelaCelular();
        Tela tablet = new TelaTablet();
        Tela desktop = new TelaDesktop();

        Navegador nav1 = new NavegadorChrome(celular);
        Navegador nav2 = new NavegadorChrome(tablet);
        
        Navegador nav3 = new NavegadorFirefox(celular);
        Navegador nav4 = new NavegadorFirefox(tablet);
        Navegador nav5 = new NavegadorFirefox(desktop);
        
        nav1.abrirNavegador();
        nav2.abrirNavegador();
        nav3.abrirNavegador();
        nav4.abrirNavegador();
        nav5.abrirNavegador();
	}
}
