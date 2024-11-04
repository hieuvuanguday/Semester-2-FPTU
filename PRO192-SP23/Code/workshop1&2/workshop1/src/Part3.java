import java.util.*;

public class Part3 {
    public static String toTitleCase(String input){
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;
        for(char c: input.toCharArray()){
            if(Character.isSpaceChar(c)){
                nextTitleCase = true;
            }else if(nextTitleCase){
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        
        return titleCase.toString();
    }
    public static void main(String[] args) {
//        String[] list = new String[10];
//        for (int i = 0; i < 10; i++) {
//            Scanner sc = new Scanner(System.in);
//            list[i] = sc.nextLine();
//        }
//        for (int i = 0; i < 10; i++) {
//            list[i] = toTitleCase(list[i]);
//            System.out.println(list[i]);
//        }
        Stack<Character> st = new Stack();
        String input = "Good*Morni***ng";
        for (Character c : input.toCharArray()) {
            if(c =='*' ){
                st.pop();
            }else{
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());            
        }
        System.out.println("");
    }
}