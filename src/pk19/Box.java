package pk19;

public class Box {

    // Constructor OverLoading

    int length;
    int width;

    Box(){
        length = 0;
        width= 0;
    }

    Box(int side){
        length = side;
        width = side;

    }

    Box(int l,int w){
        length = l;
        width = w;
    }

}
