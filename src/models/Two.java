package models;

public class Two {

  public boolean doThis(int number) {
    int result = new Three().doThat(number);
    callMe(result);
    return true;
  }

  private void callMe(int result) {

  }
}
