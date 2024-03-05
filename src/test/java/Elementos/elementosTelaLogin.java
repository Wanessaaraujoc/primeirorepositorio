package Elementos;

import org.openqa.selenium.By;

public class elementosTelaLogin {

	
	
	private By btnLogar = By.id("menuUser");
	
	private By cpUsuario = By.name("username");
	
	private By cpSenha = By.name("password");
	
	private By btnLogin = By.id("sign_in_btn");

	public By getBtnLogar() {
		return btnLogar;
	}

	public By getCpUsuario() {
		return cpUsuario;
	}

	public By getCpSenha() {
		return cpSenha;
	}

	public By getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
}
