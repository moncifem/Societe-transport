import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocieteTransport implements IClientTransport{
	HashMap<String,Cargaison> cargaisons;
	@Override
	public Cargaison consulterCargaison(String ref) {
		Cargaison c=null;
		if(cargaisons.containsKey(ref)) {
			c=cargaisons.get(ref);
		}
		return null;
	}
	@Override
	public Marchandise consulterMarchandise(String num) {
		Marchandise m=null;
		for(Cargaison elm:cargaisons.values()) {
			if(m!=null) {
				break;
			}
			for(Marchandise elm2:elm.getAllMarchandise()) {
				if(elm2.getNumero().equals(num)) {
					m=elm.getMarchandise(num);
					break;
				}
			}
		}
		return m;
	}
	@Override
	public String lireFichierCargaisons() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Cargaison> consulterCargaisons() {
		List<Cargaison> m=new ArrayList<>();
		for(Cargaison elm:cargaisons.values()){
			m.add(cargaisons.get(elm));
		}
		return m;
	}
	
	class admin extends SocieteTransport implements IAdminTranport{
		@Override
		public void addCarg(Cargaison c) {
			cargaisons.put(c.getReference(), c);
		}
		@Override
		public void addMarch(String c, Marchandise m) {
			cargaisons.get(c).addMarchandise(m);
		}
		@Override
		public void addCargToFile(Cargaison m) {
			// TODO Auto-generated method stub
		}
		@Override
		public void removeCargaison(String c) {
			cargaisons.remove(c);	
		}
	}
}
