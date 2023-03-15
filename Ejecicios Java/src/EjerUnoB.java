public class EjerUnoB{
    
    int [] ordenar(int a, int b,int c, boolean asce){
        int[] vector={a,b,c};
            for(int i=0; i<vector.length; i++){
                for(int j= i+1; j<vector.length; j++){

                    if (asce){
                        if(vector[i]>vector[j]){
                            int auxiliar = vector[i];
                            vector[i]=vector[j];
                            vector[j]=auxiliar;
                        }
                    }
                    else {
                        if(vector[i]<vector[j]){
                            int auxiliar = vector[i];
                            vector[i]=vector[j];
                            vector[j]=auxiliar;
                        }
                    }

                }

                
            }
    return vector;
    }


}