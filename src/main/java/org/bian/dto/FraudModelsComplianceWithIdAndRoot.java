package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FraudModelsComplianceWithIdAndRoot
 */
public class FraudModelsComplianceWithIdAndRoot   {
  private String fraudModelModelReference = null;

  private String fraudModelModel = null;

  private String fraudModelModelComplianceTaskReference = null;

  private Object fraudModelModelComplianceTaskRecord = null;

  private String fraudModelModelType = null;

  private String complianceTestReference = null;

  private String complianceTestType = null;

  private String complianceTestResult = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: reference to compliance checking activity 
   * @return fraudModelModelComplianceTaskReference
  **/

  public String getFraudModelModelComplianceTaskReference() {
    return fraudModelModelComplianceTaskReference;
  }

  public void setFraudModelModelComplianceTaskReference(String fraudModelModelComplianceTaskReference) {
    this.fraudModelModelComplianceTaskReference = fraudModelModelComplianceTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: details/tracking the compliance checking activity 
   * @return fraudModelModelComplianceTaskRecord
  **/

  public Object getFraudModelModelComplianceTaskRecord() {
    return fraudModelModelComplianceTaskRecord;
  }

  public void setFraudModelModelComplianceTaskRecord(Object fraudModelModelComplianceTaskRecord) {
    this.fraudModelModelComplianceTaskRecord = fraudModelModelComplianceTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Compliance Test Reference 
   * @return complianceTestReference
  **/

  public String getComplianceTestReference() {
    return complianceTestReference;
  }

  public void setComplianceTestReference(String complianceTestReference) {
    this.complianceTestReference = complianceTestReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Compliance Test Type 
   * @return complianceTestType
  **/

  public String getComplianceTestType() {
    return complianceTestType;
  }

  public void setComplianceTestType(String complianceTestType) {
    this.complianceTestType = complianceTestType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: failure results in further design/development 
   * @return complianceTestResult
  **/

  public String getComplianceTestResult() {
    return complianceTestResult;
  }

  public void setComplianceTestResult(String complianceTestResult) {
    this.complianceTestResult = complianceTestResult;
  }


}

