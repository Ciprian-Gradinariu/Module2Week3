package sistem.solar;

public class Terra extends sistem.solar.SistemSolar implements Soare {

    String atomosfera;


    Terra (String atomosfera) {

        this.atomosfera = atomosfera;
    }


    public void luminaSolara () {

        System.out.println("Terra - LuminaSolara");
    }


    void showDegrees () {

        System.out.println("Terra - ShowDegrees");
    }


    void coolDown () {

        System.out.println("Terra - CoolDown");
    }

    public void luminasolara() {

    }
}
