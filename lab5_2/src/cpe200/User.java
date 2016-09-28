package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    private String userName = null;
    private String password = null;

    public User() {
    }

    public String setUserName(String name) {
        String pattern = "([A-Za-z]+)([A-Za-z\\d]+)";
        String prevName = userName;
        if(name == null)
        {
          return null;
        }
        if(name.matches(pattern) && name.length() >=8)
        {
            this.userName = name;
            return prevName;
        }
        else {
            throw new RuntimeException();
        }
    }

    public int setPassword(String name) {
        if(name.length()>=12)
        {
            if(name.matches("([\\D]+)"))
            {
                throw new RuntimeException();
            }else if(name.matches("([^a-z]+)"))
            {
                throw new RuntimeException();
            }else if(name.matches("([^A-Z]+)"))
            {
                throw new RuntimeException();
            }else
            {
                this.password = name;
                return password.length();
            }
        }else
        {
            throw new RuntimeException();
        }
    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}

