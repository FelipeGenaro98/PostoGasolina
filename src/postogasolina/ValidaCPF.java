package postogasolina;

public class ValidaCPF {
    
    public static String valida(String CPF) {
    	
    	String str = CPF.replace(".", "").replace("-", "");
    	String r="invalido";
        
        if (str.length() != 11) {
            //System.out.println("tamanho invalido");
        }else {
        	
        	if(str.contentEquals("00000000000")||str.contentEquals("11111111111")||
        	   str.contentEquals("22222222222")||str.contentEquals("33333333333")||
        	   str.contentEquals("44444444444")||str.contentEquals("55555555555")||
        	   str.contentEquals("66666666666")||str.contentEquals("77777777777")||
        	   str.contentEquals("88888888888")||str.contentEquals("99999999999")) {
        		//System.out.println("cpf inválido");
        	}else {
 
        		int i, soma=0, r1, r2, mult=10;
        
        		// 10º digito
        		for (i=0; i<9; i++) {                      
        			soma += ((str.charAt(i)-48) * mult); //-48 porque tabela ASCII
        			mult--;
        		}
        		r1 = 11 - (soma % 11);
        		if ((r1 == 10) || (r1 == 11)) {
        			r1 = 0;
        		}
        		if (r1 != Integer.parseInt(""+str.charAt(9))) {
        			//System.out.println("primeiro numero invalido");
        		} else {
        		// 11º digito
        			soma = 0;
        			mult = 11;
        			for (i=0; i<10; i++) {                      
        				soma += ((str.charAt(i)-48)* mult);
        				mult--;
        			}
        			r2 = 11 - (soma % 11);
        			if ((r2 == 10) || (r2 == 11)) {
        				r2 = 0;
        			}
        			if (r2 != Integer.parseInt(""+str.charAt(10))) {
        			//System.out.println("segundo numero invalido");
        			}else {
        				r="valido";
        			}
        		}
        	}
        }
		return r;
    }
          
}
