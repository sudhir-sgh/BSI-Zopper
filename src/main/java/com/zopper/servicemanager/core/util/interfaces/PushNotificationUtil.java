package com.zopper.servicemanager.core.util.interfaces;

import java.util.List;

import com.zopper.servicemanager.core.util.pojo.PushNotificationInfo;
import com.zopper.servicemanager.core.util.pojo.RequestStatus;

public interface PushNotificationUtil {
	
	public RequestStatus sendAndroidPushNotification(PushNotificationInfo pnData);
	public RequestStatus sendiOSPushNotification(PushNotificationInfo pnData);
	
	public RequestStatus sendAndroidPushNotification(List<PushNotificationInfo> pnDataItemList);
	public RequestStatus sendiOSPushNotification(List<PushNotificationInfo> pnDataItemList);

}
