public class q17_fetch_remaining_string {
    public static void main(String[] args){
        String a = "How and what happened";
        System.out.println(a.indexOf(args[0]));
        // System.out.println(a.subSequence(a.indexOf(args[0] + args[0].length() + 1, a.length())));
    }
}
