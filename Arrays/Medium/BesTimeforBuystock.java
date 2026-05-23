public class BesTimeforBuystock {
    public static void main(String[] args) {
        int arr[] = {7,1,4,8,4};
        int maxprofit =0;
        int byprice = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            byprice = Math.min(byprice,arr[i]);

            int profit = arr[i]- byprice;

            maxprofit = Math.max(maxprofit, profit);
        }
        System.out.println(maxprofit);
    }

    
}
