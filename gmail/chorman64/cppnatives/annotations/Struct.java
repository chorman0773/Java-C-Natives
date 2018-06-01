package gmail.chorman64.cppnatives.annotations;


public @interface Struct{
  Field[] fields();
  Constructor[] ctors()default {};
  Methods[] methods()default {};
};
