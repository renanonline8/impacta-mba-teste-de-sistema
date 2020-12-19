package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
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

    @Então("^na tela de confimação deveria retornar mensagem \"([^\"]*)\"$")
    public void naTelaDeConfimacaoDeveriaRetornarMensagem(String message) {
        processoRegistro.checkMessage(message);
    }
}
