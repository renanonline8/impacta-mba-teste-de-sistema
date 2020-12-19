#language: pt
  Funcionalidade: CRUD Processos
    Cenario: Cadastrar novo processo
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
      Quando em processo clicar em Salvar
      Então na tela de confimação deveria retornar mensagem "Processo foi criado com sucesso."