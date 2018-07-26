package com.juego.elementos;

public abstract class HumanElement extends BasicElement{
	
	protected Armamento Armas;
	
	public void LoadArmamentos(Armamento arma) {
		this.Ataque += arma.Ataque;
		this.Defensa += arma.Defensa;
		this.Magia += arma.Magia;
		this.Vida += arma.Vida;
		this.Armas = arma;
	}
	
	
}
