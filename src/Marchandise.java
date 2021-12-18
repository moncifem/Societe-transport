
public class Marchandise {
	private String numero;
	private double poids,volume;
	
	public Marchandise(String numero,double poids,double volume) {
		this.numero=numero;
		this.poids=poids;
		this.volume=volume;
	}

	public String getNumero() {
		return numero;
	}

	public double getPoids() {
		return poids;
	}

	public double getVolume() {
		return volume;
	}

	
}
