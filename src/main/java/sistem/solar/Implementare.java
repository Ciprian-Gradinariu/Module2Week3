package sistem.solar;


   public class Implementare {

       public static void main (String[] args) {

           Terra terra = new Terra("20000 mc2");
           sistem.solar.Mercur mercur = new sistem.solar.Mercur(1000000);


           terra.coolDown();
           terra.luminaSolara();
           terra.showDegrees();

           mercur.heatUp();
           mercur.luminaSolara();
           mercur.show();
       }

}
