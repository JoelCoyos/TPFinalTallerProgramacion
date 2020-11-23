package Decorator;

import Interfaces.IContratacion;

public class DecoratorCelular extends DecoratorContratacion {

	public DecoratorCelular(IContratacion encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getFactura() {
		return super.getFactura() + " + Celular";
	}

	@Override
	public double getCosto() {
		return super.getCosto() + 300;
	}

}
