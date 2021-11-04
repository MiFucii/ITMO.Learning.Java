package LabWorking.Classes_Object2;

public class Airplane {

    public class Wing {
        private int weight;

        public Wing(int weight) {this.weight = weight;}

        public void PrintWeight(){
            System.out.printf("Имеет вес %d кг.", weight);
        }
    }
}
