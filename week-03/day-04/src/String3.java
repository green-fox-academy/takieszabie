public class String3 {
  public static void main(String[] args) {
    char newChar = '*';
    String toBeStarred = "apple";
    System.out.println(csillagozo(toBeStarred));
  }

  private static String csillagozo(String toBeStarred) {
    int originalLenght = toBeStarred.length();
    if (toBeStarred.length() == 1) {
      return "" + toBeStarred.charAt(0);
    }
    return toBeStarred.charAt(0) + "*" + csillagozo(toBeStarred.substring(1));
  }
}