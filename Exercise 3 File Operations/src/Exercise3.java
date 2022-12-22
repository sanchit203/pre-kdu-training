import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.csv"));
        input.useDelimiter(", ");
        HashMap<String, Integer> map = new HashMap<>();
        while(input.hasNext())
        {
            String name = input.next();
            if(map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            }
            else{
                map.put(name, 1);
            }
        }

        PriorityQueue<String> pq= new PriorityQueue<>((string1, string2) -> map.get(string1) - map.get(string2));

        for(String ele : map.keySet())
        {
            pq.add(ele);
            if(pq.size()>3)
                pq.poll();
        }

        String[] ans = new String[3];
        for(int k = 2;k>=0;k--)
            ans[k] = pq.poll();

        for(int k = 0;k<3;k++)
            System.out.println(ans[k]);
    }
}