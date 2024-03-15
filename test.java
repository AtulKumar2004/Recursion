public class test {
    public static void removeDuplicates(String str,int idx,String newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr+currChar, map);
        }
    }
    public static void main(String args[]){
        removeDuplicates("appnnacollege", 0,"",new boolean[26]);
    }
}

    
