package ec.gob.epmmop.campamentos.servicios;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ec.gob.epmmop.campamentos.accesoDatos.PuntosBacheoAccesoDatos;
import ec.gob.epmmop.campamentos.modelo.PuntosBacheo;

@Stateless
@LocalBean
public class PuntosBacheoServicio {
	
	@EJB
	private PuntosBacheoAccesoDatos puntoBacheoAccesoDatos;
	
	public void registrarCoordenada(PuntosBacheo puntosBacheo) throws Exception
    {
		puntoBacheoAccesoDatos.crear(puntosBacheo);
    }
	
	public List<PuntosBacheo> listarPuntosBacheo() throws Exception
    {
        return puntoBacheoAccesoDatos.listarPuntosBacheo();
    }

}
