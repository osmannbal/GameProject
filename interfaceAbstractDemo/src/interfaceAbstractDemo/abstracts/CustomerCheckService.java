package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
