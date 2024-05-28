public class P_2418 {
    public String[] sortPeople(String[] names, int[] heights) {
           
        for(int i = 0 ; i < heights.length ; i++){
            for(int j = 0 ; j < names.length ; j++){
                if(heights[i] < heights[j]){
                    int temp_1 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp_1;

                    String temp_2 = names[i];
                    names[i] = names[j];
                    names[j] = temp_2;
                }
            }
        }

        return names;
        
    }
}
