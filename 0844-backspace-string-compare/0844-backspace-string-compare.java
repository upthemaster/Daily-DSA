class Solution { //Approach : Two Pointer
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        while(i >= 0 || j >= 0){
            i = nextValIdx(s, i);
            j = nextValIdx(t, j);

            if(i >= 0 && j>= 0){
                if(s.charAt(i) != t.charAt(j)){
                    return false;
                }
            }
            else if(i >= 0 || j >= 0){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    private int nextValIdx(String str, int index){
        int skip = 0;

        while(index >= 0){
            if(str.charAt(index) == '#'){
                skip++;

            }
            else if(skip > 0){
                skip--;
            }
            else {
                break;
            }
            index--;
        }
        return index;
    }
}