import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for(int i=0;i<10;i+=1) {
            names.add(input.next());
        }
        System.out.println("List Contains:");
        HashSet<String> st = new HashSet<>();
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i=0;i<10;i++)
        {
            String curString = names.get(i);
            System.out.println(curString);
            st.add(curString);
            if(mp.containsKey(curString)) {
                mp.put(curString, mp.get(curString) + 1);
            }
            else{
                mp.put(curString, 1);
            }
        }
        System.out.println();
        System.out.println("Set Contains:");
        for(String ele: st)
        {
            System.out.println(ele);
        }
        System.out.println();
        System.out.println("Frequency of the words:");
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String name = entry.getKey();
            Integer count = entry.getValue();
            System.out.println("Word = " + name + ", Frequency = " + count);
        }
    }
}