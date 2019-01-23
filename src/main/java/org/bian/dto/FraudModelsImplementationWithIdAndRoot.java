package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsImplementationWithIdAndRoot
 */
public class FraudModelsImplementationWithIdAndRoot   {
  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private String fraudModelModelImplementationTaskReference = null;

  private Object fraudModelModelImplementationTaskRecord = null;

  private String fraudModelModelType = null;

  private String fraudModelModelDevelopmentTaskReference = null;

  private String fraudModelModelDevelopmentTaskDescription = null;

  private String fraudModelModelDevelopmentTaskBudget = null;

  private String fraudModelModelDevelopmentTaskOrganization = null;

  private String fraudModelModelDevelopmentTaskStatus = null;

  private String fraudModelModelDevelopmentTaskDeliverable = null;

  private String fraudModelModelStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to implementation activity 
   * @return fraudModelModelImplementationTaskReference
  **/

  public String getFraudModelModelImplementationTaskReference() {
    return fraudModelModelImplementationTaskReference;
  }

  public void setFraudModelModelImplementationTaskReference(String fraudModelModelImplementationTaskReference) {
    this.fraudModelModelImplementationTaskReference = fraudModelModelImplementationTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details/tracking the implementation activity 
   * @return fraudModelModelImplementationTaskRecord
  **/

  public Object getFraudModelModelImplementationTaskRecord() {
    return fraudModelModelImplementationTaskRecord;
  }

  public void setFraudModelModelImplementationTaskRecord(Object fraudModelModelImplementationTaskRecord) {
    this.fraudModelModelImplementationTaskRecord = fraudModelModelImplementationTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Fraud Model Model Development Task Reference 
   * @return fraudModelModelDevelopmentTaskReference
  **/

  public String getFraudModelModelDevelopmentTaskReference() {
    return fraudModelModelDevelopmentTaskReference;
  }

  public void setFraudModelModelDevelopmentTaskReference(String fraudModelModelDevelopmentTaskReference) {
    this.fraudModelModelDevelopmentTaskReference = fraudModelModelDevelopmentTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Development Task Description 
   * @return fraudModelModelDevelopmentTaskDescription
  **/

  public String getFraudModelModelDevelopmentTaskDescription() {
    return fraudModelModelDevelopmentTaskDescription;
  }

  public void setFraudModelModelDevelopmentTaskDescription(String fraudModelModelDevelopmentTaskDescription) {
    this.fraudModelModelDevelopmentTaskDescription = fraudModelModelDevelopmentTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: time/effort planned/actual 
   * @return fraudModelModelDevelopmentTaskBudget
  **/

  public String getFraudModelModelDevelopmentTaskBudget() {
    return fraudModelModelDevelopmentTaskBudget;
  }

  public void setFraudModelModelDevelopmentTaskBudget(String fraudModelModelDevelopmentTaskBudget) {
    this.fraudModelModelDevelopmentTaskBudget = fraudModelModelDevelopmentTaskBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Development Task Organization 
   * @return fraudModelModelDevelopmentTaskOrganization
  **/

  public String getFraudModelModelDevelopmentTaskOrganization() {
    return fraudModelModelDevelopmentTaskOrganization;
  }

  public void setFraudModelModelDevelopmentTaskOrganization(String fraudModelModelDevelopmentTaskOrganization) {
    this.fraudModelModelDevelopmentTaskOrganization = fraudModelModelDevelopmentTaskOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Development Task Status 
   * @return fraudModelModelDevelopmentTaskStatus
  **/

  public String getFraudModelModelDevelopmentTaskStatus() {
    return fraudModelModelDevelopmentTaskStatus;
  }

  public void setFraudModelModelDevelopmentTaskStatus(String fraudModelModelDevelopmentTaskStatus) {
    this.fraudModelModelDevelopmentTaskStatus = fraudModelModelDevelopmentTaskStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Fraud Model Model Development Task Deliverable 
   * @return fraudModelModelDevelopmentTaskDeliverable
  **/

  public String getFraudModelModelDevelopmentTaskDeliverable() {
    return fraudModelModelDevelopmentTaskDeliverable;
  }

  public void setFraudModelModelDevelopmentTaskDeliverable(String fraudModelModelDevelopmentTaskDeliverable) {
    this.fraudModelModelDevelopmentTaskDeliverable = fraudModelModelDevelopmentTaskDeliverable;
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


}

