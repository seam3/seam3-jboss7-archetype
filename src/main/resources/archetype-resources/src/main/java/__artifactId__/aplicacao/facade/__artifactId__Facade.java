#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.aplicacao.facade;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.seam.remoting.annotations.WebRemote;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.__artifactId__.aplicacao.servicos.PessoaAS;

@Named(value="__artifactId__Facade")
public class __artifactId__Facade implements Serializable {

	private static final long serialVersionUID = 95438074873529936L;

	@Inject PessoaAS pessoaAS;
	
	public void adicionarPessoa(String nome) throws Exception{
		pessoaAS.criaConta(nome);
	}
	
	public List<Pessoa> listar() {
		return pessoaAS.listar();
	}
	
	@WebRemote
	public void metodoJavascript(){
		System.out.println("Chamando via Javascript");
	}
	
}

