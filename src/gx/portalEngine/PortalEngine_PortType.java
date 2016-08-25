/**
 * PortalEngine_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package gx.portalEngine;

public interface PortalEngine_PortType extends java.rmi.Remote {
    public gx.portalEngine.CreateSubscriptionRsp createSubscription(gx.portalEngine.CreateSubscriptionReq createSubscriptionReq) throws java.rmi.RemoteException;
    public gx.portalEngine.WithdrawSubscriptionRsp withdrawSubscription(gx.portalEngine.WithdrawSubscriptionReq withdrawSubscriptionReq) throws java.rmi.RemoteException;
    public gx.portalEngine.GetSubscriptionRsp getSubscription(gx.portalEngine.GetSubscriptionReq getSubscriptionReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ResponseInfo withdrawAllSubscription(gx.portalEngine.WithdrawAllSubscriptionReq withdrawAllSubscriptionReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ResponseInfo modifyPassword(gx.portalEngine.ModifyPasswordReq modifyPasswordReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ResponseInfo resetPassword(gx.portalEngine.ResetPasswordReq resetPasswordReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ReadUserRsp readUser(gx.portalEngine.ReadUserReq readUserReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ResponseInfo modifyUser(gx.portalEngine.ModifyUserReq modifyUserReq) throws java.rmi.RemoteException;
    public gx.portalEngine.AuthenticateUserRsp authenticateUser(gx.portalEngine.AuthenticateUserReq authenticateUserReq) throws java.rmi.RemoteException;
    public gx.portalEngine.AuthorizeUserRsp authorizeUser(gx.portalEngine.AuthorizeUserReq authorizeUserReq) throws java.rmi.RemoteException;
    public gx.portalEngine.QuerySubscriptionHistoryRsp querySubscriptionHistory(gx.portalEngine.QuerySubscriptionHistoryReq querySubscriptionHistoryReq) throws java.rmi.RemoteException;
    public gx.portalEngine.ResponseInfo useService(gx.portalEngine.UseServiceReq useServiceReq) throws java.rmi.RemoteException;
}
