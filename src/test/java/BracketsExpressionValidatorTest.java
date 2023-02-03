import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsExpressionValidatorTest {
  @Test
      public void validate(){
      assertTrue(BracketsExpressionValidator.validate("()"));
      assertTrue(BracketsExpressionValidator.validate("([])"));
      assertTrue(BracketsExpressionValidator.validate("(<>)[]"));
      assertTrue(BracketsExpressionValidator.validate("(<({})[]>)[<>()<>]"));

      assertFalse(BracketsExpressionValidator.validate(")"));
      assertFalse(BracketsExpressionValidator.validate("("));
      assertFalse(BracketsExpressionValidator.validate("()["));
      assertFalse(BracketsExpressionValidator.validate("(p)]"));
  }
}
