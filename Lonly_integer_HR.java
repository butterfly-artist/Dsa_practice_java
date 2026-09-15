public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    int xor=a.get(0);
    for(int i=1;i<a.size();i++){
        xor^=a.get(i);
    }return xor;

    }