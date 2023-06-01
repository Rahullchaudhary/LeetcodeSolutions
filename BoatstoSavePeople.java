import java.util.*;
public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int fi = 0, li = people.length - 1;
        while( fi <= li){
            if(people[fi] + people[li] <= limit)
                fi++;
            li--;
            count++;
        }
        return count;
    }
}
