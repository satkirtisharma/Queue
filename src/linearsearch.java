public class linearsearch {
    public static void main(String[] args) {
        int arr []={2,3,1,4,5,24,6,34,74,4};
        int k=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("present at index "+i);
            }
        }
    }
}
