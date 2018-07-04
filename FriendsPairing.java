public class FriendPairing{

     public static void main(String []args){
        System.out.println(pairs(5));
     }
     
     public static int pairs(int n){
         if(n<=2)
            return n;
        return pairs(n-1) + pairs(n-2)*(n-1);
     }
}
