public class Costumer{
    private String name;
    private int costumerid;
    private String address;
    private long phoneno;
    public String getName(){
        return name;
    }
    public int getCostumerid(){
        return costumerid;
    }
    public String getAddress(){
        return address;
    }
    public long getPhoneno(){
        return phoneno;
    }
    public void setAddress(String a){
        address = a;

    }
    public void setPhoneno(long p){
        phoneno = p;
    }
    public Costumer(String name,int costumerid){

        this.name=name;
        this.costumerid=costumerid;
    }
    public Costumer(String name,int costumerid,String address){
        this.name =name;
        this.costumerid=costumerid;
        this.address=address;

    }
    public Costumer(String name,int costumerid,String address,long phoneno){
        this.name=name;
        this.costumerid=costumerid;
        this.address=address;
        this.phoneno=phoneno;
    }
    public static void main(String[] args) {
        Costumer c=new Costumer("ronit",12 );
        System.out.println("name is"+c.name);
        System.out.println("costumer id is "+c.costumerid);
    }
}