package Modelo;

import Interfaces.IContratacion;

public abstract class Contratacion implements IContratacion {
	protected String factura;
	protected double costo;

	public Contratacion() {

	}

	public String getFactura() {
		return factura;
	}

	public double getCosto() {
		return costo;
	}

}
