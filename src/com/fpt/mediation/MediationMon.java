package com.fpt.mediation;

import java.util.ArrayList;
import java.util.List;

public class MediationMon implements MediationMonMBean {
	private int maxSession = 1000;
	private int currentSession = 253;
	private int transactionLoggerQueue = 17;

	@Override
	public int getMaxSession() {
		return maxSession;
	}

	@Override
	public void setMaxSession(int maxSession) {
		this.maxSession = maxSession;
	}

	@Override
	public int getTransactionLoggerQueue() {
		return transactionLoggerQueue;
	}

	@Override
	public void refreshActiveSubscriber() {
		
	}

	@Override
	public int getCurrentSession() {
		return currentSession;
	}
	
	public void setCurrentSession(int current) {
		this.currentSession = current;
	}

	@Override
	public List<String> getSessionProfile() {
		List<String> lstProfile = new ArrayList();
		lstProfile.add("123-12");
		lstProfile.add("124-15");
		lstProfile.add("125-25");
		lstProfile.add("126-17");
		lstProfile.add("127-26");
		lstProfile.add("128-5");
		
		return lstProfile;
	}
}
