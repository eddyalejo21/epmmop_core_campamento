package ec.gob.epmmop.campamentos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="USUCAMPAMENT", schema = "epmmop")
@NamedQuery(name="UsuarioCampamento.findAll", query="SELECT a FROM UsuarioCampamento a")
public class UsuarioCampamento {

		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="USUC_SECUENCIAL")
		private Integer usucSecuencial;

		@Column(name="USUC_NOMBRECOMPLE")
		private String usucNombreComple;

		@Column(name="USUC_USARIO")
		private String usucUsuario;

		@Column(name="USUC_CEDULA")
		private String usucCedula;

		@Column(name="USUC_ESTADO_AH")
		private char usucEstadoAh;

		public UsuarioCampamento() {
		}

		public Integer getUsucSecuencial() {
			return usucSecuencial;
		}

		public void setUsucSecuencial(Integer usucSecuencial) {
			this.usucSecuencial = usucSecuencial;
		}

		public String getUsucNombreComple() {
			return usucNombreComple;
		}

		public void setUsucNombreComple(String usucNombreComple) {
			this.usucNombreComple = usucNombreComple;
		}

		public String getUsucUsuario() {
			return usucUsuario;
		}

		public void setUsucUsuario(String usucUsuario) {
			this.usucUsuario = usucUsuario;
		}

		public String getUsucCedula() {
			return usucCedula;
		}

		public void setUsucCedula(String usucCedula) {
			this.usucCedula = usucCedula;
		}

		public char getUsucEstadoAh() {
			return usucEstadoAh;
		}

		public void setUsucEstadoAh(char usucEstadoAh) {
			this.usucEstadoAh = usucEstadoAh;
		}
	
	
		
		
}
