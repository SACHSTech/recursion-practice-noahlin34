package recursionAssignment;

public class Recursion{

    //count how many times 7 appears 
    public static int count7(int n ) {
        if (n == 0) {
            return 0;
        } else  if ((n % 10) == 7) {
            n = n / 10;
            return 1 + count7(n);
         } else {
            n = n / 10;
            return count7(n);
        } 

    } 

    //count how many times hi occurs
    public static int countHi(String str) {
        if(str.length() == 0) {
            return 0;
        } else {
            if(str.charAt(0) == 'h') {
                if(str.charAt(1) == 'i') {
                    return 1 + countHi(str.substring(2));
                } else {
                    return countHi(str.substring(1));
                }  
            } else {
                return countHi(str.substring(1));
            }
        }
    }   


    public static String changePi(String str) {


        if(str.length() == 0 ) {
            return "";
        } else {
            if(str.charAt(0) == 'p') {
                if(str.charAt(1) == 'i') {
                    return "3.14" + changePi(str.substring(2));
                } else {
                    return str.charAt(0) + str.charAt(1) + changePi(str.substring(1));
                }
            }else {
                return str.charAt(0) + changePi(str.substring(1));
            }
        }

    }

    











    public static void main(String[] args) {
        System.out.println(countHi("xxhixxhii"));
    }





}



