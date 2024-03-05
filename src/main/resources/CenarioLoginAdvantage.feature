#language: pt
@tag
Funcionalidade: login no site advantage

  @tag1
  Cenario: logar com sucesso
    Dado que eu esteja no site "https://www.advantageonlineshopping.com/#/"
    Quando clicar para logar 
    E clicar em cria nova conta
    E preencher cadastro e clicar para registrar 
    E clicar no icone de login e clicar em minha conta
    E clicar para deletar conta 
    Então clicar sim (yes) deletará a conta
    
