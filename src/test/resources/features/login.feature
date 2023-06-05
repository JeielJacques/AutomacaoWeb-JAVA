#language:pt


@login
Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  @fecharModal
  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada

  @fecharModalIcone
  Cenario: fechar modal ao clicar no icone fechar
    Quando for realizado um clice no icone fechar modal
    Entao a janela modal deve ser fechada

  @CreateNewAccount
  Cenario: Link Create New Account
    Quando for realizado um clique no link Create New Account
    Entao a pagina Create New Account deve ser exibida

  @loginComSucesso
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>    |
      | senha   | <password> |
      | flag    | <remember> |
    E for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | login       | password | remember |
      | campos obrigatorios | Teste_Jeiel | Teste123 | false    |
      | todos os campos     | Teste_Jeiel | Teste123 | true     |

  @loginInvalido
  Esquema do Cenario: Reqlizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>      |
      | senha   | <password>   |
      | flag    | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login       | password | remember |
      | usuario invalido | invalido    | Teste123 | false    |
      | senha invalida   | Teste_Jeiel | invalida | false    |

  @dadosEmBranco
  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>    |
      | senha   | <password> |
      | flag    | <remember> |
    Entao o botao sign in deve permancecer desabilitado

    Exemplos:
      | identificacao     | login       | password | remember |
      | usuario em branco |             | Teste123 | false    |
      | senha em branco   | Teste_Jeiel |          | false    |
