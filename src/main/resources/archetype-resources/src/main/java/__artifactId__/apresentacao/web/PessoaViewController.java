#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.apresentacao.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.solder.logging.Logger;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.__artifactId__.aplicacao.facade.__artifactId__Facade;



@Named("pessoaViewController")
@ViewScoped
public class PessoaViewController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5691014063631167292L;

	@Inject
	FacesContext facesContext;

	@Inject
	Flash flash;

	@Inject
	HttpServletRequest request;

	@Inject
	HttpServletResponse response;
	
	@Inject __artifactId__Facade __artifactId__Facade;

	@Inject Logger logger;
	
	
	private String nome;

	public List<Pessoa> listar() {
		return __artifactId__Facade.listar();
	}
	
	public String inserePessoa() throws Exception {
		try{
			__artifactId__Facade.adicionarPessoa(nome);
			logger.info("Pessoa inserida corretamente!");
			return "sucesso";
		}catch (Exception e){
			logger.info("Falha ocorrida!");
			throw e;
			//return "falha";
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
