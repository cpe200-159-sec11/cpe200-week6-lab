package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {

    public ArrayList<IUser> userList;
    public Users()
    {
        userList = new ArrayList<IUser>();
    }

    public void addUser(IUser user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User temp;
        temp = new User();
        temp.setUserName(userName);
        temp.setPassword(password);
        userList.add(temp);
    }

    public void deleteUser(IUser user)
    {
        if(exists(user))
        {
            userList.remove(user);
        }
        else
        {
            throw new RuntimeException();
        }

    }

    public boolean exists(IUser user)
    {
        if(userList.contains(user))
        {
            return true;
        }
        else
            return false;
    }

    public boolean usernameExists(String username)
    {
        for(int i = 0 ; i<userList.size() ;i++)
        {
            if(userList.get(i).getUserName() == username)
            {
                {
                    return true;
                }
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public IUser getUserByUsername(String userName)
    {
        int hold=0;
        for(int i = 0 ; i<userList.size() ;i++)
        {
            if(userList.get(i).getUserName() == userName)
            {
                {
                    hold = i;
                    return userList.get(hold);
                }
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public IUser[] getUserArray()
    {
        User[] arr;
        arr = userList.toArray(new User[userList.size()]);
        return arr;
    }
}
