import java.util.Scanner;
class Tile{
    int edgeLength;
    void getTile(int edgeLength){
        this.edgeLength=edgeLength;
    }
}
class Floor extends Tile{
    int length;
    int width;
    int total;

    void totalTiles(int edgeLength,int length,int width){
        getTile(edgeLength);
        this.length=length;
        this.width=width;
    }
    void calTiles(){
        total=(length*width)/edgeLength;
    }
    void show(){
        System.out.println(total+" tiles are required");
    }
}
class fortyTwo{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Floor f=new Floor();
        System.out.println("Enter tile edgeLength");
        int tl=s.nextInt();
        System.out.println("Enter tile floor length");
        int fl=s.nextInt();
        System.out.println("Enter tile floor width");
        int fw=s.nextInt();

        f.totalTiles(tl,fl,fw);
        f.calTiles();
        f.show();
    }
}