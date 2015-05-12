package com.iasa.ka23.ManagementSystem.db;


import com.iasa.ka23.ManagementSystem.bl.model.CustomerBasket;
import com.iasa.ka23.ManagementSystem.bl.model.Good;
import com.iasa.ka23.ManagementSystem.bl.model.GoodRecord;
import com.iasa.ka23.ManagementSystem.bl.model.GoodType;

public class DaoFactoryImpl implements DaoFactory {	
	
	private GenericDao<Good> goodDao;

	private GenericDao<GoodType> goodTypeDao;
	
	private GenericDao<GoodRecord> goodRecordDao;

	private GenericDao<CustomerBasket> basketDao;
	
	public GenericDao<CustomerBasket> getBasketDao() {
		return basketDao;
	}

	public void setBasketDao(GenericDao<CustomerBasket> basketDao) {
		this.basketDao = basketDao;
	}	
		
	public GenericDao<GoodRecord> getGoodRecordDao() {
		return goodRecordDao;
	}

	public void setGoodRecordDao(GenericDao<GoodRecord> goodRecordDao) {
		this.goodRecordDao = goodRecordDao;
	}

	public GenericDao<Good> getGoodDao() {
		return goodDao;
	}

	public void setGoodDao(GenericDao<Good> goodDao) {
		this.goodDao = goodDao;
	}

	public GenericDao<GoodType> getGoodTypeDao() {
		return goodTypeDao;
	}

	public void setGoodTypeDao(GenericDao<GoodType> goodTypeDao) {
		this.goodTypeDao = goodTypeDao;
	}

	@Override
	public GenericDao<Good> getGoodDaoExtended(){
		return goodDao;
	}

	@Override
	public GenericDao<GoodType> getGoodTypeExtraDao(){
		return goodTypeDao;
	}	

}
