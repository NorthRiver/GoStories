
public interface UserDAO {
    public void insert(User user);
    public void update(User user);
    public void delete(int userId);
	User[] findAll();
	User findByKey(int userId);
}
