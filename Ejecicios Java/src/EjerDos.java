public class EjerDos {

    /**
     * @param valor
     * @param paso
     * @return
     */
    String codificacion(String valor, int paso){

        String abe = " abcdfghijklnmñopqrstuvwxyz";

        String codificado = " ";

            for(int i=0;i<valor.length();i++){
                
                for(int j=0;j<abe.length();j++){

                    if (valor.charAt(i)==abe.charAt(j)){
                        
                       codificado = codificado + abe.charAt(j+paso);
                    }
                }

            }
    return codificado;    

    }

}
