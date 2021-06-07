package com.banking.app.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.banking.app.model.ApiResponse;
import com.banking.app.model.ApiStatus;
import com.banking.app.model.BankingTransaction;
import com.banking.app.model.EmptyResponse;
import com.banking.app.model.Metadata;
import com.banking.app.model.ValidationFailException;


@RestController
@RequestMapping(value="/banking")
public class BankingResource {
	private static Logger logger = LoggerFactory.getLogger(BankingResource.class);
	
	@Autowired
	IBankingService bankingService;
	
	@RequestMapping(method=RequestMethod.POST,value="/transaction")
	public ResponseEntity<ApiResponse<EmptyResponse>> saveTransaction(@RequestBody BankingTransaction request){
		Long ts =System.currentTimeMillis();
		ApiResponse<EmptyResponse> response = new  ApiResponse<EmptyResponse>();
		try {
			bankingService.saveTransaction(request);
			response.setApiStatus(ApiStatus.SUCCESS);
		} catch (ValidationFailException ex) {
			
			com.banking.app.model.Error error = new com.banking.app.model.Error().setCode(ex.getCode()).setValue(ex.getMessage());
			response.setErrors(error);
			response.setApiStatus(ApiStatus.FAILED);
		}catch (Exception ex) {
            logger.error("Exception while fetching coupon data " + ex.getMessage());
            com.banking.app.model.Error error = new com.banking.app.model.Error().setCode("UNKNOWN_EXCEPTION").setValue(ex.getMessage());
            response.setErrors(error);
            response.setApiStatus(ApiStatus.FAILED);
        }
		new Metadata().setRequestTs(ts).setResponseTs(System.currentTimeMillis());

		return new ResponseEntity<ApiResponse<EmptyResponse>>(response, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET,value="/transaction{userId}")
	public ResponseEntity<ApiResponse< List<BankingTransaction>>> fetchTransaction(@PathVariable String userId){
		Long ts =System.currentTimeMillis();
		ApiResponse< List<BankingTransaction>> response = new  ApiResponse< List<BankingTransaction>>();
		try {
			bankingService.getTransactions(userId);
			response.setApiStatus(ApiStatus.SUCCESS);
		} catch (ValidationFailException ex) {
			
			com.banking.app.model.Error error = new com.banking.app.model.Error().setCode(ex.getCode()).setValue(ex.getMessage());
			response.setErrors(error);
			response.setApiStatus(ApiStatus.FAILED);
		}catch (Exception ex) {
            logger.error("Exception while fetching coupon data " + ex.getMessage());
            com.banking.app.model.Error error = new com.banking.app.model.Error().setCode("UNKNOWN_EXCEPTION").setValue(ex.getMessage());
            response.setErrors(error);
            response.setApiStatus(ApiStatus.FAILED);
        }
		new Metadata().setRequestTs(ts).setResponseTs(System.currentTimeMillis());

		return new ResponseEntity<ApiResponse< List<BankingTransaction>>>(response, HttpStatus.OK);
	}
}
