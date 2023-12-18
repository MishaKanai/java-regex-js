declare module "java-regex-js" {
  export const compile: (regex: string) => (input: string) => boolean;
  
  // export const CANON_EQ: number; // Flag is not supported. See https://www.scala-js.org/doc/regular-expressions.html
  
  export const CASE_INSENSITIVE: number;
  
  export const COMMENTS: number;
  
  export const DOTALL: number;
  
  export const LITERAL: number;
  
  export const MULTILINE: number; // Requires ES2018+
  
  export const UNICODE_CASE: number;
  
  export const UNICODE_CHARACTER_CLASS: number; // Requires ES2018+
  
  export const UNIX_LINES: number;
}
