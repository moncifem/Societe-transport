import java.util.List;

public class CargaisonRoutiEre extends Cargaison {
	
	
	public CargaisonRoutiEre(String reference, double distance, List<Marchandise> marchandises) {
		super(reference, distance, marchandises);
		this.reference=reference;
	}
	
	
	
	@Override
	public double calculCout() {
		double cout=0;
		for(int i=0;i<this.marchandises.size();i++) {
			double v=0;
			if(marchandises.get(i).getVolume()<380000) {
				cout+=4*this.distance*marchandises.get(i).getPoids();
			}else {
				cout+=6*this.distance*marchandises.get(i).getPoids();
			}
		}
		return cout;
	}



	@Override
	public double coutTotal() {
		return  this.calculCout();
	}

}
