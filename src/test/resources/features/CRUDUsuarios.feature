#language: pt
  Funcionalidade: CRUD de Usuários
    Cenario: Cadastrar Novo Usuário
      Dado que estou na página principal
      E clicou em usuários no menu lateral
      E clicou em Novo Usuário
      E preencher campo "user_login" com valor "suportando"
      E preencher campo "user_full_name" com valor "Suportando App"
      E preencher campo "user_email" com valor "suportando@foo.com"
      E preencher campo "user_age" com valor "25"
      Quando clicar em Salvar
      Então deveria retornar mensagem "Usuário cadastrado com sucesso."