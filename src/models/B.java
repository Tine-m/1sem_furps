package models;

public class B {

  private C c;

  public B() {
    c = new C();
  }

  public void doThis(int number) {
    int result = c.doThat(number);
  }
}
