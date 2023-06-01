import java.util.*;
public class SuccessfulPairsofSpellsandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s=spells.length,p=potions.length;
        int[] pairs=new int[s];
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int spell=spells[i];
            int first=0,last=p-1;
            while(first<=last){
                int mid=first+(last-first)/2;
                long product=(long)spell*potions[mid];
                if(product>=success){
                    last=mid-1;
                }
                else{
                    first=mid+1;
                }
            }
            pairs[i]=p-first;
        }
        return pairs;
    }
}
