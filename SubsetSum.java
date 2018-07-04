public class SubsetSum{

     public static void main(String []args){
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubSet(set, n, sum) == true)
            System.out.println("Found a subset"
                          + " with given sum");
        else
            System.out.println("No subset with"
                               + " given sum");
     }
     
     public static boolean isSubSet(int set[], int n, int sum){
        if(sum==0)
            return true;
        if(n==0 && sum!=0)
            return false;
        return isSubSet(set,n-1,sum) || isSubSet(set,n-1,sum-set[n-1]);
     }
}
