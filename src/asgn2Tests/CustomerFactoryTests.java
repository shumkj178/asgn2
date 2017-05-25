package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import asgn2Customers.Customer;
import asgn2Customers.CustomerFactory;
import asgn2Customers.DriverDeliveryCustomer;
import asgn2Customers.DroneDeliveryCustomer;
import asgn2Customers.PickUpCustomer;
import asgn2Exceptions.CustomerException;

/**
 * A class the that tests the asgn2Customers.CustomerFactory class.
 * 
 * @author Person A
 *
 */

public class CustomerFactoryTests {
	// TO DO
	
	@Test
	public void testPickUpCustomer() throws CustomerException {
		Customer customer = CustomerFactory.getCustomer("PUC", "Kelok", "0423241145", 0, 0);
		assertEquals(PickUpCustomer.class, customer.getClass());
		
	}
	
	@Test
	public void testDroneDeliveryCustomer() throws CustomerException {
		Customer customer = CustomerFactory.getCustomer("DNC", "Gary", "0472774229", 4, 3);
		assertEquals(DroneDeliveryCustomer.class, customer.getClass());
		
	}
	
	@Test
	public void testDriverDeliveryCustomer() throws CustomerException {
		Customer customer = CustomerFactory.getCustomer("DVC", "Sean", "0402024300", 4, 3);
		assertEquals(DriverDeliveryCustomer.class, customer.getClass());
		
	}
	
	@Test
	public void test
	
	
	
	
	
}
