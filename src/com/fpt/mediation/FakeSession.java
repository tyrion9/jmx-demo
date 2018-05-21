package com.fpt.mediation;

import java.util.concurrent.ThreadLocalRandom;

public class FakeSession implements Runnable {
	MediationMon mon = null;

	public FakeSession(MediationMon mon) {
		this.mon = mon;
	}

	@Override
	public void run() {
		while (true) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			int sign = ThreadLocalRandom.current().nextInt(1, 2 + 1);
			int num = 0;

			if (sign == 1) {
				num = randomNum;
			} else {
				num = -randomNum;
			}

			mon.setCurrentSession(mon.getCurrentSession() + num);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
