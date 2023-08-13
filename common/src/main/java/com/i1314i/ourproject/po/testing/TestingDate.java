package com.i1314i.ourproject.po.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-10-23 15:38
 **/
public class TestingDate {
    private Integer dateId;
    private String productType; //产品小类
    private String sampleName;  //样品
    private String detectionProject;//检测项目
    private double measuredValue;//实测值
    private String conclusion;//结论
    private String testingCompany;//检测公司
    private String placeOfOrigin;//产地
    private Date testingTime;//检测时间
    private String result;//处理结果
    private String testingTimes;//检测时间

    public String getTestingTimes() {
        return testingTimes;
    }

    public void setTestingTimes(String testingTimes) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      this.testingTimes=format.format(testingTime);
    }


    //    public TestingDate() {
//        testingTime=new Date();
//    }

//    public void setTestingTimes(String testingTimes) {
//        this.testingTimes = testingTimes;
//    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public String getDetectionProject() {
        return detectionProject;
    }

    public void setDetectionProject(String detectionProject) {
        this.detectionProject = detectionProject;
    }

    public double getMeasuredValue() {
        return measuredValue;
    }

    public void setMeasuredValue(double measuredValue) {
        this.measuredValue = measuredValue;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getTestingCompany() {
        return testingCompany;
    }

    public void setTestingCompany(String testingCompany) {
        this.testingCompany = testingCompany;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public Integer getDateId() {
        return dateId;
    }

    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

//    public Date getTestingTime() {
////        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////        return format.format(testingTime);
//        return testingTime;
//    }

    public String getTestingTime() {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(testingTime);
//        return testingTime;
    }

    public void setTestingTime(Date testingTime) {
        this.testingTime = testingTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TestingDate that = (TestingDate) o;
        if (Double.compare(that.measuredValue, measuredValue) != 0) return false;

        if (productType != null ? !productType.equals(that.productType) : that.productType != null) return false;
        if (sampleName != null ? !sampleName.equals(that.sampleName) : that.sampleName != null) return false;
        if (detectionProject != null ? !detectionProject.equals(that.detectionProject) : that.detectionProject != null)
            return false;
        if (conclusion != null ? !conclusion.equals(that.conclusion) : that.conclusion != null) return false;
        if (testingCompany != null ? !testingCompany.equals(that.testingCompany) : that.testingCompany != null)
            return false;
        if (placeOfOrigin != null ? !placeOfOrigin.equals(that.placeOfOrigin) : that.placeOfOrigin != null)
            return false;
        if (testingTime != null ? !testingTime.equals(that.testingTime) : that.testingTime != null) return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        return testingTimes != null ? testingTimes.equals(that.testingTimes) : that.testingTimes == null;
    }

    @Override
    public int hashCode() {
        int result1;
        long temp;
        result1 = dateId != null ? dateId.hashCode() : 0;
        result1 = 31 * result1 + (productType != null ? productType.hashCode() : 0);
        result1 = 31 * result1 + (sampleName != null ? sampleName.hashCode() : 0);
        result1 = 31 * result1 + (detectionProject != null ? detectionProject.hashCode() : 0);
        temp = Double.doubleToLongBits(measuredValue);
        result1 = 31 * result1 + (int) (temp ^ (temp >>> 32));
        result1 = 31 * result1 + (conclusion != null ? conclusion.hashCode() : 0);
        result1 = 31 * result1 + (testingCompany != null ? testingCompany.hashCode() : 0);
        result1 = 31 * result1 + (placeOfOrigin != null ? placeOfOrigin.hashCode() : 0);
        result1 = 31 * result1 + (testingTime != null ? testingTime.hashCode() : 0);
        result1 = 31 * result1 + (result != null ? result.hashCode() : 0);
        result1 = 31 * result1 + (testingTimes != null ? testingTimes.hashCode() : 0);
        return result1;
    }
}
