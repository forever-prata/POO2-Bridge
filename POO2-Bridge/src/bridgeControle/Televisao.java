package bridgeControle;

public class Televisao implements ControleRemoto {
	
	  @Override
	  public void ligar() {
	      System.out.println("Televisão ligada");
	  }

	  @Override
	  public void desligar() {
	      System.out.println("Televisão desligada");
	  }

	  @Override
	  public void aumentarVolume() {
	      System.out.println("Volume da televisão aumentado");
	  }

	  @Override
	  public void diminuirVolume() {
	      System.out.println("Volume da televisão diminuído");
	  }
	}
