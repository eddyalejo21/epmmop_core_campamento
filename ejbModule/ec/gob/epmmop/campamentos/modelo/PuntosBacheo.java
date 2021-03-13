package ec.gob.epmmop.campamentos.modelo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "PUNTBACHEO", schema= "epmmop")
@NamedQuery(name = "PuntosBacheo.findAll", query = "SELECT c FROM PuntosBacheo c")
public class PuntosBacheo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PUN_SECUENCIAL")
	private Integer punSecuencial;

	@Column(name = "PUN_LATITUD")
	private String punLatitud;

	@Column(name = "PUN_LONGITUD")
	private String punLongitud;

	@Column(name = "PUN_FECHA")
	private Timestamp punFecha;

	@Column(name = "PUN_ESTADO_AH")
	private char punEstadoAh;

	@Column(name = "PUN_ESTADO")
	private char punEstado;

	public PuntosBacheo() {
	}

	public Integer getPunSecuencial() {
		return punSecuencial;
	}

	public void setPunSecuencial(Integer punSecuencial) {
		this.punSecuencial = punSecuencial;
	}

	public String getPunLatitud() {
		return punLatitud;
	}

	public void setPunLatitud(String punLatitud) {
		this.punLatitud = punLatitud;
	}

	public String getPunLongitud() {
		return punLongitud;
	}

	public void setPunLongitud(String punLongitud) {
		this.punLongitud = punLongitud;
	}

	public Timestamp getPunFecha() {
		return punFecha;
	}

	public void setPunFecha(Timestamp punFecha) {
		this.punFecha = punFecha;
	}

	public char getPunEstadoAh() {
		return punEstadoAh;
	}

	public void setPunEstadoAh(char punEstadoAh) {
		this.punEstadoAh = punEstadoAh;
	}

	public char getPunEstado() {
		return punEstado;
	}

	public void setPunEstado(char punEstado) {
		this.punEstado = punEstado;
	}
	
	
	

}
