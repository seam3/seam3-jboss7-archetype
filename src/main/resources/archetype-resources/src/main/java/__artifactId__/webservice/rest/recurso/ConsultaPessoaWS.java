#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.webservice.rest.recurso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import ${package}.TIPO_DOMINIO.dominio.modelo.Pessoa;
import ${package}.__artifactId__.aplicacao.facade.__artifactId__Facade;
import ${package}.__artifactId__.webservice.rest.info.PessoasInfo;

@Path("")
public class ConsultaPessoaWS {


	@Inject __artifactId__Facade __artifactId__Facade;
	
	@GET
	@Path("/pessoas")
	@Produces("application/json")
    public Response pojo() {
		List<PessoasInfo> p = new ArrayList<PessoasInfo>();
		List<Pessoa> pessoas = __artifactId__Facade.listar();
		
		
		for (Pessoa pessoa : pessoas) {
			PessoasInfo pi = new PessoasInfo();
			pi.setNome(pessoa.getName());
			p.add(pi);
		}
		
        return Response.ok(p).status(200).build();
    }

}

