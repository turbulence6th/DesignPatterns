package com.turbulence6th.template;

public class Basketball extends Game {

	@Override
	protected void initialize() {
		System.out.println("Basketball is initialized");
	}

	@Override
	protected void startGame() {
		System.out.println("Basketball is started");
	}

	@Override
	protected void endGame() {
		System.out.println("Basketball is ended");
	}

}
