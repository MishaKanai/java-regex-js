package mishakanai.javaregex2js
import utest._

object PatternTest extends TestSuite {
  def tests = Tests {
    test("basic test") {
      assert(Main.compile("a")("b") == false)
      assert(Main.compile(".")("a") == true)
      assert(Main.compile(".a")("b") == false)
      assert(Main.compile(".a")("a") == false) // true in js regexes, but false in java
      assert(Main.compile(".a")("ba") == true)
    }
  }
}