package com.mt9.Synchronized.Deadlock;

public class Tom implements Runnable {
	Hospital h;
	
	public Tom(Hospital h) {
		this.h=h;
	}

	@Override
	public void run() {

		h.treatTom();
	}

}
