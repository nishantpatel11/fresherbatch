package com.mock.test.application;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import com.mock.application.dao.CustomerDAO;
import com.mock.application.model.Customer;
import com.mock.application.service.CustomerService;

//@RunWith(MockitoJUnitRunner.class)
public class ApplicationTest {

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Rule 
	public MockitoRule rule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

//	@InjectMocks
//	RecordService recordService;
//
//	@Mock
//	DatabaseDAO databaseMock;
//
//	@Mock
//	NetworkDAO networkMock;

	@Mock
	CustomerDAO customerMock;

	@InjectMocks
	CustomerService customerService;

	@Test
	public void saveTest()
	{

		Customer cust = new Customer("Nishant", 21, "Bangalore", 23232323223l);
		boolean saved = customerService.addCustomer(cust);
		assertEquals(true, saved);
		verify(customerMock, times(1)).save(cust);

	}

}
