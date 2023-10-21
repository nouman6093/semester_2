public class account_accountHolder extends account_account {
    private String name;
    private int cnic;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCnic(){
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }
}
