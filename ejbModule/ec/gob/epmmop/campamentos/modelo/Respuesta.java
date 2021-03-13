package ec.gob.epmmop.campamentos.modelo;

import javax.ws.rs.core.Response.Status;

public class Respuesta {
	
	private Status status;
	private Object entity;
	
	public Status getStatus() {
		return status;
	}
	public Object getEntity() {
		return entity;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setEntity(Object entity) {
		this.entity = entity;
	}
	

}
