package com.iasa.ka23.ManagementSystem.db;

import com.iasa.ka23.ManagementSystem.bl.model.CustomerBasket;


public class HibernateCustomerBasketDao extends HibernateGenericDao<CustomerBasket> {

	@Override
	public Class<CustomerBasket> getType(){		
		return CustomerBasket.class;
	}

	@Override
	protected String getName(CustomerBasket object) {
		return null;
	}

	

}
