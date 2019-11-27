
public class TestaFabrica {

	public static void main(String[] args) {
		
		FabricaCarros carros =  new FabricaCarros();
		
		Carros meuCarro = carros.criarVeiculoCorrespondente("fiat");
		meuCarro.criarCarro();
		Carros meuCarro2 = carros.criarVeiculoCorrespondente("ford");
		meuCarro2 .criarCarro();
		Carros meuCarro3 = carros.criarVeiculoCorrespondente("Volkswagem");
		meuCarro3 .criarCarro();
		Carros meuCarro4 = carros.criarVeiculoCorrespondente("chevrollet");
		meuCarro4 .criarCarro();
	}

}
