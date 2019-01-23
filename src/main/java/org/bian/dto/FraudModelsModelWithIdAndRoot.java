package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsModelWithIdAndRoot
 */
public class FraudModelsModelWithIdAndRoot   {
  private Object fraudModelPortfolioRecord = null;

  private String fraudModelModelReference = null;

  private String fraudModelModelType = null;

  private String fraudModelModelPurpose = null;

  private String fraudModelModelStatus = null;

  private String fraudModelModelUsage = null;

  private String fraudModelModelImpact = null;

  private String fraudModelModelBudget = null;

  private String fraudModelModelVersion = null;

  private String fraudModelModel = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: record of all models usage and performance statistics 
   * @return fraudModelPortfolioRecord
  **/

  public Object getFraudModelPortfolioRecord() {
    return fraudModelPortfolioRecord;
  }

  public void setFraudModelPortfolioRecord(Object fraudModelPortfolioRecord) {
    this.fraudModelPortfolioRecord = fraudModelPortfolioRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: this is the master reference 
   * @return fraudModelModelReference
  **/

  public String getFraudModelModelReference() {
    return fraudModelModelReference;
  }

  public void setFraudModelModelReference(String fraudModelModelReference) {
    this.fraudModelModelReference = fraudModelModelReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: defines fraud detection/analysis/insights provided 
   * @return fraudModelModelPurpose
  **/

  public String getFraudModelModelPurpose() {
    return fraudModelModelPurpose;
  }

  public void setFraudModelModelPurpose(String fraudModelModelPurpose) {
    this.fraudModelModelPurpose = fraudModelModelPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: e.g. under development, in-force, suspended 
   * @return fraudModelModelStatus
  **/

  public String getFraudModelModelStatus() {
    return fraudModelModelStatus;
  }

  public void setFraudModelModelStatus(String fraudModelModelStatus) {
    this.fraudModelModelStatus = fraudModelModelStatus;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records impact/accuracy of model insights 
   * @return fraudModelModelImpact
  **/

  public String getFraudModelModelImpact() {
    return fraudModelModelImpact;
  }

  public void setFraudModelModelImpact(String fraudModelModelImpact) {
    this.fraudModelModelImpact = fraudModelModelImpact;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records time/effort on design/development by version/date 
   * @return fraudModelModelBudget
  **/

  public String getFraudModelModelBudget() {
    return fraudModelModelBudget;
  }

  public void setFraudModelModelBudget(String fraudModelModelBudget) {
    this.fraudModelModelBudget = fraudModelModelBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: release version of available model 
   * @return fraudModelModelVersion
  **/

  public String getFraudModelModelVersion() {
    return fraudModelModelVersion;
  }

  public void setFraudModelModelVersion(String fraudModelModelVersion) {
    this.fraudModelModelVersion = fraudModelModelVersion;
  }


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


}

