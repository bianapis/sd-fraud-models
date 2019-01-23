package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsDeploymentWithIdAndRoot
 */
public class FraudModelsDeploymentWithIdAndRoot   {
  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private String fraudModelModelDeploymentTaskReference = null;

  private Object fraudModelModelDeploymentTaskRecord = null;

  private String employeeBusinessUnitReference = null;

  private String fraudModelModelVersion = null;

  private String fraudModelModelDeploymentStatus = null;

  private String fraudModelModelUsage = null;

  private String fraudModelModelDeploymentTaskResult = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to deployment task 
   * @return fraudModelModelDeploymentTaskReference
  **/

  public String getFraudModelModelDeploymentTaskReference() {
    return fraudModelModelDeploymentTaskReference;
  }

  public void setFraudModelModelDeploymentTaskReference(String fraudModelModelDeploymentTaskReference) {
    this.fraudModelModelDeploymentTaskReference = fraudModelModelDeploymentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details/tracking the deployment activity 
   * @return fraudModelModelDeploymentTaskRecord
  **/

  public Object getFraudModelModelDeploymentTaskRecord() {
    return fraudModelModelDeploymentTaskRecord;
  }

  public void setFraudModelModelDeploymentTaskRecord(Object fraudModelModelDeploymentTaskRecord) {
    this.fraudModelModelDeploymentTaskRecord = fraudModelModelDeploymentTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: the unit requesting the deployment 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Version 
   * @return fraudModelModelVersion
  **/

  public String getFraudModelModelVersion() {
    return fraudModelModelVersion;
  }

  public void setFraudModelModelVersion(String fraudModelModelVersion) {
    this.fraudModelModelVersion = fraudModelModelVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: tracks completion of deployment actions 
   * @return fraudModelModelDeploymentStatus
  **/

  public String getFraudModelModelDeploymentStatus() {
    return fraudModelModelDeploymentStatus;
  }

  public void setFraudModelModelDeploymentStatus(String fraudModelModelDeploymentStatus) {
    this.fraudModelModelDeploymentStatus = fraudModelModelDeploymentStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: records number of production deployments 
   * @return fraudModelModelUsage
  **/

  public String getFraudModelModelUsage() {
    return fraudModelModelUsage;
  }

  public void setFraudModelModelUsage(String fraudModelModelUsage) {
    this.fraudModelModelUsage = fraudModelModelUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Deployment Task Result 
   * @return fraudModelModelDeploymentTaskResult
  **/

  public String getFraudModelModelDeploymentTaskResult() {
    return fraudModelModelDeploymentTaskResult;
  }

  public void setFraudModelModelDeploymentTaskResult(String fraudModelModelDeploymentTaskResult) {
    this.fraudModelModelDeploymentTaskResult = fraudModelModelDeploymentTaskResult;
  }


}

