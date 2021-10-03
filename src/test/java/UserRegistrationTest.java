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
    @Test
    public void giveEmailVaule_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.emailValidation("abc@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void giveEmailValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.emailValidation("abc..@radif.com");
        Assert.assertFalse(result);
    }
    @Test
    public void giveNumberValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.numberValidation("10 1111111111");
        Assert.assertTrue(result);
    }
    @Test
    public void givenNumberValues_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.numberValidation("11 121212111");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLoginValue_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.loginValidation("Asbmsopnm");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLoginValues_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.loginValidation("Asjspnm");
        Assert.assertFalse(result);
    }
}
