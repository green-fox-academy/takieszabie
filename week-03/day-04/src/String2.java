public class String2 {
  public static void main(String[] args) {
    String toBeModified = "xenophxxxxxxxxxxobiaxenopheal";
    char from = 'x';
    char to = 0;
    System.out.println(modifier(toBeModified, from, to));
  }

  private static String modifier(String toBeModified, char from, char to) {
    if (toBeModified.length()<1 ) {
      return toBeModified;
    }else if (from == toBeModified.charAt(0)){
      char first = to;
      return first+modifier(toBeModified.substring(1),from,to);
    }char first = toBeModified.charAt(0);
    return first + modifier(toBeModified.substring(1),from, to);
  }
}