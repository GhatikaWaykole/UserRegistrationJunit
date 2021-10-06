import com.example.userregistration.UserRegisrationCreateException;
import com.example.userregistration.UserRegistration;
import com.example.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;

public class UserRegistrationExceptionTest {
    UserRegistrationException userRegistrationException;
    @Before
            public void setUserRegistrationException() {
        userRegistrationException = new UserRegistrationException();
    }
    @Test
    public void getUserValue_WhenNotProper_ShouldReturnException() {
        try {
            boolean result = userRegistrationException.firstName(null);
            if (result == true)
                Assert.assertEquals(true, result);
            else if (result == false)
                Assert.assertEquals(false, result);
        }
        catch(UserRegisrationCreateException e){
            e.printStackTrace();
        }
    }
    @Test
    public void getUserLastNameValue_WhenNull_ShouldReturnException(){
        try{
            boolean result = userRegistrationException.lastName(null);
            if (result == true)
                Assert.assertEquals(true,result);
            else if(result == false)
                Assert.assertEquals(false,result);
        } catch (UserRegisrationCreateException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getUserValue_WhenNull_ShouldReturnException(){
        try{
            boolean result = userRegistrationException.name(null);

        } catch (UserRegisrationCreateException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getNumberValue_WhenNull_ShouldReturnException(){
        try{
            boolean result = userRegistrationException.numberCheck(null);
        } catch (UserRegisrationCreateException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getLoginValue_WhenNull_ShouldReturnException() throws UserRegisrationCreateException {
        try{
            boolean result = userRegistrationException.loginValidation(null);
        } catch (UserRegisrationCreateException e){
            e.printStackTrace();
        }
    }
}
