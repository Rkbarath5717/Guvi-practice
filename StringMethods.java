import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s=scn.nextLine();

        //length()
        System.out.println("Length of the String =");
        System.out.println(s.length());

        //charAt(indexNumber)
        System.out.println("character position =");
        System.out.println(s.charAt(3));

        //equals(AnotherString)
        String s1=scn.nextLine();
        System.out.println("Equals check = ");
        System.out.println(s.equals(s1));

        //equalsIgnoreCase()
        System.out.println("Equals without check case = ");
        System.out.println(s.equalsIgnoreCase(s1));

        //toUpperCase()
        System.out.println("Upper case of the String = ");
        System.out.println(s.toUpperCase());

        //toLowerCase()
        System.out.println("Lower case of the String = ");
        System.out.println(s.toLowerCase());

        //trim
        System.out.println("Trim using the string");
        String s2=scn.nextLine();
        System.out.println(s2.trim());


        //subString(StringIndex)
        System.out.println("Substring of the String = ");
        System.out.println(s.substring(3));

        //startsWith()
        System.out.println("The starting position ");
        System.out.println(s.startsWith("ba"));

        //endsWith()
        System.out.println("The Ending of position = ");
        System.out.println(s.endsWith("th"));

        //contains()
        System.out.println("the contains value");
        System.out.println(s.contains("th"));

        //indexOf()
        System.out.println(s.indexOf('r'));

        //lastIndex()
        System.out.println(s.lastIndexOf('a'));

        //replace()
        System.out.println(s.replace('a','b'));

        //replaceAll
        System.out.println(s.replaceAll("a","s"));

        String b=scn.nextLine();
        String [] m=b.split(",");
        System.out.println(m);
    }
}