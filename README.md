**Curso Automação Web**

* First commit - TDD (24/05/2023)

  Introdução ao método TDD, Criação do script para testar o código e após isso, criação do código para cálculo das 
  médias

* Selenium, anotações e seletores (24/05/2023)

  Configurações básicas do navegador,tais como, abrir, direcionar URL,maximizar e fechar(close e quit).Teste simples para 
  abir pagina web e verificar se está aberta corretamente, fazendo a validação utilizando texto(string) da 
  página. Para fazer a validação do texto foi utilizado o seletor xpath

* Pages, estrutura, refactor e pagefectory (25/05/2023)

  Organização do código em pacotes, isolando configurações do navegador, elementos/ações da página e execução dos 
  testes em si

* Cenário de testes (26/05/2023)

  Foi adicionado documento com cenários de testes, escrito em gherkin, esses cenários servirão de exemplo parar 
  futuras automações no decorrer do curso

* Cucumber (27/05/2023)
  
  Utilizando o cenário de testes proposto, foi adicinonado o pacote ressources/features aonde foi criado o arquivo 
  login.feature, nesse arquivo serão criadas as funcionalidades relacionada a tela de login, utilizaremos o cucumber 
  para desenvolver o cenario de teste, apos finalizar a configuracao do arquivo login.feature iremos criar os metodos 
  para cada passo criado.

* Maps e Pages (29/05/2023)

  Apos a criacao dos metodos, iremos criar os elementos mapeando a tela de loguin e desse mapeamento faremos as ações, 
  como, clicar em determinado local, inserir texto entre outras ações

* Enum, maps e correcoes de erros (30/05/2023)
  
  Foi criado Enum para que seja usado apenas os navegadores pre configurados, sem correr riscos de digitação errada e etc,
  tambem foi criado novo map e page para validacao de outras paginas no decorrer do teste e corrigido alguns erros ao executar
  os testes
  