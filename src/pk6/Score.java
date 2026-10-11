package pk6;
class Score {

    int points = 10;

    void change(int points) { // jo points = points+5 > yeh basically params wale points ko refer karta hai
        points = points + 5; // 9

        System.out.println("Parameter: " + points); // 9

        this.points += points; // 19
    }

    void change(double points) {
        this.points += (int) points; // this.points instance wale points hai and jo (int)points hai woh params k points hai.

        System.out.println("Double parameter: " + points);
    }

    void identify(int value) {
        System.out.println("Integer method: " + value);
    }

    void identify(double value) {
        System.out.println("Double method: " + value);
    }

    void identify(char value) {
        System.out.println("Character method: " + value);
    }

    void showPoints() {
        System.out.println("Object points: " + points);
    }
}
