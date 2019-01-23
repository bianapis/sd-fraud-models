package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsDesignBase
 */
public class FraudModelsDesignBase   {
  private String fraudModelModel = null;

  private Object fraudModelModelDesignTaskRecord = null;

  private String customerMarketDataServiceReference = null;

  private String customerMarketDataReference = null;

  private String productServiceActivityReportReference = null;

  private Object productServiceActivityReport = null;

  private String fraudModelModelType = null;

  private String fraudModelModelUsage = null;

  private String fraudModelModelImpact = null;

  private Object fraudModelModelFeedbackRecord = null;

  private String fraudModelModelSpecification = null;

  private String fraudModelModelOperationalRequirements = null;

  private String fraudModelModelAllowedUsage = null;

  private String fraudModelModelUsageGuidelines = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: this is the executable model specificaion 
   * @return fraudModelModel
  **/

  public String getFraudModelModel() {
    return fraudModelModel;
  }

  public void setFraudModelModel(String fraudModelModel) {
    this.fraudModelModel = fraudModelModel;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details/tracking the design activity 
   * @return fraudModelModelDesignTaskRecord
  **/

  public Object getFraudModelModelDesignTaskRecord() {
    return fraudModelModelDesignTaskRecord;
  }

  public void setFraudModelModelDesignTaskRecord(Object fraudModelModelDesignTaskRecord) {
    this.fraudModelModelDesignTaskRecord = fraudModelModelDesignTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: service providers of example market research and production data 
   * @return customerMarketDataServiceReference
  **/

  public String getCustomerMarketDataServiceReference() {
    return customerMarketDataServiceReference;
  }

  public void setCustomerMarketDataServiceReference(String customerMarketDataServiceReference) {
    this.customerMarketDataServiceReference = customerMarketDataServiceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: example market research/production data file 
   * @return customerMarketDataReference
  **/

  public String getCustomerMarketDataReference() {
    return customerMarketDataReference;
  }

  public void setCustomerMarketDataReference(String customerMarketDataReference) {
    this.customerMarketDataReference = customerMarketDataReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: internal bank activity report - used for development  
   * @return productServiceActivityReportReference
  **/

  public String getProductServiceActivityReportReference() {
    return productServiceActivityReportReference;
  }

  public void setProductServiceActivityReportReference(String productServiceActivityReportReference) {
    this.productServiceActivityReportReference = productServiceActivityReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: data file/report of production activity 
   * @return productServiceActivityReport
  **/

  public Object getProductServiceActivityReport() {
    return productServiceActivityReport;
  }

  public void setProductServiceActivityReport(Object productServiceActivityReport) {
    this.productServiceActivityReport = productServiceActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Type 
   * @return fraudModelModelType
  **/

  public String getFraudModelModelType() {
    return fraudModelModelType;
  }

  public void setFraudModelModelType(String fraudModelModelType) {
    this.fraudModelModelType = fraudModelModelType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records number of production deployments and frequency of execution 
   * @return fraudModelModelUsage
  **/

  public String getFraudModelModelUsage() {
    return fraudModelModelUsage;
  }

  public void setFraudModelModelUsage(String fraudModelModelUsage) {
    this.fraudModelModelUsage = fraudModelModelUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: reported impact/accuracy of model 
   * @return fraudModelModelImpact
  **/

  public String getFraudModelModelImpact() {
    return fraudModelModelImpact;
  }

  public void setFraudModelModelImpact(String fraudModelModelImpact) {
    this.fraudModelModelImpact = fraudModelModelImpact;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: user provided feedback/suggestions 
   * @return fraudModelModelFeedbackRecord
  **/

  public Object getFraudModelModelFeedbackRecord() {
    return fraudModelModelFeedbackRecord;
  }

  public void setFraudModelModelFeedbackRecord(Object fraudModelModelFeedbackRecord) {
    this.fraudModelModelFeedbackRecord = fraudModelModelFeedbackRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: design - inputs, calculations, outputs  
   * @return fraudModelModelSpecification
  **/

  public String getFraudModelModelSpecification() {
    return fraudModelModelSpecification;
  }

  public void setFraudModelModelSpecification(String fraudModelModelSpecification) {
    this.fraudModelModelSpecification = fraudModelModelSpecification;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines operational and technical requirements 
   * @return fraudModelModelOperationalRequirements
  **/

  public String getFraudModelModelOperationalRequirements() {
    return fraudModelModelOperationalRequirements;
  }

  public void setFraudModelModelOperationalRequirements(String fraudModelModelOperationalRequirements) {
    this.fraudModelModelOperationalRequirements = fraudModelModelOperationalRequirements;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines when/where model can be used 
   * @return fraudModelModelAllowedUsage
  **/

  public String getFraudModelModelAllowedUsage() {
    return fraudModelModelAllowedUsage;
  }

  public void setFraudModelModelAllowedUsage(String fraudModelModelAllowedUsage) {
    this.fraudModelModelAllowedUsage = fraudModelModelAllowedUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: guidance on usage and result interpretation 
   * @return fraudModelModelUsageGuidelines
  **/

  public String getFraudModelModelUsageGuidelines() {
    return fraudModelModelUsageGuidelines;
  }

  public void setFraudModelModelUsageGuidelines(String fraudModelModelUsageGuidelines) {
    this.fraudModelModelUsageGuidelines = fraudModelModelUsageGuidelines;
  }


}

