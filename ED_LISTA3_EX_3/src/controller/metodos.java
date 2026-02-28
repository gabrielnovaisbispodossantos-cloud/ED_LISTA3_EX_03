package controller;

public class metodos {
 public metodos () {
   super ();
   }
   public String inverter(String s) {
     //Condição de parada:
     // Se a string tiver tamanho 0 ou 1, já está invertida
        if(s.length() <= 1){
        return s;
  }
      // Relação de chamada:
      // último caractere + inversão do restante
        return s.substring(s.length() - 1) +
       inverter(s.substring(0, s.length() - 1));
}
}
