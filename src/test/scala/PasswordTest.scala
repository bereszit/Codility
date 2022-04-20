import org.scalatest.Ignore
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.tagobjects.Slow
import org.scalatest.wordspec.AnyWordSpec

//@Ignore
class PasswordTest extends AnyWordSpec with Matchers {

  "Password.solution" should {

    "return -1 when empty string is passed" in {
      val result = Password.solution("")
      result shouldEqual -1
      //assert(result == -1)
    }

    "return -1 if none password is correct" taggedAs (Slow) in {
      val result = Password.solution("oko na @maroko")
      result shouldEqual -1
    }

    "return value greater than 0 when at least one password is correct" in {
      val result = Password.solution("test1 @value     password3")
      assert (result > 0)
    }

    "return 11 for this specific call" in {
      val result = Password.solution("123qweroo00 wertoeooooo 123ee")
      result shouldEqual 11
    }
  }

}
