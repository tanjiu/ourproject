/**
 * MServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i1314i.ourproject.service.webservice.serviceUtil;

public interface MServiceSoap_PortType extends java.rmi.Remote {
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetDicSpecialsResponseGetDicSpecialsResult getDicSpecials(java.lang.String code) throws java.rmi.RemoteException;
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetClientsResponseGetClientsResult getClients(java.lang.String code, java.lang.String farmid) throws java.rmi.RemoteException;
    public java.lang.String save2005FarmSampling(java.lang.String code, java.lang.String farmID, com.i1314i.ourproject.service.webservice.serviceUtil.Save2005FarmSamplingTaskDataSet taskDataSet) throws java.rmi.RemoteException;
    public com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueResponseCheck2005SamplingValueResult check2005SamplingValue(java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.Check2005SamplingValueAtaskinfo ataskinfo) throws java.rmi.RemoteException;
    public com.i1314i.ourproject.service.webservice.serviceUtil.TestResponseTestResult test() throws java.rmi.RemoteException;
    public java.lang.String syncCheckFoodData(java.lang.String farmID, java.lang.String pwd, java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataXmlCheck xmlCheck, com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataXmlChechDetails xmlChechDetails) throws java.rmi.RemoteException;
    public java.lang.String syncCheckFoodData2005(java.lang.String farmID, java.lang.String pwd, java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodData2005XmlCheck xmlCheck, com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodData2005XmlCheckDetails xmlCheckDetails) throws java.rmi.RemoteException;
    public java.lang.String syncCheckFoodData2005_String(java.lang.String farmID, java.lang.String pwd, java.lang.String code, java.lang.String xmlCheck, java.lang.String xmlCheckDetails) throws java.rmi.RemoteException;
    public java.lang.String syncCheckFoodDataToJnServer(com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlCheck xmlCheck, com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckFoodDataToJnServerXmlChechDetails xmlChechDetails) throws java.rmi.RemoteException;

    /**
     * 酶抑制率法检测数据上传所调用方法名称及参数
     */
    public java.lang.String syncMyzlCheckFoodData2005ForSD(java.lang.String farmID, java.lang.String pwd, java.lang.String code, java.lang.String xmlCheck) throws java.rmi.RemoteException;

    /**
     * 老版本检测数据上传
     */
    public java.lang.String syncCheckFoodData2005ForSD(java.lang.String farmID, java.lang.String pwd, java.lang.String code, java.lang.String xmlCheck, java.lang.String xmlChechDetails) throws java.rmi.RemoteException;

    /**
     * 酶抑制率法检测数据上传所调用方法名称及参数
     */
    public java.lang.String syncMyzlCheckFoodData2005(java.lang.String farmID, java.lang.String pwd, java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.SyncMyzlCheckFoodData2005XmlCheck xmlCheck) throws java.rmi.RemoteException;

    /**
     * 仅用于数据检测2005(多项检测数据上传,检测单位需要认证)
     */
    public java.lang.String syncFoodCheckDataValidate2005(java.lang.String farmID, java.lang.String pwd, java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.SyncFoodCheckDataValidate2005XmlCheck xmlCheck, com.i1314i.ourproject.service.webservice.serviceUtil.SyncFoodCheckDataValidate2005XmlChechDetails xmlChechDetails) throws java.rmi.RemoteException;

    /**
     * 仅用于数据检测2005,单项检测数据上传,检测单位需要验证
     */
    public java.lang.String syncVResultCollectValidate(java.lang.String farmID, java.lang.String pwd, java.lang.String code, com.i1314i.ourproject.service.webservice.serviceUtil.SyncVResultCollectValidateXmlCheck xmlCheck) throws java.rmi.RemoteException;

    /**
     * 其他系统调用此接口上传基地单位信息
     */
    public java.lang.String syncFarmsInfoList(com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoListFarmsXMl farmsXMl) throws java.rmi.RemoteException;

    /**
     * 其他系统调用此接口上传基地单位信息
     */
    public java.lang.String syncFarmsInfoList2005(com.i1314i.ourproject.service.webservice.serviceUtil.SyncFarmsInfoList2005FarmsXMl farmsXMl) throws java.rmi.RemoteException;

    /**
     * 上级单位各子地区调用此接口上传检测数据到总服务器平台
     */
    public java.lang.String syncCheckDataToServer(com.i1314i.ourproject.service.webservice.serviceUtil.SyncCheckDataToServerDataXml dataXml) throws java.rmi.RemoteException;

    /**
     * 上级各子地区调用此接口上传单位信息到总服务器平台
     */
    public java.lang.String syncFamrsDataToServer(com.i1314i.ourproject.service.webservice.serviceUtil.SyncFamrsDataToServerDataXml dataXml) throws java.rmi.RemoteException;
    public java.lang.String saveIntelligent(java.lang.String code, java.lang.String infoTypeID, java.lang.String ID, java.lang.String sendMan, java.lang.String content) throws java.rmi.RemoteException;

    /**
     * 获取指定地区特定时间段内的检测数据列表
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataResponseGetResultCollectDataResult getResultCollectData(java.lang.String checkDate, java.lang.String regionID) throws java.rmi.RemoteException;

    /**
     * 广州系统使用 --获取指定地区特定时间段内的检测数据列表
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetResultCollectDataBetDatesResponseGetResultCollectDataBetDatesResult getResultCollectDataBetDates(java.lang.String bdate, java.lang.String edate, java.lang.String regionID) throws java.rmi.RemoteException;

    /**
     * 获取指定检测单位的检测数据
     */
    public java.lang.String getFarmsCheckData(java.lang.String strToken, java.lang.String farmID, java.lang.String startTime, java.lang.String endTime) throws java.rmi.RemoteException;

    /**
     * 获取指定检测单位或指定地区的检测数据
     */
    public java.lang.String getCheckDataByRIDOrFID(java.lang.String strToken, java.lang.String farmID, java.lang.String regionID, java.lang.String startTime, java.lang.String endTime) throws java.rmi.RemoteException;

    /**
     * 获取指定地区下面的生产企业信息列表
     */
    public com.i1314i.ourproject.service.webservice.serviceUtil.GetFarmsInfoListResponseGetFarmsInfoListResult getFarmsInfoList(java.lang.String regionID) throws java.rmi.RemoteException;

    /**
     * 同步地区(新版MVC项目地区)
     */
    public java.lang.String synMVCRegionData(com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCRegionDataXmlRegion xmlRegion) throws java.rmi.RemoteException;

    /**
     * 同步菜单(新版MVC项目菜单)
     */
    public java.lang.String synMVCMenuData(com.i1314i.ourproject.service.webservice.serviceUtil.SynMVCMenuDataXmlRegion xmlRegion, int slen) throws java.rmi.RemoteException;

    /**
     * 同步菜单(新版MVC项目菜单)
     */
    public java.lang.String synMVCMenuData2(java.lang.String xmlRegion, int slen) throws java.rmi.RemoteException;

    /**
     * 同步PassPort 用户和应用程序关联表)
     */
    public java.lang.String synPassPortUserAndApplication(com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserAndApplicationXmlDatas xmlDatas) throws java.rmi.RemoteException;

    /**
     * 同步PassPort用户与组关联表)
     */
    public java.lang.String synPassPortUserGroupUsers(com.i1314i.ourproject.service.webservice.serviceUtil.SynPassPortUserGroupUsersXmlDatas xmlDatas) throws java.rmi.RemoteException;

    /**
     * 根据农资登记证号从中国农资信息网官网获取相关信息
     */
    public java.lang.String queryFM(java.lang.String productregcode, java.lang.String ENCregNo) throws java.rmi.RemoteException;

    /**
     * 根据农资登记证号从中国农资信息网官网获取相关标签信息
     */
    public java.lang.String queryLableInfo(java.lang.String productregcode) throws java.rmi.RemoteException;

    /**
     * 获取复博农资库农资基本信息)
     */
    public java.lang.String queryFuboAgriBaseInfo(java.lang.String regNo) throws java.rmi.RemoteException;

    /**
     * 获取复博农资库农资标签信息)
     */
    public java.lang.String queryFuboAgriLableInfo(java.lang.String regNo) throws java.rmi.RemoteException;
}
