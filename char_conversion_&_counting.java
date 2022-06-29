import java.util.Scanner;

// wap to print all the charecter from the String
class PrintAllChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        scan.close();
    }
}
// o/p
// kiity kittu
// kiity kittu

// wap to print all the charecter from the String in revers order

class RevStringchar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        scan.close();
    }
}

// o/p
// Level
// leveL

// wap to count the charecters
class CountChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
        }
        System.out.print(count);            
        scan.close();
    }
}
// o/p
// malayalam
// 9

// wap to count whiteSpaces 
class CountSpaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count= 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// how r u kitty
// 3


// wap to count words from the string
class CountWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
            int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count +1);
        scan.close();
    }
}

// o/p
// im in gajendragad 
// 3

// wap to count uppercase letters from the word
class upCaseLeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 92) {    //or  if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// HELLO kittY
// 6

// wap to count lowercase letter fro the words
class LowerCaseLeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {    //or  if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// HELLO kittY
// 4

// wap to count the alfhabets in charecter
class CountAlfhaChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) == ' ') {   //&& s.charAt(i) >= '0' && s.charAt(i) <= '9'
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// HELLO kittY2 hOW r12345
// 17

//wap to count the numeric in the words 
class CountAlNumeric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {   
                count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// mY stATe coDe Is 582 114
// 6

// wap to count the Alfha Numeric
class CountAlfhaNumeric {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {   //s.charAt(i) == ' ' add this if you whant to count spaces also            
            }       
        }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// mY stATe coDe Is 582 114
// 19

// wap to count special chrecters from the words
class specialCharecter{    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {

           if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
              s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == ' ') {

                // this block will not execute 
                // the 'else' block get executes
              }

            else {
               count++;
              }
         }
        System.out.print(count);
        scan.close();
    }
}
// o/p
// mY+ (stATe) coDe*Is #582 @114&/(100) 
// 10