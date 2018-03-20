package DAO;

import DAOPSQL.FactoryDAOPSQL;

public abstract class FactoryDAO {
	static protected FactoryDAO singleFactory;
	static public FactoryDAO create(String persistenceType) {
		switch (persistenceType) {
		case "PSQL":
		default:
			singleFactory = new FactoryDAOPSQL();
		}
		return singleFactory;
	}
	static public FactoryDAO getFactory() {
		return singleFactory;
	}
	
	public abstract UserDAO getUserDAO();
	//Add all the DAO little by little
}
