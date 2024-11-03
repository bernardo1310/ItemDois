
public class VHS extends Midia{
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "VHS [titulo=" + titulo + "]";
	}
}
