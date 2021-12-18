import java.util.List;

public class CargaisonAérienne extends Cargaison {
	public CargaisonAérienne(String reference, double distance, List<Marchandise> marchandises) {
		super(reference, distance, marchandises);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculCout() {
		double cout=0;
		for(int i=0;i<this.marchandises.size();i++) {
			double v=0;
			if(marchandises.get(i).getVolume()<80000) {
				cout+=10*this.distance*marchandises.get(i).getPoids();
			}else {
				cout+=12*this.distance*marchandises.get(i).getPoids();
			}
		}
		return cout;
	}
	@Override
	public double coutTotal() {
		return  this.calculCout();
	}

}
