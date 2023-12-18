# java-regex-js

This simply re-exports `Pattern.compile(regex).matcher(input).matches()` from `java.util.regex.Pattern` built using scala-js

## Usage
```ts
import { compile as compileRegex, CASE_INSENSITIVE, DOTALL } from "java-regex-js";

compileRegex("f.*")("foo") // true

// With flags
compileRegex("f.*", CASE_INSENSITIVE | DOTALL)("Foo\nBar") // true

```

## Limitations
Not all flags and patterns are supported. Please see https://www.scala-js.org/doc/regular-expressions.html for more details.

Thanks to https://github.com/sjrd for the fantastic implementation and helpful guidance
