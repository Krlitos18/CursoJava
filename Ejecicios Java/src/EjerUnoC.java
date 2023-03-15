public class EjerUnoC {
    
    int datos(int a, int b, int c, int d){
        int[] vector = {a,b,c};
        int x= 0;

        for(int i=0; i<vector.length;i++){
            if (vector[i]>d){
                x=vector[i]+x;
            }
        }
        return x;   
    }
}
