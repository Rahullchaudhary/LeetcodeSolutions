public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        for(int num:pushed){
            pushed[i++]=num;
            while(i>0 && pushed[i-1]==popped[j]){
                j++;
                i--;
            }
        }
        return i==0;
    }
}
