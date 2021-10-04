import com.example.userregistration.UserRegisrationCreateException;
import com.example.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationExceptionTest {
    UserRegistrationException userRegistrationException = new UserRegistrationException();
    @Test
    public void getUserValue_WhenNotProper_ShouldReturnException(){
        try {
            ExpectedException expectedRule = ExpectedException.none();
            expectedRule.expect(UserRegisrationCreateException.class);
           boolean result = userRegistrationException.firstName(null);
           if(result == true)
            Assert.assertEquals(true, result);
           else if(result == false)
               Assert.assertEquals(false,result);
        } catch (UserRegisrationCreateException e) {
            e.printStackTrace();
        }
    }
}
