public class Main {
    public static void main(String[] args) {

        Participant[] participants = {new Cat(11, 10), new Human(9, 9), new Robot(22, 12)};
        Obstacles[] obstacles = {new Wall(10), new Treadmill(11), new Wall(20), new Treadmill()};

        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i].getClass() + " начинает соревнование:");
            for (int j = 0; j < obstacles.length; j++) {
                if(obstacles[j].getMaxHeight() > participants[i].getMaxJump() || obstacles[j].getMaxLenght() > participants[i].getMaxRun()) {
                    System.out.println("Испытание провалено. " + participants[i].getClass() + " проиграл.");
                    break;
                } else {
                    System.out.println(participants[i].getClass() + " прошел " + obstacles[j].getClass() + " и переходит к следующему испытанию");
                }
            }
            System.out.println("----------------------------------");
        }
    }
}
