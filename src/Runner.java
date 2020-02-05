public class Runner {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 5));
        System.out.println(helloName("Safiya"));
        System.out.println(stringSplosion("Code"));
        int[] a = {1,2,3};
        System.out.println(sum3(nums = a));
        System.out.println(cigarParty((30, false)));
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(bobThere("abcdefbob"));
        System.out.println(equalIsNot("notnotnot"));
        int[] b = {0,2,4};
        System.out.println(lucky13(nums = b));
        int c = {1,2,1,1,3}
        System.out.println(maxSpan(nums = c));

    }


    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking == true && hour < 7 || talking == true && hour > 20) {
            return true;
        } else {
            return false;
        }
    } // warm up 1

    public static String helloName(String name) {
        return "Hello " + name + "!";
    } // string 1

    public static String stringSplosion(String str) {
        String newString = "";
        for (int i = 0; i < str.length() + 1; i++ ;){
            newString += str.substring(0, i);
        }
        return newString;
    } // warm up 2

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    } // array 1

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60 && !isWeekend) {
            return true;
        }
        if (cigars >= 40 && isWeekend) {
            return true;
        } else {
            return false;
        }
    } // logic 1

    public static int noTeenSum(int a, int b, int c) {
        if (a >= 13 && a < 15 || a > 16 && a <= 19) {
            a = 0;
        }
        if (b >= 13 && b < 15 || b > 16 && b <= 19) {
            b = 0;
        }
        if (c >= 13 && c < 15 || c > 16 && c <= 19) {
            c = 0;
        }
        int sum = a + b + c;
        return sum;
    } // logic 2

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
                return true;
            }
        }
        return false;
    } //string 2

    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;

        for(int i = 0; i <= str.length() - 3; i++) {
            if(str.substring(i, i + 2).equals("is")) {
                is+= 1;
            } else if(str.substring(i, i + 3).equals("not")) {
                not += 1;
            }
        }

        if(str.length() >= 2 && str.substring(str.length() - 2).equals("is"))
            is += 1;

        return is == not;
    } // string 3

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    } // array 2

    public static int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; i++) {
            int length = nums.length - 1;
            while(nums[i] != nums[length]){
                length -= 1;
            }
            int span = length - i + 1;
            if(span > max){
                max = span;
            }

        }
        return max;
    } // array 3

}