package domain;

import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    public String username;

    /**
     * 
     */
    public String email;

    /**
     * 
     */
    public String password;

    /**
     * 
     */
    public Boolean isAdmn;
    public Boolean isBanned;




    /**
     * 
     */
    public void delete() {
        // TODO implement here
    }

    /**
     * @param newName
     */
    public void rename(String newName) {
        // TODO implement here
    }

    /**
     * 
     */
    public void save() {
        // TODO implement here
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsAdmn() {
		return isAdmn;
	}

	public void setIsAdmn(Boolean isAdmn) {
		this.isAdmn = isAdmn;
	}

	public void setIsBanned(Boolean isBanned) {
		this.isBanned = isBanned;
	}

	public Boolean getIsBanned() {
		return isBanned;
	}

}