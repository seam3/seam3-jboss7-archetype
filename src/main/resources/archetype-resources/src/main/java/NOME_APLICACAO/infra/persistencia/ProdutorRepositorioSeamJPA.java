#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.NOME_APLICACAO.infra.persistencia;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.solder.core.ExtensionManaged;


/**
 * Classe produtora de EntityManager.
 * A partir de entao pode-se delegar ao Seam o controle transacional
 * @author user
 *
 */
public class ProdutorRepositorioSeamJPA {

	
	@PersistenceContext(unitName="primary")
	private EntityManager entityManager;

    
	@RequestScoped  
    @Produces  
    @EsquemaCAD
    @ExtensionManaged
    protected EntityManager createEntityManager() { 
	    return this.entityManager;
	}
}