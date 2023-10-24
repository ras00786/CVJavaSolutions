import java.util.*;

class RomanToIntegerProgram 
{
    public static int convertRomanToInteger(String str) 
    {
        if(str==null || str.length()<=0) 
        {
            return 0;
        }
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int result=0;
        for(int i=0;i<str.length()-1;i++) 
        {
            char ch1=str.charAt(i);
            char ch2=str.charAt(i+1);
            if(m.get(ch1)>=m.get(ch2)) 
            {
                result+=m.get(ch1);
            }
            else {
                result-=m.get(ch1);
            }
        }
        result+=m.get(str.charAt(str.length()-1));
        return result;
    }
    
    public static void main(String[] args) 
    {
        String s="IV";
        int result=convertRomanToInteger(s);
        System.out.println(result);
    }
}