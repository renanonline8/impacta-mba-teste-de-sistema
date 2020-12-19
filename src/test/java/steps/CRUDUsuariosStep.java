package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import jdk.jfr.internal.PlatformRecording;
import pages.Home;
import pages.ListarUsuario;
import pages.MenuLateral;
import pages.NovoUsuario;
import support.BaseSteps;

import javax.xml.ws.Action;

public class CRUDUsuariosStep extends BaseSteps {
    private static Home home = new Home(driver);
    private static MenuLateral menuLateral = new MenuLateral(driver);
    private static ListarUsuario listarUsuario = new ListarUsuario(driver);
    private static NovoUsuario novoUsuario = new NovoUsuario(driver);

    @Dado("^que estou na página principal$")
    public void queEstouNaPaginaPrincipal() {
        home.open();
    }

    @E("^clicou em usuários no menu lateral$")
    public void clicouEmUsuariosNoMenuLateral() {
        menuLateral.clickUsuarios();
    }

    @E("^clicou em Novo Usuário$")
    public void clicouEmNovoUsuario() { listarUsuario.clicaNovoUsuario(); }

    @Quando("^clicar em Salvar$")
    public void clicarEmSalvar() {

    }

    @Então("^deveria retornar mensagem \"([^\"]*)\"$")
    public void deveriaRetornarMensagem(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @E("^preencher campo \"([^\"]*)\" com valor \"([^\"]*)\"$")
    public void preencherCampoComValor(String campo, String valor) throws Throwable {
        novoUsuario.input(campo, valor);
    }
}
