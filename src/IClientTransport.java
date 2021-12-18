import java.util.List;

public interface IClientTransport {
	public Cargaison consulterCargaison(String ref);
	public Marchandise consulterMarchandise(String num);
	public String lireFichierCargaisons();
	public List<Cargaison> consulterCargaisons();
}
