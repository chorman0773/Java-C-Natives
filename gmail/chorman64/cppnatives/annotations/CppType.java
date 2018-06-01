package gmail.chorman64.cppnatives.annotations;

import gmail.chorman64.cppnatives.typeinfo.TypeModifiers;

public @interface CppType{
  TypeModifiers[] modifiers() default {};
  String value();
};
