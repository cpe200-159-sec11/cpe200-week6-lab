package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User implements IUser {
    public String userName;
    public String password;
    public User() { /* blank */ }

    public String setUserName(String name) {

        if (name == null){return null;}
        String condition = "([A-Za-z]+)([A-Za-z\\d]+)";

        String prev_name = this.userName;

        if(name.length() < 8){
            throw new RuntimeException();
        }
        if (name.matches(condition))  {
            this.userName = name;
            return prev_name;
        }else {

            throw new RuntimeException();
        }
    }
    public int setPassword(String name)  {
        if( name.length() < 12 || name.matches("([^A-Z]+)") || name.matches("([^a-z]+)") || name.matches("([^0-9]+)"))
        {
            return Integer.parseInt(null);}
        else {
            this.password = name;
            return password.length();
        }

    }

    public String getUserName() {

        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }


}
