public class UserDAOPLSQL implements UserDAO {
	//
    @Override
    public void delete(int userId) {
        // delete user from user table
    }
    @Override
    public User[] findAll() {
        // get a list of all users from user table
        return null;
    }

    @Override
    public User findByKey(int userId) {
        // get a user information if we supply unique userid
        return null;
    }

    @Override
    public void insert(User user) {
        // insert user into user table
    }

    @Override
    public void update(User user) {
        // update user information in user table
    }
}