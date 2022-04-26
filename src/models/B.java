package models;

public class B {

  public void doThis(int number) {
    int result = new C().doThat(number);
    callMe(result);
  }

  private boolean callMe(int result) {
    return true;
  }
}
