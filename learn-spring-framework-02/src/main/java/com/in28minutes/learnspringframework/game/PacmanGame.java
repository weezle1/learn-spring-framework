package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {

	public void up() {
		System.out.println("Move up");
	}

	public void down() {
		System.out.println("Move Down");
	}

	public void left() {
		System.out.println("Move Left");
	}

	public void right() {
		System.out.println("Move Right");
	}
	
}
