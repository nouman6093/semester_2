public class link_objects_owner {
    private String name;
    int cnic;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public int getCnic() {
        return cnic;
    }

    link_objects_bike bike_object;
    public link_objects_owner(String name, int cnic, String company_name, int engine_cc){
        this.name = name;
        this.cnic = cnic;
        this.bike_object = new link_objects_bike(company_name, engine_cc);
    }
    public void display_owner_details(){
        System.out.print("Owner name: "+name);
        System.out.print("Owner cnic: "+cnic);
    }
}
