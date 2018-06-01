package gmail.chorman64.cppnatives.annotations;

public @interface Method{
  public enum CVQualifiers{
    CONST, VOLATILE;
  };
  public enum RefQualifiers{
    LVALUE, RVALUE;
  };
  AccessLevel level() default AccessLevel.PUBLIC;
  boolean isVirtual() default false;
  CVQualifiers[] cvQualifiers() default {};
  RefQualifiers[] refQualifiers() default {};
  String name();
  CppType returnType();
  CppType[] parameterTypes() default {};
};
