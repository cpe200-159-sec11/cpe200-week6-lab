package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<IUser> userList = new ArrayList<>();

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
    }

    public void deleteUser(IUser user)
    {
        if(!exists(user))
        {
            throw new RuntimeException();
        }
        this.userList.remove(user);
    }

    public boolean exists(IUser user)
    {
        for(int i =0;i<userList.size();i++)
        {
            if(userList.get(i) == user)
            {
                return true;
            }
        }
        return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i =0;i<userList.size();i++)
        {
            if(userList.get(i).getUserName() == username)
            {
                return true;
            }
        }
        return false;

    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        for (int i = 0; i <this.userList.size() ; i++) {
            if(this.userList.get(i).getUserName() == userName)
            {
                return this.userList.get(i);
            }
        }
        return null;
    }

    public int count()
    {
        return this.userList.size();
    }

    public IUser[] getUserArray()
    {
        IUser[] user = new User[this.userList.size()];
        for(int i=0;i<this.userList.size();i++)
        {
            user[i]=this.userList.get(i);
        }
        return user;
    }
}
