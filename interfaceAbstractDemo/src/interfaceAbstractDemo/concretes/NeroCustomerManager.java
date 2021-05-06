package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		super.Save(customer);
	}

}
