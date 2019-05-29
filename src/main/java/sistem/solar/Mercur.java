package sistem.solar;


public class Mercur extends sistem.solar.SistemSolar implements Soare {

    long temperatura;


    Mercur (long temperatura) {

        this.temperatura = temperatura;
    }


    public void luminaSolara () {

        System.out.println("Mercur - LuminaSolara");
    }


    void show () {

        System.out.println("Mercur - Show");
    }


    void heatUp () {

        System.out.println("Mercur - HeatUp");
    }

    public void luminasolara() {

    }
}


