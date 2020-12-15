package loja;

public class Testloja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vendedor v1 = new Vendedor("Jorge",32,53765137,7345354,1500);
    Vendedor v2 = new Vendedor("María",22,32233223,75234243,1600);
    Vendedor v3 = new Vendedor("OlindaEdgar",34,323765137,742432424,1200);
    Vendedor v4 = new Vendedor("Carmen",26,54564343,753445223,1900);
    Vendedor v5 = new Vendedor("Efrain",30,32423532,243532533,1100);

	v1.comissao(43, true);
	v1.calculaDesconto();
	v1.calculasalario();
	
	}

}
