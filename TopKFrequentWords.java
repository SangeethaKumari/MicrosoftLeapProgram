class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        for(String word : words){
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

        }
        TreeMap<Integer,List<String>> treeMap = new TreeMap<Integer,List<String>>(Collections.reverseOrder());
       // TreeMap<Integer,List<String>> treeMap = new TreeMap<Integer,List<String>>();
        for(Map.Entry<String,Integer> entry : wordMap.entrySet()){
            List<String> wordList = treeMap.getOrDefault(entry.getValue(), new ArrayList<String>());
                wordList.add(entry.getKey());
                treeMap.put(entry.getValue() , wordList);

        }

        /**Set<String> frequentWords = new HashSet<String>();

        for(Map.Entry<Integer,List<String>> entry : treeMap.entrySet()){
            List<String> wordList = entry.getValue();
                frequentWords.addAll(wordList);
                 if(frequentWords.size() >= k){
                    break;
           }
        }*/

        List<String> frequentWords = new ArrayList<String>();

        for(Map.Entry<Integer,List<String>> entry : treeMap.entrySet()){
            List<String> wordList = entry.getValue();
             Collections.sort(wordList); 
                frequentWords.addAll(wordList);
                 if(frequentWords.size() >= k){
                    break;
           }
        }  
       // Collections.sort(frequentWords); 
       /**  List<String> frequentWords2 = new ArrayList<String>();

        for(String word : words){
            if(frequentWords.contains(word)){
                frequentWords2.add(word);
                frequentWords.remove(word);
            }
                
        }*/

    return frequentWords;


    }
}
