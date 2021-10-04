import com.example.userregistration.MoodAnalysis;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyseTest {
    @Test
    public void getMoodValue_WhenProper_ShouldReturnHappy(){
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String result = moodAnalysis.moodanalysieCompute("Happy");
        Assert.assertEquals("Happy",result);
    }
    @Test
    public void getMoodValues_WhenNotProper_ShouldReturnFalse(){
        MoodAnalysis moodAnalysis = new MoodAnalysis();
        String result = moodAnalysis.moodanalysieCompute("Sad");
        Assert.assertFalse(Boolean.parseBoolean(result));
    }
}
