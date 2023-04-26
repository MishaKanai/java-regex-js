# java-regex-js

This simply re-exports `Pattern.compile(regex).matcher(input).matches()` from `java.util.regex.Pattern` built using scala-js

## Usage
```ts
import { compile as compileRegex } from "java-regex-js";

compileRegex("f.*")("foo") // true

```

Thanks to https://github.com/sjrd for the fantastic implementation and helpful guidance
