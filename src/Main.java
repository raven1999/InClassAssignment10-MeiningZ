import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Please enter a tweet:");
        String tweet=n.nextLine();

        if(tweet.length()>140){
            System.out.println("Please enter less than 140 characters");
            System.out.println("Excess characters:"+(tweet.length()-140));
        }

        else {
            System.out.println("Length Correct!");
            int hashtags=0, attributes=0,links=0;


            for(int i=0;i<=tweet.length()-1;i++){
                if (tweet.charAt(i)=='#'){
                    if((tweet.charAt(i+1)!='\t')&&(tweet.charAt(i+1)!=' ')){
                        hashtags++;
                    } }}
            System.out.println("Number of Hashtags: " + hashtags);

            for(int i=0; i<=tweet.length()-1;i++){
                if (tweet.charAt(i)=='@'){
                    if((tweet.charAt(i+1)!='\t')&&(tweet.charAt(i+1)!=' ')){
                        attributes++;
                    } }}
            System.out.println("Number of Attributes: " +attributes);

            for(int i=1;i<=tweet.length()-1;i++){
                String uppercase=tweet.toUpperCase();
                if (uppercase.substring(i).startsWith("HTTP://")) {
                    links++;
                }}
            System.out.println("Number of links: " +links);
        }
    }
}


