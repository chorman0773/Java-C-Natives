package gmail.chorman64.cppnatives.annotations;

import gmail.chorman64.cppnatives.typeinfo.TypeModifier;

public @interface CppType{
  TypeModifier[] modifiers() default {};
  String value();
};
