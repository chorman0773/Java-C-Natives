package gmail.chorman64.cppnatives.struct;

import gmail.chorman64.cppnatives.annotation.Struct;

public class Structure<T extends Structure<T>>{
  private long address;
  private Class<T> structClass;
  
  
  public Structure(Class<T> structClass){
    this.structClass = structClass;
  }
  
  protected <S> LValueExpression<S> getStructField(String name){
    Struct s = structClass.getDeclaredAnnotation(Struct.class);
    
  }

};
