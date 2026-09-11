 public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code 
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<queries.size();i++){
        int count=0;
        for(int j=0;j<stringList.size();j++){
            if(queries.get(i).equals(stringList.get(j))){
                count++;
            }
        }list.add(count);
    }
    return list;
    }
//cheat day 11.09.2026
