package com.fpt.mediation;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class Main {
	public static void main(String[] args) {
        ObjectName objectName = null;
        try {
            objectName = new ObjectName("com.fpt.mediation:type=basic,name=MediationOnline");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        MediationMon mediationMon = new MediationMon();
        try {
            server.registerMBean(mediationMon, objectName);
        } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException e) {
            e.printStackTrace();
        }
        
        Thread fake = new Thread(new FakeSession(mediationMon));
        fake.start();
        
        while (true) {
        }
	}
}
