public class Code
{
    public static void main(String[] args) {
        int[] arr={1,2,3};
        while(arr.length!=1){
            int j=0;
            int[]brr=new int[(arr.length/2)];
            for(int i=1;i<arr.length;i=i+2)
            {
                brr[j]=arr[i];
                j++;
            }
            arr=brr;

        }
        System.out.print(arr[0]);
    }
}

