package SKC.Services;

import SKC.Exception.NoUpperCaseException;
import SKC.Exception.UncompletedFieldsException;
import SKC.Exception.UsernameAlreadyExistException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {
    private UserService UserSevice;

    @Test
    public void testCopyDefaultUserNotExists() throws Exception{
        UserSevice.initDatabase();
        assertTrue(Files.exists(FileSystemService.getPathToFile()));
    }

    @Test
    public void addOneUser() throws UsernameAlreadyExistException, NoUpperCaseException, UncompletedFieldsException {
        int i = UserService.getAllUsers().size();
        UserService.addUser("test","Test","test","test","test","test");
        assertEquals(i+1,UserService.getAllUsers().size());
        UserService.delete("test");

    }
}
