package OOP;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RationalTest {
//   5. At this stage, you have a minimal testable program. Test it and, if
//    necessary, debug it.

 Rational1 r = new Rational1();
 @Test
    public void testEmptyConstructor(){
     assertThat(r.getNumerator(), is(equalTo(0)));
     assertThat(r.getDenominator(), is(equalTo(1)));
 }
 @Test
 public void testSeters (){
      r.setNumerator(3);
      r.setDenominator(2);
      assertThat(r.getNumerator(),is(equalTo(3)));
      assertThat(r.getDenominator(),is(equalTo(2)));
 }
 @Test
 public void testToString(){
 // r.setNumerator(3);
 // r.setDenominator(5);
  assertThat(r.toString(),is(containsString(r.getNumerator()+" / " +r.getDenominator())));
 }
 @Test
 public void testRevert(){
  Rational1 r1 = new Rational1(5,6);

  assertThat(r1.getNumerator(),is(5));
  assertThat(r1.getDenominator(),is(6));

  r1.revert();
  assertThat(r1.getNumerator(),is(6));
  assertThat(r1.getDenominator(),is(5));

 }


}
