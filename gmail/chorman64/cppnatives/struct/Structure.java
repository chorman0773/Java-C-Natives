package gmail.chorman64.cppnatives.struct;

import gmail.chorman64.cppnatives.annotation;

public class Structure<T extends Structure<T>>{
  private long address;
  private Class<T> structClass;
  
  
  public Structure(Class<T> structClass){
    this.structClass = structClass;
  }
  
  public <S> LValueExpression<S> getStructField(String name){
   
  }

};
