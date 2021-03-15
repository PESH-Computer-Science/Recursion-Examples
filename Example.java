// Generate all Strings of length 3 containing 0s, 1s, and 2s.

public class Example {
    public static void recurse(String s){
        if(s.length() == 3){
            System.out.println(s);
        }else{
            recurse(s + "0");
            recurse(s + "1");
            recurse(s + "2");
        }
    }
    public static void main(String[] args) {
        recurse("");
    }
}
