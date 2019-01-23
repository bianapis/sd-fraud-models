/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudModelsApiService {

	FraudModelRecordResponse record(String crReferenceId, FraudModelRecordRequest request);
	
	FraudModelsDeploymentWithIdAndRoot requestPostDeployments(String crReferenceId, FraudModelsDeploymentBase request);
	
	FraudModelsDeploymentWithIdAndRoot requestPutDeployments(String crReferenceId, String bqReferenceId, FraudModelsDeploymentBase request);
	
	FraudModelsModelWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	FraudModelsComplianceWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId);
	
	FraudModelsDeploymentWithIdAndRoot retrieveDeployments(String crReferenceId, String bqReferenceId);
	
	FraudModelsDesignWithIdAndRoot retrieveDesigns(String crReferenceId, String bqReferenceId);
	
	FraudModelsImplementationWithIdAndRoot retrieveImplementations(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	FraudModelsTestingWithIdAndRoot retrieveTestings(String crReferenceId, String bqReferenceId);
	
	FraudModelsDesignWithIdAndRoot updateDesigns(String crReferenceId, String bqReferenceId, FraudModelsDesignBase request);
	
}
