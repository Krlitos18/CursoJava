class EjerUnoA{

    int x = 0;

    int contarLetra(String letra, char le){

                    for(int i=0;i<letra.length(); i++){
                        
                        if (le == letra.charAt(i)){
                        
                            x= x+1;

                        }                        
                    }
    return x ;                
    }
} 