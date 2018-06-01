package gmail.chorman64.cppnatives.annotations;

import gmail.chorman64.cppnatives.struct.AccessLevel;

public @interface Struct{
  public static @interface Field{
    AccessLevel level() default AccessLevel.PUBLIC;
    CppType type();
    String name();
  };
  
  Field[] fields() default {};
};
