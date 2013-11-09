#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.__artifactId__.util;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import ${package}.__artifactId__.infra.persistencia.EsquemaCAD;
import ${package}.__artifactId__.infra.persistencia.fabrica.FabricaRepositoriosJPA;

@Named
public class RepositorioUtil implements Serializable {

	private static final long serialVersionUID = -3688012233645703429L;
	@Inject @EsquemaCAD EntityManager entityManager;
	
	//@Inject @EsquemaCAD Session session;
	//@In Session session; // Caso fosse usado Seam2
	
	public FabricaRepositoriosJPA construirFabricaRepositorios(){
		return new FabricaRepositoriosJPA(entityManager);
		//return new FabricaRepositoriosHibernate(TipoFabricaHibernate.PADRAO, session);
		//return new FabricaRepositoriosHibernate(TipoFabricaHibernate.SEAM2, session);
	}
	
	/**
	 * Recupera a session injetada
	 * @return
	 */
	public EntityManager getEntityManager(){
		return entityManager;
	}	
}
