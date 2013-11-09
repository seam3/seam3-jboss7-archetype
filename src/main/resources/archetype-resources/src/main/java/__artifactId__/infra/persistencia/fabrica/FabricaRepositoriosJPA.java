#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.infra.persistencia.fabrica;

import javax.persistence.EntityManager;

import ${package}.TIPO_DOMINIO.dominio.repositorio.RepositorioPessoa;
import ${package}.__artifactId__.infra.persistencia.RepositorioPessoaJPA;
import ${package}.base.infra.persistencia.fabrica.FabricaGenericaRepositoriosJPA;

public class FabricaRepositoriosJPA extends FabricaGenericaRepositoriosJPA{

	public FabricaRepositoriosJPA(EntityManager entityManager) {
		super(entityManager);
	}

	public RepositorioPessoa construirRepositorioPessoa(){
		return new RepositorioPessoaJPA(super.getEntityManager());
	}
}
