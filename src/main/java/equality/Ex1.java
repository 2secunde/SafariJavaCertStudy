package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
    String s = "Hello";
    String t = "He";
    t += "llo";

    t = t.intern();

    System.out.println(s == t);
    String s2 = "Hello";
    System.out.println(s == s2);
//
//    String s3 = "hello";
//    String s4 = s3.toLowerCase();
//    System.out.println(s3 == s4);

//    String s = "Hello";
//    String t = "He";
//    t += "llo";
//    System.out.println(s.equals(t));

//    StringBuilder s = new StringBuilder("Hello");
//    StringBuilder t = new StringBuilder("He");
//    t.append("llo");
//    System.out.println(s.equals(t));

//    List<String> ls = List.of("Fred", "Jim");
//    List<String> ls2 = new ArrayList<>(ls);
//    System.out.println(ls.equals(ls2));
//
    LocalDate ld = LocalDate.of(2021, 3, 29);
    LocalDate ld2 = LocalDate.of(2021, 3, 29);
    System.out.println(ld.equals(ld2));
  }
}
