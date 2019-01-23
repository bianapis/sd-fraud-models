package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsTestingWithIdAndRoot
 */
public class FraudModelsTestingWithIdAndRoot   {
  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private String fraudModelModelTestingTaskReference = null;

  private Object fraudModelModelTestingTaskRecord = null;

  private String fraudModelModelType = null;

  private String fraudModelModelTestReference = null;

  private String fraudModelModelTestType = null;

  private String fraudModelModelTestHarnessReference = null;

  private String fraudModelModelTestResult = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to testing activity 
   * @return fraudModelModelTestingTaskReference
  **/

  public String getFraudModelModelTestingTaskReference() {
    return fraudModelModelTestingTaskReference;
  }

  public void setFraudModelModelTestingTaskReference(String fraudModelModelTestingTaskReference) {
    this.fraudModelModelTestingTaskReference = fraudModelModelTestingTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details/tracking the testing activity 
   * @return fraudModelModelTestingTaskRecord
  **/

  public Object getFraudModelModelTestingTaskRecord() {
    return fraudModelModelTestingTaskRecord;
  }

  public void setFraudModelModelTestingTaskRecord(Object fraudModelModelTestingTaskRecord) {
    this.fraudModelModelTestingTaskRecord = fraudModelModelTestingTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Fraud Model Model Test Reference 
   * @return fraudModelModelTestReference
  **/

  public String getFraudModelModelTestReference() {
    return fraudModelModelTestReference;
  }

  public void setFraudModelModelTestReference(String fraudModelModelTestReference) {
    this.fraudModelModelTestReference = fraudModelModelTestReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: unit, integration, load, acceptance etc. 
   * @return fraudModelModelTestType
  **/

  public String getFraudModelModelTestType() {
    return fraudModelModelTestType;
  }

  public void setFraudModelModelTestType(String fraudModelModelTestType) {
    this.fraudModelModelTestType = fraudModelModelTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: testing environment 
   * @return fraudModelModelTestHarnessReference
  **/

  public String getFraudModelModelTestHarnessReference() {
    return fraudModelModelTestHarnessReference;
  }

  public void setFraudModelModelTestHarnessReference(String fraudModelModelTestHarnessReference) {
    this.fraudModelModelTestHarnessReference = fraudModelModelTestHarnessReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: errors result in further design/implementation 
   * @return fraudModelModelTestResult
  **/

  public String getFraudModelModelTestResult() {
    return fraudModelModelTestResult;
  }

  public void setFraudModelModelTestResult(String fraudModelModelTestResult) {
    this.fraudModelModelTestResult = fraudModelModelTestResult;
  }


}

