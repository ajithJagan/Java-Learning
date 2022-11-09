package Practice;


import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate {

    public static void main(String[] args) {

        int a[] = {10,10,20,30,10,20,10,10,10,20,30,10,20,10,10,10,20,30,10,20,10,10,10,20,30,10,20,10,40,40};
        Duplicate duplicate = new Duplicate();
        duplicate.count(a);
    }

    void count(int a[]) {

        Map<Integer, Integer> num = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            int viewCount = 1;
            if (!num.containsKey(a[i])) {    //Here I'm doing remove duplicate key..
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j])
                        num.put(a[i], viewCount = viewCount + 1);
                }
            }
        }
        System.out.println("Duplicate values is : " + num);
    }
}

