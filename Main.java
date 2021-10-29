import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Scanner stuff lol");
    Scanner user = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = user.nextLine();
    System.out.println("Hi " + name);

    System.out.println("Enter something (has to be a number) ");
    int userNumber = user.nextInt();
    System.out.println(userNumber);

    System.out.println(name.length());
    System.out.println(name.substring(1,5));
    System.out.println(name.indexOf('e'));

    String firstname = "joe";
    String lastname = "jones";
    String fullname = firstname + " " + lastname;
    System.out.println(fullname);

    String axolotl = "axolotl";
    String goodanimal = "an actually good animal";
    System.out.println(axolotl.equals(goodanimal));
  }
}