package bridgeControle;

public class Televisao implements ControleRemoto {
	
	  @Override
	  public void ligar() {
	      System.out.println("Televis�o ligada");
	  }

	  @Override
	  public void desligar() {
	      System.out.println("Televis�o desligada");
	  }

	  @Override
	  public void aumentarVolume() {
	      System.out.println("Volume da televis�o aumentado");
	  }

	  @Override
	  public void diminuirVolume() {
	      System.out.println("Volume da televis�o diminu�do");
	  }
	}
