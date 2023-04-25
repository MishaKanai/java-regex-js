declare module "javaregex2js" {
  export const compile: (regex: string) => (input: string) => boolean;
}
