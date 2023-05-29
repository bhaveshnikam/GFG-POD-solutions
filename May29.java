ArrayList<String> CamelCase(int N,String[] Dictionary,String Pattern){
        //code here
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<Dictionary.length;i++){
            int k=0;
            for(int j=0;j<Dictionary[i].length();j++){
                if(k<Pattern.length() && Dictionary[i].charAt(j)==Pattern.charAt(k))k++;
                else if(Dictionary[i].charAt(j)>='A' && Dictionary[i].charAt(j)<='Z')break;
            }
            if(k==Pattern.length())ans.add(Dictionary[i]);
        }
        if(ans.isEmpty())ans.add("-1");
        Collections.sort(ans);
        return ans;
    }
