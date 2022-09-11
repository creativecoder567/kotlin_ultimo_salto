public class Test {

    public static void main(String[] arg){

        //
        String str="vinoth";

        char[] chars= new char[]{'v','i','n','i','v'};


        for (int i = 0; i < chars.length/2; i++) {

            if (chars[i]!=chars[chars.length - i - 1]) {
                char temp = chars[i];
                chars[i] = chars[chars.length - i - 1];
                chars[chars.length - i - 1] = temp;
            }
        }
        System.out.println(chars);




    }
}
