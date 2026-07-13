class Main {
    public static void main(String[] args) {
        int [] arr={98,9876,765,89,89,999};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
