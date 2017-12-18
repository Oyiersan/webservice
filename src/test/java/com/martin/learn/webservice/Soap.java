package com.martin.learn.webservice;

import com.martin.learn.webservice.template.ResultCallback;
import com.martin.learn.webservice.template.ResultDataCallback;
import com.martin.learn.webservice.template.WebServiceTemplate;

public class Soap {

	public AddResponse add(final AddRequest request) {
		return WebServiceTemplate.doResult(new ResultDataCallback<AddRequest, AddResponse, AddResultData>(){

			public AddResultData done() throws Exception {
				return new AddResultData(request.getAdd()+request.getAdded());
			}

			public AddResponse getRsp() {
				return new AddResponse();
			}

		});
	}

	public PrintResponse print(final PrintRequest request){
		return WebServiceTemplate.doResult(new ResultCallback<PrintRequest,PrintResponse>(){

			public void done() throws Exception {
				System.out.print(request.getPrinted());
			}

			public PrintResponse getRsp() {
				return new PrintResponse();
			}

		});
	}
}
