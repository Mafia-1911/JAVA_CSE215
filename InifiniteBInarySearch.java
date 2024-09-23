class InifiniteBinarySearch {
     public int[] infiniteArr;

     public InifiniteBinarySearch() {
         int[] infiniteArr = new int[100];
    }
    public void search(int[] arr,int value){
         int start=0;
         int end=1;

         while(start<end){
             int mid=(start+end)/2;
             if(arr[mid]==value){
                 System.out.println("Value found at index: "+ mid);
             }else if(value<arr[end]){
                 end=end-1;
             }else{
                 start=end+1;
                 end=end*end;
             }
         }

    }

     public static void main(String[] args) {

     }

}
