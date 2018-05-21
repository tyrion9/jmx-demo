package com.fpt.mediation;

import java.util.List;

public interface MediationMonMBean {
	int getMaxSession();
	void setMaxSession(int maxSession);
	
	List<String> getSessionProfile();
	
	int getCurrentSession();
	
	int getTransactionLoggerQueue();
	
	void refreshActiveSubscriber();
}
