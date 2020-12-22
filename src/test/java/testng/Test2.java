package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void f() {
	  Assert.fail("I am f() and I fail");
  }
  
  
  @Test(dependsOnMethods={"f"})
  public void g() {
	  System.out.println("My dependent f() failed; I'll be skipped");
  }
}
