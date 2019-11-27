
public class FabricaCarros {
	
	public Carros criarVeiculoCorrespondente(String carro) {
		 if (carro == null || carro == "" ) {
			 return null;
		 }
		 if(carro.toUpperCase().equals("FIAT")) {
			 return new Fiat();
		 }
		 else if(carro.toUpperCase().equals("VOLKSWAGEM")){
			 return new Volkswagem();
		 }
		 else if(carro.toUpperCase().equals("FORD")){
			 return new Ford();
		 }
		 else if(carro.toUpperCase().equals("CHEVROLLET")) {
			 return new Chevrollet();
		 }
	
		return null;
		
		
	
	}
}
