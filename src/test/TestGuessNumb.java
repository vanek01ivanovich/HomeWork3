package test;
import main.Model;
import main.View;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestGuessNumb {

    private static Model model;
    private static View view;
    private static final int MIN = 0;
    private static final int MAX = 100;

    @BeforeClass
    public static void runTest(){ model = new Model(view);}

   @Test
    public void testForRandomNumb(){
       for (int i = 0; i < 100000; i++) {
           model.setMyNumber(MIN,MAX);
           if (model.getMyNumber() == MIN || model.getMyNumber() == MAX){
               Assert.fail();
           }
       }
   }

}
