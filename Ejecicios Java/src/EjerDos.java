public class EjerDos { /*CODIFICADOR Y DECODIFICADOR */

    /**
     * @param valor
     * @param paso
     * @return
     */
    String codificacion(String valor, int paso, boolean codificar){

        String abe = " abcdfghijklnmñopqrstuvwxyz";

        String codificado = " ";

            for(int i=0;i<valor.length();i++){
                
                for(int j=0;j<abe.length();j++){
                    
                    if (codificar){

                        if (valor.charAt(i)==abe.charAt(j)){
                            
                        codificado = codificado + abe.charAt(j+paso);
                        }
                    }
                    else{
                        if (valor.charAt(i)==abe.charAt(j) && (j-paso > 0)){
                            
                            codificado = codificado + abe.charAt(j-paso);
                        }
                    }
                }

            }
    return codificado;    

    }

}
