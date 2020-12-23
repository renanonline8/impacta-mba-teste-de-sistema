package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.MenuLateral;
import pages.ProcessoCadastro;
import pages.ProcessoLista;
import pages.ProcessoRegistro;
import support.BaseSteps;

public class CRUDProcessosStep extends BaseSteps {
    private static MenuLateral menuLateral = new MenuLateral(driver);
    private static ProcessoLista processoLista = new ProcessoLista(driver);
    private static ProcessoCadastro processoCadastro = new ProcessoCadastro(driver);
    private static ProcessoRegistro processoRegistro =  new ProcessoRegistro(driver);

    @E("^clicou em processos no menu lateral$")
    public void clicouEmProcessosNoMenuLateral() {
        menuLateral.clicouProcesso();
    }

    @E("^clicou em Novo Processo$")
    public void clicouEmNovoProcesso() {
        processoLista.clicouNovoProcesso();
    }

    @E("^em processo preencher campo \"([^\"]*)\" com valor \"([^\"]*)\"$")
    public void emProcessoPreencherCampoComValor(String campo, String valor) {
        processoCadastro.inputText(campo, valor);
    }

    @E("^radio button \"([^\"]*)\" selecionar \"([^\"]*)\"$")
    public void radioButtonSelecionar(String campo, String valor) throws Exception {
        processoCadastro.setRadioButton(campo, valor);
    }

    @E("^combobox \"([^\"]*)\" selecionar \"([^\"]*)\"$")
    public void comboboxSelecionar(String campo, String valor) throws Exception {
        processoCadastro.setCombobox(campo, valor);
    }

    @Quando("^em processo clicar em Salvar$")
    public void emProcessoClicarEmSalvar() {
        processoCadastro.clicarSalvar();
    }

    @Então("^na tela de confirmação deveria retornar mensagem \"([^\"]*)\"$")
    public void naTelaDeConfimacaoDeveriaRetornarMensagem(String message) {
        processoRegistro.checkMessage(message);
    }

    @E("^obter o código do processo$")
    public void obterOCodigoDoProcesso() {
        processoRegistro.setNumeroProcesso();
    }

    @E("^clicar em Voltar na tela do processo$")
    public void clicarEmVoltarNaTelaDoProcesso() {
        processoRegistro.clicarVoltar();
    }

    @E("^clicar no botão mostrar na linha do registro do processo$")
    public void clicarNoBotaoMostrarNaLinhaDoRegistroDoProcesso() {
        processoLista.abrirProcesso(
                processoRegistro.getNumeroProcesso()
        );
    }

    @Então("^na tela do processo o código deveria ser do registro cadastrado$")
    public void naTelaDoProcessoOCodigoDeveriaSerDoRegistroCadastrado() {
        String expected = processoRegistro.getNumeroProcesso();
        String actual = processoRegistro.obterCodigoProcesso();
        Assert.assertEquals(expected, actual);
    }

    @E("^o campo \"([^\"]*)\" deveria ser  \"([^\"]*)\"$")
    public void oCampoDeveriaSer(String campo, String valor) {
        processoRegistro.checkField(campo, valor);
    }

    @E("^clicar no botão Editar na linha do registro do processo$")
    public void clicarNoBotaoEditarNaLinhaDoRegistroDoProcesso() {
        processoLista.editarProcesso(
                processoRegistro.getNumeroProcesso()
        );
    }

    @E("^clicar no botão Apagar na tela na linha do registro do processo$")
    public void clicarNoBotaoApagarNaTelaNaLinhaDoRegistroDoProcesso() {
        processoLista.apagarProcesso(
                processoRegistro.getNumeroProcesso()
        );
    }

    @E("^confirmar a remoção do processo$")
    public void confirmarARemocaooDoProcesso() {
        processoLista.confirmarRemocaoProcesso();
    }

    @Então("^o processo não deveria aparecer na lista de registros do processo$")
    public void oProcessoNaoDeveriaAparecerNaListaDeRegistrosDoProcesso() {
        processoLista.verifyRegistryNotExist(
                processoRegistro.getNumeroProcesso()
        );
    }
}
