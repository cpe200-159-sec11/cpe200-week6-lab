

import cpe200.IUser;
import cpe200.User;
import cpe200.Users;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {
    Users userList;
    IUser u1;
    IUser u2;

    @Before
    public void setUp() throws Exception {
        userList = new Users();
        u1 = new User();
        u2 = new User();

        u1.setUserName("harrypotter");
        u1.setPassword("HarryPotter1");
        u2.setUserName("hermionegranger");
        u2.setPassword("HermioneGranger1");
    }

    @Test
    public void addUser() throws Exception {
        assertEquals(0, userList.count());
        userList.addUser(u1);
        assertEquals(1, userList.count());
        userList.addUser(u2);
        assertEquals(2, userList.count());
    }


    @Test
    public void deleteUser() throws Exception {
        assertEquals(0, userList.count());
        userList.addUser(u1);
        assertEquals(1, userList.count());
        userList.addUser(u2);
        assertEquals(2, userList.count());

        userList.deleteUser(u1);
        assertEquals(1, userList.count());
        userList.deleteUser(u2);
        assertEquals(0, userList.count());

        try {
            userList.deleteUser(u1);
            fail("Expect an exception here");
        } catch (RuntimeException ex) {

        } catch (Exception ex) {
            fail("Expect a runtime exception here");
        }
    }

    @Test
    public void exists() throws Exception
    {
        userList.addUser(u1);
        assertTrue(userList.exists(u1));
        assertFalse(userList.exists(u2));
        userList.addUser(u2);
        assertTrue(userList.exists(u2));
        userList.deleteUser(u1);
        assertFalse(userList.exists(u1));
        userList.deleteUser(u2);
        assertFalse(userList.exists(u2));
    }

    @Test
    public void getUserByUsername() throws Exception {
        userList.addUser(u1);
        userList.addUser(u2);
        assertEquals(u1, userList.getUserByUsername(u1.getUserName()));
    }

    @Test
    public void getUserArray() throws Exception {
        userList.addUser(u1);
        userList.addUser(u2);
        IUser[] users = userList.getUserArray();
        assertEquals(2, users.length);
        assertTrue(users[0] == u1 || users[1] == u1);
        assertTrue(users[0] == u2 || users[1] == u2);
    }

}