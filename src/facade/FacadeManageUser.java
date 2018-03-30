package facade;

import java.util.*;

import DAO.FactoryDAO;
import DAO.UserDAO;
import domain.User;

/**
 * 
 */
public class FacadeManageUser extends AbstractFacade {

	private static FacadeManageUser facadeSingleton;
	private UserDAO userDao;
	
	
	private FacadeManageUser() {
		FactoryDAO factoryDao = FactoryDAO.getFactory();
		userDao = factoryDao.getUserDAO();
	}
	
	public static FacadeManageUser getFacade() {
		if( facadeSingleton == null ) {
			facadeSingleton = new FacadeManageUser();
		}
		return facadeSingleton;
	}
	

    public Set<User> getUserList(int maxSize, int offset) {
        try {
			return userDao.getListOfUsers(maxSize, offset);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }


	public void unBanUser(User user) {
		user.setBanUntilDate(new Date());
		try {
			userDao.saveUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Set<User> getUserListByName(String text, int maxSize, int offset) {
		try {
			return userDao.getListUserByName(text, maxSize, offset);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}