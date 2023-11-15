public class link_objects_bike {
    private String company_name;
    private int engine_cc;

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public  String getCompany_name(){
        return company_name;
    }

    public void setEngine_cc(int engine_cc) {
        this.engine_cc = engine_cc;
    }

    public int getEngine_cc() {
        return engine_cc;
    }

    public link_objects_bike(String company_name, int engine_cc){
        this.company_name = company_name;
        this.engine_cc = engine_cc;
    }
    public void display_bike_details(){
        System.out.println("Company name: "+this.getCompany_name());
        System.out.println("Engine cc: "+this.getEngine_cc());
    }
}
