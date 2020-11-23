package Decorator;

import Interfaces.IContratacion;

public class DecoratorTelFijo extends DecoratorContratacion {

	public DecoratorTelFijo(IContratacion encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getFactura() {
		return super.getFactura() + " + Telefono Fijo";
	}

	@Override
	public double getCosto() {
		return super.getCosto() + 200;
	}
}
