package mishakanai.javaregex2js
import java.util.regex.Pattern
import scala.scalajs.js.Function1
import scala.scalajs.js.annotation.JSExportTopLevel

package object Main {
    @JSExportTopLevel("compile")
    def compile(
        regex: String,
        flags: Int = 0,
    ): Function1[String, Boolean] = {
        val p = Pattern.compile(regex, flags)
        (input: String) => p.matcher(input).matches()
    }

    // Flag "CANON_EQ" is not supported. See https://www.scala-js.org/doc/regular-expressions.html
    // @JSExportTopLevel("CANON_EQ")
    // val CANON_EQ: Int = Pattern.CANON_EQ

    @JSExportTopLevel("CASE_INSENSITIVE")
    val CASE_INSENSITIVE: Int = Pattern.CASE_INSENSITIVE

    @JSExportTopLevel("COMMENTS")
    val COMMENTS: Int = Pattern.COMMENTS

    @JSExportTopLevel("DOTALL")
    val DOTALL: Int = Pattern.DOTALL

    @JSExportTopLevel("LITERAL")
    val LITERAL: Int = Pattern.LITERAL

    // Flag "MULTILINE" requires ES2018+
    @JSExportTopLevel("MULTILINE")
    val MULTILINE: Int = Pattern.MULTILINE

    @JSExportTopLevel("UNICODE_CASE")
    val UNICODE_CASE: Int = Pattern.UNICODE_CASE

    // Flag "UNICODE_CHARACTER_CLASS" requires ES2018+
    @JSExportTopLevel("UNICODE_CHARACTER_CLASS")
    val UNICODE_CHARACTER_CLASS: Int = Pattern.UNICODE_CHARACTER_CLASS

    @JSExportTopLevel("UNIX_LINES")
    val UNIX_LINES: Int = Pattern.UNIX_LINES
}