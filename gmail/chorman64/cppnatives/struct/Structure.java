package gmail.chorman64.cppnatives.struct;

import gmail.chorman64.cppnatives.annotation;

public class Structure<T extends Structure<T>>{
  private long address;
  private Class<T> structClass;
  public static class Const<T extends Structure<T>>{
    private long address;
    private final Class<T> structClass;
    public Const(Class<T> structClass){
      this.structClass = structClass;
      newInstance();
    }
    private native void newInstance();
    
    public LValueReference<ConstObject<T>> asReference(){
      return ConstObject.const_cast(address,CppType.getTypeOf(structClass).addConst().addPointer()).dereference();
    }
  }
  
  public static class Reference<T extends Structure<T>>{
    private long address;
    private Class<T> structClass;
    public Reference(Class<T> structClass){
    
    }
    public LValueReference<T> asReference(){
    
    }
  }
  
  
  public Structure(Class<T> structClass){
  
  }

};
