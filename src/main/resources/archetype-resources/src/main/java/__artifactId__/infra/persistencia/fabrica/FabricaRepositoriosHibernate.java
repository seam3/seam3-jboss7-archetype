#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.infra.persistencia.fabrica;

import org.hibernate.Session;

import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.__artifactId__.infra.persistencia.RepositorioPessoaHibernate;
import ${package}.base.infra.persistencia.fabrica.FabricaGenericaRepositoriosHibernate;
import ${package}.base.infra.persistencia.fabrica.TipoFabricaHibernate;

public class FabricaRepositoriosHibernate extends FabricaGenericaRepositoriosHibernate{

	public FabricaRepositoriosHibernate(TipoFabricaHibernate tipo, Session session) {
		super(tipo, session);
	}

	public RepositorioPessoa construirRepositorioPessoa(){
		return new RepositorioPessoaHibernate(super.getSession());
	}
}
