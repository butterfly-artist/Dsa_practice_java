class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0.0;
        int n=prices.length;
        int m=discounts.length;
        for(int i=0;i<n;i++){
            int price=prices[n-1-i];
            if(i<m){
                int discount=discounts[m-1-i];
                total+=price*(100.0 - discount)/100.0;
                
            }else{
                total+=price;
            }
        }
        return total;
    }
}
