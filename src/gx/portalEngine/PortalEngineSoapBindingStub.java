/**
 * PortalEngineSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Nov 19, 2006 (02:31:34 GMT+00:00) WSDL2Java emitter.
 */

package gx.portalEngine;

public class PortalEngineSoapBindingStub extends org.apache.axis.client.Stub implements gx.portalEngine.PortalEngine_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[12];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "createSubscriptionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "CreateSubscriptionReq"), gx.portalEngine.CreateSubscriptionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "CreateSubscriptionRsp"));
        oper.setReturnClass(gx.portalEngine.CreateSubscriptionRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "createSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("withdrawSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "withdrawSubscriptionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "WithdrawSubscriptionReq"), gx.portalEngine.WithdrawSubscriptionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "WithdrawSubscriptionRsp"));
        oper.setReturnClass(gx.portalEngine.WithdrawSubscriptionRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "withdrawSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "getSubscriptionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "GetSubscriptionReq"), gx.portalEngine.GetSubscriptionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "GetSubscriptionRsp"));
        oper.setReturnClass(gx.portalEngine.GetSubscriptionRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "getSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("withdrawAllSubscription");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "withdrawAllSubscriptionReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "WithdrawAllSubscriptionReq"), gx.portalEngine.WithdrawAllSubscriptionReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo"));
        oper.setReturnClass(gx.portalEngine.ResponseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "withdrawAllSubscriptionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "modifyPasswordReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ModifyPasswordReq"), gx.portalEngine.ModifyPasswordReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo"));
        oper.setReturnClass(gx.portalEngine.ResponseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "modifyPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "resetPasswordReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ResetPasswordReq"), gx.portalEngine.ResetPasswordReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo"));
        oper.setReturnClass(gx.portalEngine.ResponseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "resetPasswordReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("readUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "readUserReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ReadUserReq"), gx.portalEngine.ReadUserReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ReadUserRsp"));
        oper.setReturnClass(gx.portalEngine.ReadUserRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "readUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "modifyUserReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ModifyUserReq"), gx.portalEngine.ModifyUserReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo"));
        oper.setReturnClass(gx.portalEngine.ResponseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "modifyUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authenticateUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "authenticateUserReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "AuthenticateUserReq"), gx.portalEngine.AuthenticateUserReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "AuthenticateUserRsp"));
        oper.setReturnClass(gx.portalEngine.AuthenticateUserRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "authenticateUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authorizeUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "authorizeUserReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "AuthorizeUserReq"), gx.portalEngine.AuthorizeUserReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "AuthorizeUserRsp"));
        oper.setReturnClass(gx.portalEngine.AuthorizeUserRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "authorizeUserReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("querySubscriptionHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "querySubscriptionHistoryReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "QuerySubscriptionHistoryReq"), gx.portalEngine.QuerySubscriptionHistoryReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "QuerySubscriptionHistoryRsp"));
        oper.setReturnClass(gx.portalEngine.QuerySubscriptionHistoryRsp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "querySubscriptionHistoryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("useService");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "useServiceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "UseServiceReq"), gx.portalEngine.UseServiceReq.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo"));
        oper.setReturnClass(gx.portalEngine.ResponseInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "useServiceReturn"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

    }

    public PortalEngineSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PortalEngineSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PortalEngineSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "ArrayOf_tns2_SubHistoryInfo");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.SubHistoryInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "SubHistoryInfo");
            qName2 = new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "ArrayOf_tns2_SubInfo");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.SubInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "SubInfo");
            qName2 = new javax.xml.namespace.QName("http://portalEngine.ismp.chinatelecom.com", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "AuthenticateUserReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.AuthenticateUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "AuthorizeUserReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.AuthorizeUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "CreateSubscriptionReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.CreateSubscriptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "GetSubscriptionReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.GetSubscriptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ModifyPasswordReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ModifyPasswordReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ModifyUserReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ModifyUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "QuerySubscriptionHistoryReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.QuerySubscriptionHistoryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ReadUserReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ReadUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "ResetPasswordReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ResetPasswordReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "UseServiceReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.UseServiceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "WithdrawAllSubscriptionReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.WithdrawAllSubscriptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://req.portalEngine.ismp.chinatelecom.com", "WithdrawSubscriptionReq");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.WithdrawSubscriptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "AuthenticateUserRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.AuthenticateUserRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "AuthorizeUserRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.AuthorizeUserRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "CreateSubscriptionRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.CreateSubscriptionRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "GetSubscriptionRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.GetSubscriptionRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "QuerySubscriptionHistoryRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.QuerySubscriptionHistoryRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ReadUserRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ReadUserRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "ResponseInfo");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.ResponseInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "SubHistoryInfo");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.SubHistoryInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "SubInfo");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.SubInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rsp.portalEngine.ismp.chinatelecom.com", "WithdrawSubscriptionRsp");
            cachedSerQNames.add(qName);
            cls = gx.portalEngine.WithdrawSubscriptionRsp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public gx.portalEngine.CreateSubscriptionRsp createSubscription(gx.portalEngine.CreateSubscriptionReq createSubscriptionReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createSubscriptionReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.CreateSubscriptionRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.CreateSubscriptionRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.CreateSubscriptionRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.WithdrawSubscriptionRsp withdrawSubscription(gx.portalEngine.WithdrawSubscriptionReq withdrawSubscriptionReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "withdrawSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {withdrawSubscriptionReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.WithdrawSubscriptionRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.WithdrawSubscriptionRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.WithdrawSubscriptionRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.GetSubscriptionRsp getSubscription(gx.portalEngine.GetSubscriptionReq getSubscriptionReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {getSubscriptionReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.GetSubscriptionRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.GetSubscriptionRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.GetSubscriptionRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ResponseInfo withdrawAllSubscription(gx.portalEngine.WithdrawAllSubscriptionReq withdrawAllSubscriptionReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "withdrawAllSubscription"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {withdrawAllSubscriptionReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ResponseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ResponseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ResponseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ResponseInfo modifyPassword(gx.portalEngine.ModifyPasswordReq modifyPasswordReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyPasswordReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ResponseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ResponseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ResponseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ResponseInfo resetPassword(gx.portalEngine.ResetPasswordReq resetPasswordReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {resetPasswordReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ResponseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ResponseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ResponseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ReadUserRsp readUser(gx.portalEngine.ReadUserReq readUserReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "readUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {readUserReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ReadUserRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ReadUserRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ReadUserRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ResponseInfo modifyUser(gx.portalEngine.ModifyUserReq modifyUserReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "modifyUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {modifyUserReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ResponseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ResponseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ResponseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.AuthenticateUserRsp authenticateUser(gx.portalEngine.AuthenticateUserReq authenticateUserReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authenticateUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticateUserReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.AuthenticateUserRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.AuthenticateUserRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.AuthenticateUserRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.AuthorizeUserRsp authorizeUser(gx.portalEngine.AuthorizeUserReq authorizeUserReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authorizeUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authorizeUserReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.AuthorizeUserRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.AuthorizeUserRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.AuthorizeUserRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.QuerySubscriptionHistoryRsp querySubscriptionHistory(gx.portalEngine.QuerySubscriptionHistoryReq querySubscriptionHistoryReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "querySubscriptionHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {querySubscriptionHistoryReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.QuerySubscriptionHistoryRsp) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.QuerySubscriptionHistoryRsp) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.QuerySubscriptionHistoryRsp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public gx.portalEngine.ResponseInfo useService(gx.portalEngine.UseServiceReq useServiceReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "useService"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {useServiceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (gx.portalEngine.ResponseInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (gx.portalEngine.ResponseInfo) org.apache.axis.utils.JavaUtils.convert(_resp, gx.portalEngine.ResponseInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
