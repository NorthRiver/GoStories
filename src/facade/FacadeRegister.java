package facade;

import java.time.LocalDate;
import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;


public class FacadeRegister extends AbstractFacade {

	private static FacadeRegister facadeSingleton;
	private UserDAO userDao;
    public FacadeRegister() {
    	FactoryDAO factoryDao;
		factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
    }
    public static FacadeRegister getFacadeRegister() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeRegister();	
		}
		return facadeSingleton;
	}
	public User register(String username, String password, String email, LocalDate birthdate, String gender) {
		try {
			return userDao.register(username, password, email, birthdate, gender);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}