package 女娲造人;

public class Person {
    public static Nvwa getNvwa(String arg) {
        Nvwa giao=null;
        if(arg.equalsIgnoreCase("man")){
            giao=new man();
        }
        else if(arg.equalsIgnoreCase("woman")){
         giao=new woman();
        }
        else if(arg.equalsIgnoreCase("robot")){
            giao=new robot();
        }
        return giao;
    }

}
