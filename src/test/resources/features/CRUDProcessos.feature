#language: pt
  Funcionalidade: CRUD Processos
    Cenario de Fundo:
      Dado que estou na página principal
      E clicou em processos no menu lateral
      E clicou em Novo Processo
      E em processo preencher campo "processo_vara" com valor "TJ SP"
      E em processo preencher campo "processo_numero_processo" com valor "123456"
      E em processo preencher campo "processo_natureza" com valor "Civil"
      E em processo preencher campo "processo_partes" com valor "Renan X Isaias"
      E em processo preencher campo "processo_assistente_social" com valor "Maria Santa"
      E em processo preencher campo "processo_data_entrada" com valor "18/12/2018"
      E em processo preencher campo "processo_data_saida" com valor "18/12/2020"
      E em processo preencher campo "processo_data_agendamento" com valor "10/11/2020"
      E em processo preencher campo "processo_status" com valor "Finalizado"
      E em processo preencher campo "processo_observacao" com valor "Ola mundo"
      E radio button "Arbitramento" selecionar "Não"
      E combobox "Urgente" selecionar "Sim"

    @run
    Cenario: Cadastrar novo processo
      Quando em processo clicar em Salvar
      Então na tela de confirmação deveria retornar mensagem "Processo foi criado com sucesso."

    @run
    Cenario: Ler um processo cadastrado
      Quando em processo clicar em Salvar
      E obter o código do processo
      E clicar em Voltar na tela do processo
      E clicar no botão mostrar na linha do registro do processo
      Então na tela do processo o código deveria ser do registro cadastrado
      E o campo "vara" deveria ser  "TJ SP"

    @run
    Cenario: Atualização de um processo cadastrado
      Quando em processo clicar em Salvar
      E obter o código do processo
      E clicar em Voltar na tela do processo
      E clicar no botão Editar na linha do registro do processo
      E em processo preencher campo "processo_numero_processo" com valor "654321"
      E em processo clicar em Salvar
      Então na tela de confirmação deveria retornar mensagem "Processo atualizado com sucesso."

    @run
    Cenario: Remoção de processo cadastrado
      Quando em processo clicar em Salvar
      E obter o código do processo
      E clicar em Voltar na tela do processo
      E clicar no botão Apagar na tela na linha do registro do processo
      E confirmar a remoção do processo
      Então o processo não deveria aparecer na lista de registros do processo

    @run
    Esquema do Cenario: Atualização de um processo cadastrado
      Quando em processo clicar em Salvar
      E obter o código do processo
      E clicar em Voltar na tela do processo
      E clicar no botão Editar na linha do registro do processo
      E em processo preencher campo "processo_numero_processo" com valor "<processo_numero_processo>"
      E em processo preencher campo "processo_natureza" com valor "<processo_natureza>"
      E em processo clicar em Salvar
      Então na tela de confirmação deveria retornar mensagem "Processo atualizado com sucesso."
      Exemplos:
        | processo_numero_processo  | processo_natureza |
        | 14567                     | trabalhista       |
        | 17654                     | civil             |