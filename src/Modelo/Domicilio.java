package Modelo;

import Interfaces.IContratacion;

public class Domicilio {
	private String direccion;
	IContratacion contrato;

	public Domicilio(String direccion, IContratacion contrato) {
		this.direccion = direccion;
		this.contrato = contrato;
	}

	public String getDireccion() {
		return direccion;
	}

	public IContratacion getContrato() {
		return contrato;
	}

	@Override
	public String toString() {
		return direccion + " - " + contrato.getFactura() + " = $" + contrato.getCosto();
	}

}
