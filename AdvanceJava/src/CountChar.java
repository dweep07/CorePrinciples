import java.util.*;
class CountChar {
    public static void main(String args[] ) throws Exception {
        String Input = "Madam";
        Map<Character,Integer> counterMap = new HashMap<Character,Integer>();
        for(char current : Input.toLowerCase().toCharArray()){
            if(!counterMap.containsKey(current)){
                counterMap.put(current, 1);
            }
            else{
                counterMap.put(current, counterMap.get(current)+1);
            }
        }
        
        System.out.println(counterMap);
    }
}