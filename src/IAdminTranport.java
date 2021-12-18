import java.util.List;

public interface IAdminTranport {
	public Cargaison consulterCargaison(String ref);
	public Marchandise consulterMarchandise(String num);
	public String lireFichierCargaisons();
	public List<Cargaison> consulterCargaisons();
	public void addCarg(Cargaison c);
	public void addMarch(String c,Marchandise m);
	public void addCargToFile(Cargaison m);
	public void removeCargaison(String c);
}
