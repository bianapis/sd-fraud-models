/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudModelsApiServiceImpl implements FraudModelsApiService {

	public FraudModelRecordResponse record(String crReferenceId, FraudModelRecordRequest request){
		return JsonReader.read("record-FraudModelRecordResponse.json",new TypeReference<FraudModelRecordResponse>(){});
	}
	
	public FraudModelsDeploymentWithIdAndRoot requestPostDeployments(String crReferenceId, FraudModelsDeploymentBase request){
		return JsonReader.read("requestPost-FraudModelsDeploymentWithIdAndRoot.json",new TypeReference<FraudModelsDeploymentWithIdAndRoot>(){});
	}
	
	public FraudModelsDeploymentWithIdAndRoot requestPutDeployments(String crReferenceId, String bqReferenceId, FraudModelsDeploymentBase request){
		return JsonReader.read("requestPut-FraudModelsDeploymentWithIdAndRoot.json",new TypeReference<FraudModelsDeploymentWithIdAndRoot>(){});
	}
	
	public FraudModelsModelWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-FraudModelsModelWithIdAndRoot.json",new TypeReference<FraudModelsModelWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public FraudModelsComplianceWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudModelsComplianceWithIdAndRoot.json",new TypeReference<FraudModelsComplianceWithIdAndRoot>(){});
	}
	
	public FraudModelsDeploymentWithIdAndRoot retrieveDeployments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudModelsDeploymentWithIdAndRoot.json",new TypeReference<FraudModelsDeploymentWithIdAndRoot>(){});
	}
	
	public FraudModelsDesignWithIdAndRoot retrieveDesigns(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudModelsDesignWithIdAndRoot.json",new TypeReference<FraudModelsDesignWithIdAndRoot>(){});
	}
	
	public FraudModelsImplementationWithIdAndRoot retrieveImplementations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudModelsImplementationWithIdAndRoot.json",new TypeReference<FraudModelsImplementationWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public FraudModelsTestingWithIdAndRoot retrieveTestings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FraudModelsTestingWithIdAndRoot.json",new TypeReference<FraudModelsTestingWithIdAndRoot>(){});
	}
	
	public FraudModelsDesignWithIdAndRoot updateDesigns(String crReferenceId, String bqReferenceId, FraudModelsDesignBase request){
		return JsonReader.read("update-FraudModelsDesignWithIdAndRoot.json",new TypeReference<FraudModelsDesignWithIdAndRoot>(){});
	}
	
}
