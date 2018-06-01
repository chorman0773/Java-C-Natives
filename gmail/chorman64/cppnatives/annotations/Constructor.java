package gmail.chorman64.cppnatives.annotations;

public @interface Constructor{
  AccessLevel access();
  CppType parameterTypes() default {};
}
