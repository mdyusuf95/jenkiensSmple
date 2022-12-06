package jenkinsSample;

import org.testng.annotations.Test;

public class sampleTest {
	
@Test(groups = "smoke")
public void smoketets()
{
	
System.out.println(" smoke testing is done ");
}
@Test(groups = "regression")
public void regrssiontets()
{
	
System.out.println(" reegression testing is done ");
}
@Test
public void tets()
{
	
System.out.println(" test testing is done ");
}
}
