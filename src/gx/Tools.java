package gx;

import gx.portalEngine.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.Math;

/**
 * Created by Ridiculous on 2016/5/26.
 */
public class Tools {
    public static String genStreamNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String no = "0000000000000000000000000000000000000000000"
                + sdf.format(new Date());
        return no;
    }
    public static String subscribe(String mobile, String spid) throws Exception {
        PortalEngineServiceLocator locator = new PortalEngineServiceLocator();
        PortalEngine_PortType engine = locator.getPortalEngine();
        CreateSubscriptionReq req = new CreateSubscriptionReq();
        CreateSubscriptionRsp rsp = new CreateSubscriptionRsp();
        req.setStreamingNo(Tools.genStreamNo());
        req.setSrcDeviceType(2);
        req.setSrcDeviceID(Constants.DeviceID);
        req.setOA(mobile);
        req.setOAType(0);
        req.setDA(mobile);
        req.setOAType(0);
        req.setFA(mobile);
        req.setFAType(0);
        req.setIDType(0);
        req.setID(spid);
        rsp = engine.createSubscription(req);
        return String.valueOf(rsp.getResultCode());
    }
    public static String unsubscribe(String mobile,String spid) throws Exception{
        PortalEngineServiceLocator locator = new PortalEngineServiceLocator();
        PortalEngine_PortType engine = locator.getPortalEngine();
        WithdrawSubscriptionReq req = new WithdrawSubscriptionReq();
        WithdrawSubscriptionRsp rsp = new WithdrawSubscriptionRsp();
        req.setStreamingNo(Tools.genStreamNo());
        req.setSrcDeviceType(2);
        req.setSrcDeviceID(Constants.DeviceID);
        req.setUserIDType(0);
        req.setUserID(mobile);
        req.setIDType(0);
        req.setID(spid);
        rsp = engine.withdrawSubscription(req);
        return String.valueOf(rsp.getResultCode());
    }
    public static String getTimestamp() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String atTime = sdf.format(new java.util.Date(System.currentTimeMillis()));
        return atTime;
    }
}
