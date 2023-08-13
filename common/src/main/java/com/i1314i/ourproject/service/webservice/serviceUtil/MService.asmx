<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="GetDicSpecials">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetDicSpecialsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetDicSpecialsResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClients">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="farmid" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetClientsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetClientsResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Save2005FarmSampling">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="TaskDataSet">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Save2005FarmSamplingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Save2005FarmSamplingResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Check2005SamplingValue">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ataskinfo">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Check2005SamplingValueResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Check2005SamplingValueResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Test">
        <s:complexType />
      </s:element>
      <s:element name="TestResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TestResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
            <s:element minOccurs="0" maxOccurs="1" name="XmlChechDetails">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckFoodDataResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheckDetails">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckFoodData2005Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005_String">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheckDetails" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005_StringResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckFoodData2005_StringResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodDataToJnServer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
            <s:element minOccurs="0" maxOccurs="1" name="XmlChechDetails">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodDataToJnServerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckFoodDataToJnServerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncMyzlCheckFoodData2005ForSD">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncMyzlCheckFoodData2005ForSDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncMyzlCheckFoodData2005ForSDResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005ForSD">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlChechDetails" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckFoodData2005ForSDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckFoodData2005ForSDResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncMyzlCheckFoodData2005">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncMyzlCheckFoodData2005Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncMyzlCheckFoodData2005Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFoodCheckDataValidate2005">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
            <s:element minOccurs="0" maxOccurs="1" name="XmlChechDetails">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFoodCheckDataValidate2005Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncFoodCheckDataValidate2005Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncVResultCollectValidate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Pwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="XmlCheck">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncVResultCollectValidateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncVResultCollectValidateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFarmsInfoList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmsXMl">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFarmsInfoListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncFarmsInfoListResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFarmsInfoList2005">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FarmsXMl">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFarmsInfoList2005Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncFarmsInfoList2005Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckDataToServer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DataXml">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncCheckDataToServerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncCheckDataToServerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFamrsDataToServer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DataXml">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SyncFamrsDataToServerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SyncFamrsDataToServerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveIntelligent">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="code" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="InfoTypeID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SendMan" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Content" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SaveIntelligentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SaveIntelligentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetResultCollectData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CheckDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="RegionID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetResultCollectDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetResultCollectDataResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetResultCollectDataBetDates">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="Bdate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Edate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="RegionID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetResultCollectDataBetDatesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetResultCollectDataBetDatesResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFarmsCheckData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="strToken" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartTime" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndTime" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFarmsCheckDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFarmsCheckDataResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCheckDataByRIDOrFID">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="strToken" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="FarmID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="RegionID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartTime" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndTime" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetCheckDataByRIDOrFIDResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetCheckDataByRIDOrFIDResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFarmsInfoList">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RegionID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetFarmsInfoListResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetFarmsInfoListResult">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCRegionData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlRegion">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCRegionDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SynMVCRegionDataResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCMenuData">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlRegion">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
            <s:element minOccurs="1" maxOccurs="1" name="slen" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCMenuDataResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SynMVCMenuDataResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCMenuData2">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlRegion" type="s:string" />
            <s:element minOccurs="1" maxOccurs="1" name="slen" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynMVCMenuData2Response">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SynMVCMenuData2Result" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynPassPortUserAndApplication">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlDatas">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynPassPortUserAndApplicationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SynPassPortUserAndApplicationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynPassPortUserGroupUsers">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="XmlDatas">
              <s:complexType mixed="true">
                <s:sequence>
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SynPassPortUserGroupUsersResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SynPassPortUserGroupUsersResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFM">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="productregcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ENCregNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFMResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryFMResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryLableInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="productregcode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryLableInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryLableInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFuboAgriBaseInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RegNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFuboAgriBaseInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryFuboAgriBaseInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFuboAgriLableInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RegNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="QueryFuboAgriLableInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="QueryFuboAgriLableInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetDicSpecialsSoapIn">
    <wsdl:part name="parameters" element="tns:GetDicSpecials" />
  </wsdl:message>
  <wsdl:message name="GetDicSpecialsSoapOut">
    <wsdl:part name="parameters" element="tns:GetDicSpecialsResponse" />
  </wsdl:message>
  <wsdl:message name="GetClientsSoapIn">
    <wsdl:part name="parameters" element="tns:GetClients" />
  </wsdl:message>
  <wsdl:message name="GetClientsSoapOut">
    <wsdl:part name="parameters" element="tns:GetClientsResponse" />
  </wsdl:message>
  <wsdl:message name="Save2005FarmSamplingSoapIn">
    <wsdl:part name="parameters" element="tns:Save2005FarmSampling" />
  </wsdl:message>
  <wsdl:message name="Save2005FarmSamplingSoapOut">
    <wsdl:part name="parameters" element="tns:Save2005FarmSamplingResponse" />
  </wsdl:message>
  <wsdl:message name="Check2005SamplingValueSoapIn">
    <wsdl:part name="parameters" element="tns:Check2005SamplingValue" />
  </wsdl:message>
  <wsdl:message name="Check2005SamplingValueSoapOut">
    <wsdl:part name="parameters" element="tns:Check2005SamplingValueResponse" />
  </wsdl:message>
  <wsdl:message name="TestSoapIn">
    <wsdl:part name="parameters" element="tns:Test" />
  </wsdl:message>
  <wsdl:message name="TestSoapOut">
    <wsdl:part name="parameters" element="tns:TestResponse" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodDataSoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodDataSoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodDataResponse" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005SoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005SoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005Response" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005_StringSoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005_String" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005_StringSoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005_StringResponse" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodDataToJnServerSoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodDataToJnServer" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodDataToJnServerSoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodDataToJnServerResponse" />
  </wsdl:message>
  <wsdl:message name="SyncMyzlCheckFoodData2005ForSDSoapIn">
    <wsdl:part name="parameters" element="tns:SyncMyzlCheckFoodData2005ForSD" />
  </wsdl:message>
  <wsdl:message name="SyncMyzlCheckFoodData2005ForSDSoapOut">
    <wsdl:part name="parameters" element="tns:SyncMyzlCheckFoodData2005ForSDResponse" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005ForSDSoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005ForSD" />
  </wsdl:message>
  <wsdl:message name="SyncCheckFoodData2005ForSDSoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckFoodData2005ForSDResponse" />
  </wsdl:message>
  <wsdl:message name="SyncMyzlCheckFoodData2005SoapIn">
    <wsdl:part name="parameters" element="tns:SyncMyzlCheckFoodData2005" />
  </wsdl:message>
  <wsdl:message name="SyncMyzlCheckFoodData2005SoapOut">
    <wsdl:part name="parameters" element="tns:SyncMyzlCheckFoodData2005Response" />
  </wsdl:message>
  <wsdl:message name="SyncFoodCheckDataValidate2005SoapIn">
    <wsdl:part name="parameters" element="tns:SyncFoodCheckDataValidate2005" />
  </wsdl:message>
  <wsdl:message name="SyncFoodCheckDataValidate2005SoapOut">
    <wsdl:part name="parameters" element="tns:SyncFoodCheckDataValidate2005Response" />
  </wsdl:message>
  <wsdl:message name="SyncVResultCollectValidateSoapIn">
    <wsdl:part name="parameters" element="tns:SyncVResultCollectValidate" />
  </wsdl:message>
  <wsdl:message name="SyncVResultCollectValidateSoapOut">
    <wsdl:part name="parameters" element="tns:SyncVResultCollectValidateResponse" />
  </wsdl:message>
  <wsdl:message name="SyncFarmsInfoListSoapIn">
    <wsdl:part name="parameters" element="tns:SyncFarmsInfoList" />
  </wsdl:message>
  <wsdl:message name="SyncFarmsInfoListSoapOut">
    <wsdl:part name="parameters" element="tns:SyncFarmsInfoListResponse" />
  </wsdl:message>
  <wsdl:message name="SyncFarmsInfoList2005SoapIn">
    <wsdl:part name="parameters" element="tns:SyncFarmsInfoList2005" />
  </wsdl:message>
  <wsdl:message name="SyncFarmsInfoList2005SoapOut">
    <wsdl:part name="parameters" element="tns:SyncFarmsInfoList2005Response" />
  </wsdl:message>
  <wsdl:message name="SyncCheckDataToServerSoapIn">
    <wsdl:part name="parameters" element="tns:SyncCheckDataToServer" />
  </wsdl:message>
  <wsdl:message name="SyncCheckDataToServerSoapOut">
    <wsdl:part name="parameters" element="tns:SyncCheckDataToServerResponse" />
  </wsdl:message>
  <wsdl:message name="SyncFamrsDataToServerSoapIn">
    <wsdl:part name="parameters" element="tns:SyncFamrsDataToServer" />
  </wsdl:message>
  <wsdl:message name="SyncFamrsDataToServerSoapOut">
    <wsdl:part name="parameters" element="tns:SyncFamrsDataToServerResponse" />
  </wsdl:message>
  <wsdl:message name="SaveIntelligentSoapIn">
    <wsdl:part name="parameters" element="tns:SaveIntelligent" />
  </wsdl:message>
  <wsdl:message name="SaveIntelligentSoapOut">
    <wsdl:part name="parameters" element="tns:SaveIntelligentResponse" />
  </wsdl:message>
  <wsdl:message name="GetResultCollectDataSoapIn">
    <wsdl:part name="parameters" element="tns:GetResultCollectData" />
  </wsdl:message>
  <wsdl:message name="GetResultCollectDataSoapOut">
    <wsdl:part name="parameters" element="tns:GetResultCollectDataResponse" />
  </wsdl:message>
  <wsdl:message name="GetResultCollectDataBetDatesSoapIn">
    <wsdl:part name="parameters" element="tns:GetResultCollectDataBetDates" />
  </wsdl:message>
  <wsdl:message name="GetResultCollectDataBetDatesSoapOut">
    <wsdl:part name="parameters" element="tns:GetResultCollectDataBetDatesResponse" />
  </wsdl:message>
  <wsdl:message name="GetFarmsCheckDataSoapIn">
    <wsdl:part name="parameters" element="tns:GetFarmsCheckData" />
  </wsdl:message>
  <wsdl:message name="GetFarmsCheckDataSoapOut">
    <wsdl:part name="parameters" element="tns:GetFarmsCheckDataResponse" />
  </wsdl:message>
  <wsdl:message name="GetCheckDataByRIDOrFIDSoapIn">
    <wsdl:part name="parameters" element="tns:GetCheckDataByRIDOrFID" />
  </wsdl:message>
  <wsdl:message name="GetCheckDataByRIDOrFIDSoapOut">
    <wsdl:part name="parameters" element="tns:GetCheckDataByRIDOrFIDResponse" />
  </wsdl:message>
  <wsdl:message name="GetFarmsInfoListSoapIn">
    <wsdl:part name="parameters" element="tns:GetFarmsInfoList" />
  </wsdl:message>
  <wsdl:message name="GetFarmsInfoListSoapOut">
    <wsdl:part name="parameters" element="tns:GetFarmsInfoListResponse" />
  </wsdl:message>
  <wsdl:message name="SynMVCRegionDataSoapIn">
    <wsdl:part name="parameters" element="tns:SynMVCRegionData" />
  </wsdl:message>
  <wsdl:message name="SynMVCRegionDataSoapOut">
    <wsdl:part name="parameters" element="tns:SynMVCRegionDataResponse" />
  </wsdl:message>
  <wsdl:message name="SynMVCMenuDataSoapIn">
    <wsdl:part name="parameters" element="tns:SynMVCMenuData" />
  </wsdl:message>
  <wsdl:message name="SynMVCMenuDataSoapOut">
    <wsdl:part name="parameters" element="tns:SynMVCMenuDataResponse" />
  </wsdl:message>
  <wsdl:message name="SynMVCMenuData2SoapIn">
    <wsdl:part name="parameters" element="tns:SynMVCMenuData2" />
  </wsdl:message>
  <wsdl:message name="SynMVCMenuData2SoapOut">
    <wsdl:part name="parameters" element="tns:SynMVCMenuData2Response" />
  </wsdl:message>
  <wsdl:message name="SynPassPortUserAndApplicationSoapIn">
    <wsdl:part name="parameters" element="tns:SynPassPortUserAndApplication" />
  </wsdl:message>
  <wsdl:message name="SynPassPortUserAndApplicationSoapOut">
    <wsdl:part name="parameters" element="tns:SynPassPortUserAndApplicationResponse" />
  </wsdl:message>
  <wsdl:message name="SynPassPortUserGroupUsersSoapIn">
    <wsdl:part name="parameters" element="tns:SynPassPortUserGroupUsers" />
  </wsdl:message>
  <wsdl:message name="SynPassPortUserGroupUsersSoapOut">
    <wsdl:part name="parameters" element="tns:SynPassPortUserGroupUsersResponse" />
  </wsdl:message>
  <wsdl:message name="QueryFMSoapIn">
    <wsdl:part name="parameters" element="tns:QueryFM" />
  </wsdl:message>
  <wsdl:message name="QueryFMSoapOut">
    <wsdl:part name="parameters" element="tns:QueryFMResponse" />
  </wsdl:message>
  <wsdl:message name="QueryLableInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryLableInfo" />
  </wsdl:message>
  <wsdl:message name="QueryLableInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryLableInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryFuboAgriBaseInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryFuboAgriBaseInfo" />
  </wsdl:message>
  <wsdl:message name="QueryFuboAgriBaseInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryFuboAgriBaseInfoResponse" />
  </wsdl:message>
  <wsdl:message name="QueryFuboAgriLableInfoSoapIn">
    <wsdl:part name="parameters" element="tns:QueryFuboAgriLableInfo" />
  </wsdl:message>
  <wsdl:message name="QueryFuboAgriLableInfoSoapOut">
    <wsdl:part name="parameters" element="tns:QueryFuboAgriLableInfoResponse" />
  </wsdl:message>
  <wsdl:portType name="MServiceSoap">
    <wsdl:operation name="GetDicSpecials">
      <wsdl:input message="tns:GetDicSpecialsSoapIn" />
      <wsdl:output message="tns:GetDicSpecialsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetClients">
      <wsdl:input message="tns:GetClientsSoapIn" />
      <wsdl:output message="tns:GetClientsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Save2005FarmSampling">
      <wsdl:input message="tns:Save2005FarmSamplingSoapIn" />
      <wsdl:output message="tns:Save2005FarmSamplingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Check2005SamplingValue">
      <wsdl:input message="tns:Check2005SamplingValueSoapIn" />
      <wsdl:output message="tns:Check2005SamplingValueSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Test">
      <wsdl:input message="tns:TestSoapIn" />
      <wsdl:output message="tns:TestSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData">
      <wsdl:input message="tns:SyncCheckFoodDataSoapIn" />
      <wsdl:output message="tns:SyncCheckFoodDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005">
      <wsdl:input message="tns:SyncCheckFoodData2005SoapIn" />
      <wsdl:output message="tns:SyncCheckFoodData2005SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005_String">
      <wsdl:input message="tns:SyncCheckFoodData2005_StringSoapIn" />
      <wsdl:output message="tns:SyncCheckFoodData2005_StringSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodDataToJnServer">
      <wsdl:input message="tns:SyncCheckFoodDataToJnServerSoapIn" />
      <wsdl:output message="tns:SyncCheckFoodDataToJnServerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005ForSD">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">酶抑制率法检测数据上传所调用方法名称及参数</wsdl:documentation>
      <wsdl:input message="tns:SyncMyzlCheckFoodData2005ForSDSoapIn" />
      <wsdl:output message="tns:SyncMyzlCheckFoodData2005ForSDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005ForSD">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">老版本检测数据上传</wsdl:documentation>
      <wsdl:input message="tns:SyncCheckFoodData2005ForSDSoapIn" />
      <wsdl:output message="tns:SyncCheckFoodData2005ForSDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">酶抑制率法检测数据上传所调用方法名称及参数</wsdl:documentation>
      <wsdl:input message="tns:SyncMyzlCheckFoodData2005SoapIn" />
      <wsdl:output message="tns:SyncMyzlCheckFoodData2005SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncFoodCheckDataValidate2005">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">仅用于数据检测2005(多项检测数据上传,检测单位需要认证)</wsdl:documentation>
      <wsdl:input message="tns:SyncFoodCheckDataValidate2005SoapIn" />
      <wsdl:output message="tns:SyncFoodCheckDataValidate2005SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncVResultCollectValidate">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">仅用于数据检测2005,单项检测数据上传,检测单位需要验证</wsdl:documentation>
      <wsdl:input message="tns:SyncVResultCollectValidateSoapIn" />
      <wsdl:output message="tns:SyncVResultCollectValidateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">其他系统调用此接口上传基地单位信息</wsdl:documentation>
      <wsdl:input message="tns:SyncFarmsInfoListSoapIn" />
      <wsdl:output message="tns:SyncFarmsInfoListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList2005">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">其他系统调用此接口上传基地单位信息</wsdl:documentation>
      <wsdl:input message="tns:SyncFarmsInfoList2005SoapIn" />
      <wsdl:output message="tns:SyncFarmsInfoList2005SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncCheckDataToServer">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">上级单位各子地区调用此接口上传检测数据到总服务器平台</wsdl:documentation>
      <wsdl:input message="tns:SyncCheckDataToServerSoapIn" />
      <wsdl:output message="tns:SyncCheckDataToServerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SyncFamrsDataToServer">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">上级各子地区调用此接口上传单位信息到总服务器平台</wsdl:documentation>
      <wsdl:input message="tns:SyncFamrsDataToServerSoapIn" />
      <wsdl:output message="tns:SyncFamrsDataToServerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SaveIntelligent">
      <wsdl:input message="tns:SaveIntelligentSoapIn" />
      <wsdl:output message="tns:SaveIntelligentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取指定地区特定时间段内的检测数据列表</wsdl:documentation>
      <wsdl:input message="tns:GetResultCollectDataSoapIn" />
      <wsdl:output message="tns:GetResultCollectDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectDataBetDates">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">广州系统使用 --获取指定地区特定时间段内的检测数据列表</wsdl:documentation>
      <wsdl:input message="tns:GetResultCollectDataBetDatesSoapIn" />
      <wsdl:output message="tns:GetResultCollectDataBetDatesSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFarmsCheckData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取指定检测单位的检测数据</wsdl:documentation>
      <wsdl:input message="tns:GetFarmsCheckDataSoapIn" />
      <wsdl:output message="tns:GetFarmsCheckDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetCheckDataByRIDOrFID">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取指定检测单位或指定地区的检测数据</wsdl:documentation>
      <wsdl:input message="tns:GetCheckDataByRIDOrFIDSoapIn" />
      <wsdl:output message="tns:GetCheckDataByRIDOrFIDSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetFarmsInfoList">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取指定地区下面的生产企业信息列表</wsdl:documentation>
      <wsdl:input message="tns:GetFarmsInfoListSoapIn" />
      <wsdl:output message="tns:GetFarmsInfoListSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SynMVCRegionData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">同步地区(新版MVC项目地区)</wsdl:documentation>
      <wsdl:input message="tns:SynMVCRegionDataSoapIn" />
      <wsdl:output message="tns:SynMVCRegionDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">同步菜单(新版MVC项目菜单)</wsdl:documentation>
      <wsdl:input message="tns:SynMVCMenuDataSoapIn" />
      <wsdl:output message="tns:SynMVCMenuDataSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData2">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">同步菜单(新版MVC项目菜单)</wsdl:documentation>
      <wsdl:input message="tns:SynMVCMenuData2SoapIn" />
      <wsdl:output message="tns:SynMVCMenuData2SoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserAndApplication">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">同步PassPort 用户和应用程序关联表)</wsdl:documentation>
      <wsdl:input message="tns:SynPassPortUserAndApplicationSoapIn" />
      <wsdl:output message="tns:SynPassPortUserAndApplicationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserGroupUsers">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">同步PassPort用户与组关联表)</wsdl:documentation>
      <wsdl:input message="tns:SynPassPortUserGroupUsersSoapIn" />
      <wsdl:output message="tns:SynPassPortUserGroupUsersSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryFM">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据农资登记证号从中国农资信息网官网获取相关信息</wsdl:documentation>
      <wsdl:input message="tns:QueryFMSoapIn" />
      <wsdl:output message="tns:QueryFMSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryLableInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">根据农资登记证号从中国农资信息网官网获取相关标签信息</wsdl:documentation>
      <wsdl:input message="tns:QueryLableInfoSoapIn" />
      <wsdl:output message="tns:QueryLableInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriBaseInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取复博农资库农资基本信息)</wsdl:documentation>
      <wsdl:input message="tns:QueryFuboAgriBaseInfoSoapIn" />
      <wsdl:output message="tns:QueryFuboAgriBaseInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriLableInfo">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">获取复博农资库农资标签信息)</wsdl:documentation>
      <wsdl:input message="tns:QueryFuboAgriLableInfoSoapIn" />
      <wsdl:output message="tns:QueryFuboAgriLableInfoSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="MServiceSoap" type="tns:MServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetDicSpecials">
      <soap:operation soapAction="http://tempuri.org/GetDicSpecials" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClients">
      <soap:operation soapAction="http://tempuri.org/GetClients" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Save2005FarmSampling">
      <soap:operation soapAction="http://tempuri.org/Save2005FarmSampling" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Check2005SamplingValue">
      <soap:operation soapAction="http://tempuri.org/Check2005SamplingValue" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Test">
      <soap:operation soapAction="http://tempuri.org/Test" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData">
      <soap:operation soapAction="http://tempuri.org/SyncCheckFoodData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005">
      <soap:operation soapAction="http://tempuri.org/SyncCheckFoodData2005" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005_String">
      <soap:operation soapAction="http://tempuri.org/SyncCheckFoodData2005_String" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodDataToJnServer">
      <soap:operation soapAction="http://tempuri.org/SyncCheckFoodDataToJnServer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005ForSD">
      <soap:operation soapAction="http://tempuri.org/SyncMyzlCheckFoodData2005ForSD" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005ForSD">
      <soap:operation soapAction="http://tempuri.org/SyncCheckFoodData2005ForSD" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005">
      <soap:operation soapAction="http://tempuri.org/SyncMyzlCheckFoodData2005" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFoodCheckDataValidate2005">
      <soap:operation soapAction="http://tempuri.org/SyncFoodCheckDataValidate2005" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncVResultCollectValidate">
      <soap:operation soapAction="http://tempuri.org/SyncVResultCollectValidate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList">
      <soap:operation soapAction="http://tempuri.org/SyncFarmsInfoList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList2005">
      <soap:operation soapAction="http://tempuri.org/SyncFarmsInfoList2005" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckDataToServer">
      <soap:operation soapAction="http://tempuri.org/SyncCheckDataToServer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFamrsDataToServer">
      <soap:operation soapAction="http://tempuri.org/SyncFamrsDataToServer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveIntelligent">
      <soap:operation soapAction="http://tempuri.org/SaveIntelligent" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectData">
      <soap:operation soapAction="http://tempuri.org/GetResultCollectData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectDataBetDates">
      <soap:operation soapAction="http://tempuri.org/GetResultCollectDataBetDates" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFarmsCheckData">
      <soap:operation soapAction="http://tempuri.org/GetFarmsCheckData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCheckDataByRIDOrFID">
      <soap:operation soapAction="http://tempuri.org/GetCheckDataByRIDOrFID" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFarmsInfoList">
      <soap:operation soapAction="http://tempuri.org/GetFarmsInfoList" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCRegionData">
      <soap:operation soapAction="http://tempuri.org/SynMVCRegionData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData">
      <soap:operation soapAction="http://tempuri.org/SynMVCMenuData" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData2">
      <soap:operation soapAction="http://tempuri.org/SynMVCMenuData2" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserAndApplication">
      <soap:operation soapAction="http://tempuri.org/SynPassPortUserAndApplication" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserGroupUsers">
      <soap:operation soapAction="http://tempuri.org/SynPassPortUserGroupUsers" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFM">
      <soap:operation soapAction="http://tempuri.org/QueryFM" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryLableInfo">
      <soap:operation soapAction="http://tempuri.org/QueryLableInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriBaseInfo">
      <soap:operation soapAction="http://tempuri.org/QueryFuboAgriBaseInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriLableInfo">
      <soap:operation soapAction="http://tempuri.org/QueryFuboAgriLableInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="MServiceSoap12" type="tns:MServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetDicSpecials">
      <soap12:operation soapAction="http://tempuri.org/GetDicSpecials" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetClients">
      <soap12:operation soapAction="http://tempuri.org/GetClients" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Save2005FarmSampling">
      <soap12:operation soapAction="http://tempuri.org/Save2005FarmSampling" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Check2005SamplingValue">
      <soap12:operation soapAction="http://tempuri.org/Check2005SamplingValue" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Test">
      <soap12:operation soapAction="http://tempuri.org/Test" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckFoodData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckFoodData2005" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005_String">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckFoodData2005_String" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodDataToJnServer">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckFoodDataToJnServer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005ForSD">
      <soap12:operation soapAction="http://tempuri.org/SyncMyzlCheckFoodData2005ForSD" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckFoodData2005ForSD">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckFoodData2005ForSD" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncMyzlCheckFoodData2005">
      <soap12:operation soapAction="http://tempuri.org/SyncMyzlCheckFoodData2005" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFoodCheckDataValidate2005">
      <soap12:operation soapAction="http://tempuri.org/SyncFoodCheckDataValidate2005" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncVResultCollectValidate">
      <soap12:operation soapAction="http://tempuri.org/SyncVResultCollectValidate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList">
      <soap12:operation soapAction="http://tempuri.org/SyncFarmsInfoList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFarmsInfoList2005">
      <soap12:operation soapAction="http://tempuri.org/SyncFarmsInfoList2005" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncCheckDataToServer">
      <soap12:operation soapAction="http://tempuri.org/SyncCheckDataToServer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SyncFamrsDataToServer">
      <soap12:operation soapAction="http://tempuri.org/SyncFamrsDataToServer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SaveIntelligent">
      <soap12:operation soapAction="http://tempuri.org/SaveIntelligent" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectData">
      <soap12:operation soapAction="http://tempuri.org/GetResultCollectData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetResultCollectDataBetDates">
      <soap12:operation soapAction="http://tempuri.org/GetResultCollectDataBetDates" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFarmsCheckData">
      <soap12:operation soapAction="http://tempuri.org/GetFarmsCheckData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetCheckDataByRIDOrFID">
      <soap12:operation soapAction="http://tempuri.org/GetCheckDataByRIDOrFID" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetFarmsInfoList">
      <soap12:operation soapAction="http://tempuri.org/GetFarmsInfoList" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCRegionData">
      <soap12:operation soapAction="http://tempuri.org/SynMVCRegionData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData">
      <soap12:operation soapAction="http://tempuri.org/SynMVCMenuData" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynMVCMenuData2">
      <soap12:operation soapAction="http://tempuri.org/SynMVCMenuData2" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserAndApplication">
      <soap12:operation soapAction="http://tempuri.org/SynPassPortUserAndApplication" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SynPassPortUserGroupUsers">
      <soap12:operation soapAction="http://tempuri.org/SynPassPortUserGroupUsers" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFM">
      <soap12:operation soapAction="http://tempuri.org/QueryFM" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryLableInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryLableInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriBaseInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryFuboAgriBaseInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="QueryFuboAgriLableInfo">
      <soap12:operation soapAction="http://tempuri.org/QueryFuboAgriLableInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="MService">
    <wsdl:port name="MServiceSoap" binding="tns:MServiceSoap">
      <soap:address location="http://121.41.122.62/WebService/MService.asmx" />
    </wsdl:port>
    <wsdl:port name="MServiceSoap12" binding="tns:MServiceSoap12">
      <soap12:address location="http://121.41.122.62/WebService/MService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>