package gmail.chorman64.cppnatives.annotations;

import gmail.chorman64.cppnatives.access.AccessLevel;

public static @interface Field{
    AccessLevel level() default AccessLevel.PUBLIC;
    CppType type();
    String name();
  };
