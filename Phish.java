import java.io.*;
import java.util.*;
public class Phish {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int spam=0;
        System.out.println("-----Welcome to the Phish-Detector-----");
        System.out.println("Enter the sender's mail : ");
        String usermail=sc.nextLine().toLowerCase();
        System.out.println("Enter the subject : ");
        String sub=sc.nextLine().toLowerCase();
        System.out.println("Enter the Body : ");
        String body=sc.nextLine().toLowerCase();
        System.out.println("-----------------");
        System.out.println("Based On the provided details : ");
        if(!checkuser(usermail))
        {
            spam++;
            System.out.println("The email Likely to be spam based on the sender mail");
        }
        if (checksubject(sub))
        {
            spam++;
            System.out.println("The email Likely to be spam based on the subject of the body");
        }
        if(checkbody(body))
        {
            spam++;
            System.out.println("The email Likely to be spam based on body of the mail");
        }
        int per=(int)(((double)spam/3)*100);
        System.out.println("Spam Likelihood : " + per + "%");

        if(spam >=1)
        {
            System.out.println("Spam Mail detected !");
        }
        else 
        {
            System.out.println("Good to go !");
        }
        System.out.println("Note : This is not 100% accurate so better to check manually before blindly trusting this Thank you !");

        

    } 
    public static boolean checkbody(String text)
    {
        int count=0;
        try (BufferedReader br = new BufferedReader(new FileReader("keywords.txt"))) 
        {
            String keyword;
            while((keyword=br.readLine())!=null)
            {
                if(text.contains(keyword.trim().toLowerCase()))
                {
                count ++;
                }
            }
    }
    catch(IOException e)
    {
        System.out.println("error");
    }
    return count>=3;

}
    public static boolean checkuser(String user){
        return user.matches("^[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$");
    }

    public static boolean checksubject(String body)
    {
        int count=0;
        try (BufferedReader br = new BufferedReader(new FileReader("keywords.txt"))) 
        {
            String keyword;
            while((keyword=br.readLine())!=null)
            {
                if(body.contains(keyword.trim().toLowerCase()))
                {
                count ++;
                }
            }
    }
    catch(IOException e)
    {
        System.out.println("error");
    }
    return count>=2;

    }
}
