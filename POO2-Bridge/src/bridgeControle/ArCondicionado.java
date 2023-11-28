package bridgeControle;

public class ArCondicionado implements ControleRemoto {
	
	  @Override
	  public void ligar() {
	      System.out.println("Ar-condicionado ligado");
	  }

	  @Override
	  public void desligar() {
	      System.out.println("Ar-condicionado desligado");
	  }

	  @Override
	  public void aumentarVolume() {
	      System.out.println("Velocidade do ar-condicionado aumentada");
	  }

	  @Override
	  public void diminuirVolume() {
	      System.out.println("Velocidade do ar-condicionado diminuída");
	  }
	}
