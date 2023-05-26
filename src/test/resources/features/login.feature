#language:pt

Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  Cenario: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Entao a janela modal deve ser fechada

  Cenario: fechar modal ao clicar no icone fechar
    Quando for realizado um clice no icone fechar modal
    Entao a janela modal deve ser fechada

  Cenario: Link Create New Account
    Quando for realizado um clique no link Create New Account
    Entao a pagina Create New Account deve ser exibida


  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>    |
      | senha   | <password> |
      | falg    | <remember> |
    E for realizado o clique no botao sign in
    Entao deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | login   | password | remember |
      | campos obrigatorios | chronos | senha    | false    |
      | todos os campos     | chronos | senha    | true     |

  Esquema do Cenario: Reqlizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>    |
      | senha   | <password> |
      | flag    | <remember> |
    Quando for realizado o clique no botao sign in
    Entao o sistema devera exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login    | password | remember |
      | usuario invalido | invalido | senha    | false    |
      | senha invalida   | chronos  | invalida | false    |


  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login seja preenchidos da seguinte forma
      | usuario | <login>    |
      | senha   | <password> |
      | flag    | <remember> |
    Entao o botao sign in deve permancecer desabilitado

    Exemplos:
      | identificacao     | login   | password | remember |
      | usuario em branco |         | senha    | false    |
      | senha em branco   | chronos |          | false    |
