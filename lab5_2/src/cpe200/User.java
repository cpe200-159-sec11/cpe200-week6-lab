package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    protected String userName;
    protected String password;
    protected String hold;
    public User() {
    }

    public String setUserName(String name)  throws RuntimeException {
        if(name == null)
        {
            return null;
        }
        hold = userName;
        this.userName = name;
        String pattern = "[a-zA-Z][a-zA-Z0-9]+";
        if(name.matches(pattern) && name.length() >= 8)
        {
            userName = name;
            return hold;
        }
        else
        {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) {
        this.password = name;
        String pattern = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]+";
        if (name.matches(pattern) && name.length() >= 12)
        {
            return name.length();
        } else
            throw new RuntimeException();
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}


