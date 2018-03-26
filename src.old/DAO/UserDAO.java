package DAO;
import domain.User;

public interface UserDAO {
	public User connectToUser(String username, String password) throws Exception;
    public void insert(User user);
    public void update(User user);
    public void delete(int userId);
	User[] findAll();
	User findByKey(int userId);
}
