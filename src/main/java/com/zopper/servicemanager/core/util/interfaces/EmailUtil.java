package com.zopper.servicemanager.core.util.interfaces;

import java.util.List;

import com.zopper.servicemanager.core.util.pojo.EmailInfo;
import com.zopper.servicemanager.core.util.pojo.RequestStatus;

public interface EmailUtil {
	
	public RequestStatus sendEmail(EmailInfo emailData);
	public RequestStatus sendEmail(List<EmailInfo> emailDataList);

}
