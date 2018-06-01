package gmail.chorman64.cppnatives.annotations;

import gmail.chorman64.cppnatives.struct.AccessLevel;

public @interface Struct{
  
  
  Field[] fields() default {};
};
