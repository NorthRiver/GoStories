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

    public String username;
    public String email;
    public Date birthDate;
    public String password;
    public Boolean isAdmin;
    public String bio;
    public Date banUntilDate;



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

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	public Boolean getIsAdmn() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsBanned() {
		if (banUntilDate == null) {
			return false;
		} else {
			Date today = new Date();
			return today.after(banUntilDate);	
		}
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getBanUntilDate() {
		return banUntilDate;
	}

	public void setBanUntilDate(Date banUntilDate) {
		this.banUntilDate = banUntilDate;
	}

}