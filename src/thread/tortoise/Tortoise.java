package thread.tortoise;
import javax.swing.*;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;
    public void run() {

        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0 -> System.out.println("Tortoise has started from the start line!");
                case 1 -> System.out.println("Tortoise has reached the Cool River!");
                case 2 -> System.out.println("Tortoise has reached the Mountain Hill!");
                case 3 -> System.out.println("Tortoise has reached the Big Oak Tree!");
                case 4 -> System.out.println("Tortoise has reached the finish line!");
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
