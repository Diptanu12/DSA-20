import java.util.ArrayList;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
       int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;
        int[]ans= RearrangebySign(arr,n);
        for (int i = 0; i < n; i++) {

            System.out.print(ans[i]+" ");
        }
    }
static int[] RearrangebySign(int a[], int n){

    ArrayList<Integer> pos=new ArrayList<>();
    ArrayList<Integer> neg=new ArrayList<>();

    for(int i=0;i<n;i++){
        if(a[i]>0){
          pos.add(a[i]);
        }else{
            neg.add(a[i]);
        }
    }
    for(int i=0;i<n/2;i++){
        a[2*i]=pos.get(i);
        a[2*i+1]=neg.get(i);
    }
    return a;

    //optimal sol^n


}
}
