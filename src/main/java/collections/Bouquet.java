package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

    public class Bouquet {
        public static void main(String[] args) {
            List<Flower> bouq = new ArrayList<>();
            bouq.add(new Flower("Rose",2.0, 50, 2));
            bouq.add(new Flower("Tulip", 0.6, 40, 1));
            bouq.add(new Flower("Gladiolus", 0.8, 70, 3));
            bouq.add(new Flower("Hyacinth", 0.4, 30, 4));
            bouq.add(new Flower("Oxeye daisy", 0.25, 40, 3));

            List<Flower> result;

            double bouquetCost=0.;

            Iterator<Flower> flowerIterator = bouq.iterator();

            while(flowerIterator.hasNext())
                bouquetCost+=flowerIterator.next().getCost();

            System.out.println(bouq);

            bouq.sort((o1, o2) -> o1.getFreshness()-o2.getFreshness());

            System.out.println(bouq);

            int minLength = 60;
            int maxLength=70;
            int flowerLengt;

            flowerIterator = bouq.iterator();
            Flower tmpFlower;
            while(flowerIterator.hasNext()) {
                tmpFlower=flowerIterator.next();
                flowerLengt = tmpFlower.getLngth();
                if (flowerLengt >= minLength && flowerLengt <=maxLength )
                    System.out.println(tmpFlower.toString());
            }

            result = bouq.stream().filter(flower -> (flower.getLngth() >= 40 && flower.getLngth() <= 50)).collect(Collectors.toList());

            System.out.println(result);

            System.out.format("The cost of bouquet: %.2f%n", bouquetCost);
        }
    }
