package Decorator;

import Interfaces.IContratacion;

public class DecoratorTv extends DecoratorContratacion {

	public DecoratorTv(IContratacion encapsulado) {
		super(encapsulado);
	}

	@Override
	public String getFactura() {
		return super.getFactura() + " + TV-Cable";
	}

	@Override
	public double getCosto() {
		return super.getCosto() + 250;
	}
}
