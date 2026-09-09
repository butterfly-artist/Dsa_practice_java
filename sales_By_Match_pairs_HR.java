public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(ar.get(i),map.getOrDefault(ar.get(i),0)+1);
        }
        int pairs=0;
        for(int par:map.values()){
            pairs+=par/2;            
        }
        return pairs;
    }