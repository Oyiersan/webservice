package com.martin.learn.webservice;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestSoap {

	
	@Test
	public void testAdd(){
		AddRequest add = new AddRequest();
		add.setAdd(1);
		add.setAdded(2);
		
		Soap soap = new Soap();
		AddResponse rsp =soap.add(add);
		assertEquals(3,rsp.getResultData().getSum());
	
		assertEquals("0",rsp.getResultInfo().getResultCode());
		assertEquals("success",rsp.getResultInfo().getResultDesc());
	}

}
