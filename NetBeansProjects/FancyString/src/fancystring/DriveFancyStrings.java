package fancystring;

public class DriveFancyStrings {
  public static void main(String[] args) {
    FancyString fancy = new FancyStringBase("Not Your,\n Nachos!");

    fancy = new FancyStringReverse(fancy, '^');
    fancy = new FancyStringReverse(fancy, '[');
    fancy = new FancyStringReverse(fancy, ']');
    fancy = new FancyStringReverse(fancy, '#');
    fancy = new FancyStringReverse(fancy, '$');
    
    System.out.println(fancy);
  }
}
