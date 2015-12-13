package fr.upmc.datacenter.software.requestdispatcher.interfaces;

import fr.upmc.components.interfaces.OfferedI;
import fr.upmc.components.interfaces.RequiredI;

public interface RequestDispatcherVMEndingNotificationI extends OfferedI, RequiredI{
	
	public void notifyAdmissionControllerVMFinishRequest(String RequestSubmissionInboundPortURI) throws Exception;

}
