package bridgeTela;

public abstract class Navegador {
    protected Tela Tela;

    public Navegador(Tela tela) {
        this.Tela = tela;
    }

    public abstract void abrirNavegador();
}
