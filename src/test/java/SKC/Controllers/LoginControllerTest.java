package SKC.Controllers;

import SKC.Services.FileSystemService;
import SKC.Services.UserService;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Files;

import static org.junit.Assert.assertTrue;

public class LoginControllerTest {
    private static final String test_username = "Test-username";
    private static final String test_password = "Test-password";
    private static UserService UserSevice;

    @BeforeClass
    public static void setupClass() throws Exception {
        FileSystemService.APPLICATION_FOLDER = ".test_database";
        UserService.initDatabase();
    }

    @Test
    public void testCopyDefaultUserNotExists() throws Exception{
        assertTrue(Files.exists(FileSystemService.getPathToFile()));

    }
}
