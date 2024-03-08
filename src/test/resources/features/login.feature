@login @regressivo 
Feature: login
Como usuario	
Quero informar dados 
Para realizar login 

Background: acessar tela de login 
Given que eu não esteja logado 

@postivo @smoke @rapido
Scenario: Login valido 

When preencho  campo nome 
And preencho a senha 
And clicar no botão login 
Then usuario logado 

@negativo
Scenario: login senha invalida

When preencho  campo nome  
And preencho senha errada 
And clicar no botão login
Then mensagem de erro


