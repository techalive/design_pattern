package c_operational.mediator_demo.emergency;

public class EmergencyMain {
    public static void main(String[] args) {
        Police police = new Police();
        FireDepartment fireDepartment = new FireDepartment();
        AmbulanceService ambulanceService = new AmbulanceService();

        String accident1 = "Bus crash on Legnicka - Kwiska cross";
        police.call(accident1);
        ambulanceService.call(accident1);
        fireDepartment.call(accident1);

        String accident2 = "Fire, Chełmońskiego 12";
        police.call(accident2);
        ambulanceService.call(accident2);
        fireDepartment.call(accident2);
    }
}
