package Practial;

import com.sun.jdi.Value;

public class Palindrome {

    public static void main(String[] args) {

//        String[] values={"A",
//                        "AaA",
//                        "AaaA",
//                        };
////        System.out.println(values[1]);
//
//        for(int i=0; i< values.length; i++){
//            System.out.println(values[i]);
//        }

//       System.out.println(isPalinadrome1("kook"));


//       boolean x;
//       System.out.println(x);

    }

    public static void isPalinadrome888(String word){

        StringBuffer values = new StringBuffer(word);
//        for(int i=0; i< values.length; i++){
//            System.out.println(values[i]);
//        }
//        System.out.println(values.reverse());
//
//        if (values == values.reverse()){
//            System.out.println("good");
//        }else {
//            System.out.println("BAD");
//        }
//
        System.out.println(isPalinadrome2("kok"));
    }

    // loop
    public static boolean isPalinadrome1(String word){

        int length = word.length();

        for (int i = 0; i < length / 2 ; i++){
            if (word.charAt(i) == word.charAt(length - i - 1)){
                return true;
            }

        }
        return false;
    }


    // while
    public static boolean isPalinadrome2(String word){

        int length = word.length();
        int i = 0;
        while (i < length / 2){

            if (word.charAt(i) == word.charAt(length - i - 1)){
                return true;
            }
            i++;
        }
        return false;

    }

    // recursion
    public static boolean isPalinadrome3(String word){

        int length = word.length();
        if (length < 2 ){
            return true;
        }



        if(word.charAt(0) == word.charAt(length - 1)) {
            return true;
        }
        return isPalinadrome3(word.substring(1, length -1));
    }



}
