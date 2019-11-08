package collections;

public class Flower {
        private String name;
        private double cost;
        private int length;
        private int freshness;

        public Flower(String nm, double cst, int lng, int fresh)
        {
            name = nm;
            cost = cst;
            length = lng;
            freshness = fresh;
        }

        double getCost(){
            return cost;
        }

        void setCost( double cst){
            cost = cst;
        }

        int getLngth(){
            return length;
        }

        int getFreshness()
        {
            return freshness;
        }

        @Override
        public String toString() {
            return name;
        }
    }

