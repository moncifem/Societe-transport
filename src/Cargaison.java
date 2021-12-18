import java.util.ArrayList;
import java.util.List;

public abstract class Cargaison {
	protected List<Marchandise> marchandises = null;
	protected String reference;
	protected double distance;
	
	public Cargaison(String reference,double distance,List<Marchandise> marchandises) {
		this.reference=reference;
		this.distance=distance;
		this.marchandises=marchandises;
	}
	
	public abstract double calculCout();
	public void addMarchandise(Marchandise m) {
		this.marchandises.add(m);
	}
	public void delMarchandise(String numero) {
		for(int i=0;i<marchandises.size();i++) {
			if(marchandises.get(i).getNumero().equals(numero)) {
				marchandises.remove(i);
			}
		}
	}
	public Marchandise getMarchandise(String numero) {
		Marchandise m=null;
		for(int i=0;i<marchandises.size();i++) {
			if(marchandises.get(i).getNumero().equals(numero)) {
				m=marchandises.get(i);
			}
		}
		return m;
	}
	public List<Marchandise> getAllMarchandise(){
		return this.marchandises;
	}
	public double volumeTotal() {
		double v=0;
		for(int i=0;i<marchandises.size();i++) {
				v+=marchandises.get(i).getVolume();
		
		}
		return v;
	}
	public double poidsTotal() {
		double p=0;
		for(int i=0;i<marchandises.size();i++) {
				p+=marchandises.get(i).getPoids();
		}
		return p;
	}
	public abstract double coutTotal();

	public List<Marchandise> getMarchandises() {
		return marchandises;
	}

	public String getReference() {
		return reference;
	}

	public double getDistance() {
		return distance;
	}
	
}
