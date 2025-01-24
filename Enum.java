//Enums are class (but you cannot etentend it) Are used to creating contstants on java.
enum Laptop{
    ThinkPad(3000), Hp(2000), Macbook(5000), Surface;
    private int price;

    Laptop(){
        this.price=6000;
    }
    Laptop(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
public class Enum {
    public static void main(String[] args) {
       Laptop[] res=Laptop.values();

       for( Laptop re:res){
        System.out.println(re.ordinal() +" :"+ re + " : "+ re.getPrice() );
       }
        //System.out.println(s.ordinal());

        //using If statements with Enums

        Laptop r=Laptop.Hp;
        if(r==Laptop.Hp){
            System.out.println(r + " "+ r.getPrice());
        }
        else if(r==Laptop.Macbook){
            System.out.println(r + " " + r.getPrice());
        }
        else{
            System.out.println("Others");
        }

        //using it with switch
        switch (r) {
            case Macbook:
                System.out.println(r + " " +r.getPrice());
                break;
            case Hp:
                System.out.println(r + " " + r.getPrice());
                break;

            default:
            System.out.println("Others");
                break;
        }
    }
}
