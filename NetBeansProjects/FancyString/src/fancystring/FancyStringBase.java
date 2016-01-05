package fancystring;

public class FancyStringBase implements FancyString {
  String str;
  
  public FancyStringBase(String s) {
    str = s;
  }
  
  @Override
  public String toString() {
    return str;
  }
}
