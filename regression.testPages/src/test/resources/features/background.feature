
@background
Feature: Aprendendo background
	 Como aluno
   Quero aprender background
   Para automatizar testes
   
   Background: Acessar tela de login
    Given que esteja na tela de login
   
		   @positivo @smoke @kay
		   Scenario: Login valido
		  	And informo o usuario "standard_user"
		  	And informo a senha "secret_sauce"
		  	When clicar no botao login
		  	Then login realizado com sucesso
		   
		   @negativo
		   Scenario: Login invalido
		    But informo o usuario invalido "user_nao_existe"
		  	But informo a senha invalida "sauce"
		  	When clicar no botao login
		  	Then login nao realizado
		    
		    @negativo @smoke
		   Scenario: Login usuario bloqueado
		    But informo o usuario invalido "locked_out_user"
		  	And informo a senha valida "secret_sauce"
		  	When clicar no botao login
		  	Then login mensagem de usuario bloqueado