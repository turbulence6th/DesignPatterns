package com.turbulence6th.template;

public class Football extends Game {

	@Override
	protected void initialize() {
		System.out.println("Football is initialized");
	}

	@Override
	protected void startGame() {
		System.out.println("Football is started");
	}

	@Override
	protected void endGame() {
		System.out.println("Football is ended");
	}

}
