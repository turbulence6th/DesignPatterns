package com.turbulence6th.template;

public abstract class Game {

	protected abstract void initialize();
	
	protected abstract void startGame();
	
	protected abstract void endGame();
	
	public final void play() {
		this.initialize();
		this.startGame();
		this.endGame();
	}
	
}
