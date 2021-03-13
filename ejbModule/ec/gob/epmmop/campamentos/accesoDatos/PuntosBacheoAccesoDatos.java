package ec.gob.epmmop.campamentos.accesoDatos;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.gob.epmmop.campamentos.modelo.PuntosBacheo;
import ec.gob.epmmop.utilitarios.ManejoDatosGenerico;

@Stateless
@LocalBean
public class PuntosBacheoAccesoDatos extends ManejoDatosGenerico<PuntosBacheo> {

	@PersistenceContext(unitName = "sql_server_geo_pu")
	private EntityManager entityManager;
	
	public PuntosBacheoAccesoDatos(){
		super(PuntosBacheo.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void crear(PuntosBacheo puntosBacheo) throws Exception {
		String consulta = "SELECT (max(c.punSecuencial)+1) as secuencial FROM PuntosBacheo c";
		Query query = this.getEntityManager().createQuery(consulta);
		Integer val = 0;
		if (query.getResultList() != null && !query.getResultList().isEmpty()) {
			val = (Integer) query.getResultList().get(0);
		}
		puntosBacheo.setPunSecuencial(val);

		create(puntosBacheo);
	}
	
	public List<PuntosBacheo> listarPuntosBacheo() throws Exception {
		System.out.println("Ingresa al servicio");
		String consulta = "SELECT c FROM PuntosBacheo c";
		Query query = this.getEntityManager().createQuery(consulta);
//		if (query.getResultList() != null && !query.getResultList().isEmpty()) {
			return query.getResultList();
//		}
//		System.out.println("Culmina el servicio");
//		return null;

	}

}
