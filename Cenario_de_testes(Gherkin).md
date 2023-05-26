* Cenário: Fechar a modal ao clicar fora da mesma

	Dado (given) que a modal esteja sendo exibida
	Quando (when) for realizado um clique fora da modal
	Entao (then) a janela modal deve ser fechada


* Cenário: fechar modal ao clicar no icone fechar

	Dado (given) que a modal esteja sendo exibida
	Quando (when) for realizado um clice no icone fechar modal
	Entao (then) a janela modal deve ser fechada


* Cenário: Link Create New Account

	Dado (given) que a modal esteja sendo exibida
	Quando (when) for realizado um clique no link Create New Account
	Entao (then) a pagina Create New Account deve ser exibida


* Cenário: Realizar login com totos os campos
	
	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|chronos|
		|password	|senha	|
		|remember	|true	|
	Quando for realizado o clique no botao sign in
	Entao deve ser possivel logar no sistema


* Cenário: Realizar login com campos obrigatorios

	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|chronos|
		|password	|senha	|
		|remember	|false	|
	e for realizado o clique no botao sign in
	Entao deve ser possivel logar no sistema


* Cenário: Reqlizar login com usuario invalido
	
	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|invalido	|
		|password	|senha		|
		|remember	|false		|
	Quando for realizado o clique no botao sign in
	Entao o sistema devera exibir uma mensagem de erro


* Cenário: Reqlizar login com senha invalido
	
	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|chronos	|
		|password	|invalido	|
		|remember	|false		|
	Quando for realizado o clique no botao sign in
	Entao o sistema devera exibir uma mensagem de erro


* Cenário: Realizar login com usuario em branco

	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|		|
		|password	|senha	|
		|remember	|false	|
	Entao o botao sign in deve permancecer desabilitado


* Cenário: Realizar login com senha em branco

	Dado que a modal esteja sendo exibida
	Quando os campos forem preenchidos da seguinte forma
		|login		|chronos	|
		|password	|     		|
		|remember	|false		|
	Entao o botao sign in deve permancecer desabilitado
