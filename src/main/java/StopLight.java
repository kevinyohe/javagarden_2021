public class StopLight {

    public StopLight(){

    }
    public void changeLight(Light currentLight){
        if(currentLight == currentLight.GREEN){
            System.out.println("GREEN MEANS GO");
        }else if (currentLight == currentLight.YELLOW){
            System.out.println("Light will change soon!");
        }else if (currentLight == currentLight.RED){
            System.out.println("STOP!!");
        }
    }
}
