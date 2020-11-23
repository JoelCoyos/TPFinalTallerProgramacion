package Decorator;

import Interfaces.IContratacion;

public abstract class DecoratorContratacion implements IContratacion {
	protected IContratacion encapsulado;

	public DecoratorContratacion(IContratacion encapsulado) {
		this.encapsulado = encapsulado;
	}

	@Override
	public String getFactura() {
		return encapsulado.getFactura();
	}

	@Override
	public double getCosto() {
		return encapsulado.getCosto();
	}

}
