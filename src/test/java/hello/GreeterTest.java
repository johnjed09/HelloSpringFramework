package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import helloSpring.Greeter;

public class GreeterTest {
  
  private Greeter greeter = new Greeter("jed");

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayWhatsUp(), containsString("Hello"));
  }

}