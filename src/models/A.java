package models;

public class A {

 private B b;// = new B();

  public A() {
    b = new B();
  }

  public boolean start() {
    //new B().doThis(10);
    b.doThis(10);
    callMe(20);
    return true;
  }

  public void callMe(int number) {

  }
}
