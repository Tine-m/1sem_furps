package models;

public class B {

  public boolean doThis(int number) {
    int result = new C().doThat(number);
    callMe(result);
    return true;
  }

  private void callMe(int result) {

  }
}
