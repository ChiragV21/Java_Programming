import java.util.*;
public class Main{
    public static void main(String args[]){
        HashSet<String> mpp=new HashSet<String>();
        mpp.add("gfg");
        mpp.add("tmkoc");
        mpp.add("tuf");
        
        System.out.println(mpp);
        
        if(mpp.contains("tuf"))
            System.out.println("Take U Forward");
        else
            System.out.println("Good Bye");
            
        Iterator<String> i=mpp.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        
        System.out.println(mpp.size());
        
        mpp.remove("tuf");
        
        if(mpp.contains("tuf"))
            System.out.println("Take U Forward");
        else
            System.out.println("Good Bye");
            
        System.out.println(mpp.size());
        
        for(String s:mpp){
            System.out.print(s+" ");
        }
        
        mpp.clear();
        System.out.println(mpp.size());
        
    }
}
