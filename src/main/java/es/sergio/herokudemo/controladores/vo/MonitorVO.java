package es.sergio.herokudemo.controladores.vo;

import java.io.Serializable;

public class MonitorVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String estado;
	
	public MonitorVO() {
		this.estado = "ok";
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
