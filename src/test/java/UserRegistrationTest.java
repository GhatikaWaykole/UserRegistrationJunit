import com.example.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
       boolean result = userRegistration.firstName("Abcd");
       Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Abcd");
        Assert.assertTrue(result);
    }
}
