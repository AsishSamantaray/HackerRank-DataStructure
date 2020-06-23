static int minimumLoss(long[] price) {
    Map<Long, Integer> map = new HashMap<>();

    for(int i = 0 ; i < price.length ; i++){
        map.put(price[i], i);
    }

    System.out.println(map);
    Arrays.sort(price);
    
    long minimum = Long.MAX_VALUE;
    for(int i = price.length - 1 ; i > 0 ; i--){
        if(map.get(price[i]) < map.get(price[i - 1])){
            minimum = Math.min(price[i] - price[i - 1], minimum);
        }
    }

    return (int)minimum;
}
