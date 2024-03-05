package Steps;

import Elementos.elementosTelaLogin;
import Metodos.metodosLoginPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;

public class teste {
	
	elementosTelaLogin e = new elementosTelaLogin();
	metodosLoginPage m = new metodosLoginPage();



	@Dado("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) throws InterruptedException {
	    m.abrirnavegador(string);
	    m.pausar(3000);
	    System.out.println("passou de abrir site");
	    
	}

	@Quando("clicar para logar")
	public void clicar_para_logar() throws InterruptedException {
		m.clicar(e.getBtnLogar());
		m.pausar(3000);
		System.out.println("passou de clique de logar");
		
	    
	}

	@Quando("preencher usuário e senha válidos")
	public void preencher_usuário_e_senha_válidos() throws InterruptedException {
		m.preencherTexto(e.getCpUsuario(), "testeturma18");
		m.pausar(3000);
		m.preencherTexto(e.getCpSenha(), "Fc12345");
		System.out.println("passou de preencher login e senha");
		
	    
	}

	@Então("deverá logar com sucesso")
	public void deverá_logar_com_sucesso() throws InterruptedException {
		m.pausar(3000);
		m.clicar(e.getBtnLogin());
		System.out.println("passou de clicar para logar");
		m.fecharnavegador();
		System.out.println("passou de preencher login e senha");
		
	        
	}
}
