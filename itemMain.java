
public class itemMain {
	public static void main(String[] args) {
		item it = new item();
		Livro lv = new Livro();
		Midia md = new Midia();
		CD cd = new CD();
		VHS vhs = new VHS();
		
		it.setCodigo(1245);
		it.setDescricao("babadsbv");
		System.out.println(it);
		
		lv.setAutor("Papetin");
		System.out.println(lv);
		
		cd.setFaixas(6);
		cd.setArtista("cleber bambam");
		cd.setAlbum("nomade");
		System.out.println(cd);
		
		md.setGravadora("Sony");
		md.setDuracao(53);
		System.out.println(md);
		
		vhs.setTitulo("Xadez");
		System.out.println(vhs);
	}
}
