class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result= new ArrayList();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=0; j<word.length(); j++){
            if(word.charAt(j)==x){
                result.add(i);
                break;
            }
        }
    }
    return result;
}
}
